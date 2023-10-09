/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bignumbers;

import java.math.BigInteger;

/**
 *
 * @author AndreP
 */
public class BigInt {
    private static final char LESS = '-';
    
    private Node head;
    private byte sign;  // 1: Positive; -1: Negative
           
    
    // CONSTRUCTORS
    public BigInt(){
        this("");
    }   
    
    public BigInt(long value){
        this("" + value);
    }   
    
    public BigInt(String value){
    /*
        Consideramos que la cadena de entrada tiene uno o más dígitos opcionales,
        precedidos por el signo negativo
        FORMATO:
        [<signo menos>] <digito>+
        [ ] : Componente opcional
        + : Una o más repeticciones
        
        Nota: la cadena "0000345" es válida, pero el proceso de conversión
        ignorará los ceros precedentes. 
        Más detalles en la función extractPrecedentZeros
        */
    
        value.trim();
        // 1. Determinamos el signo, por defecto positivo (1)
        sign = +1;
        
        if (value.charAt(0) == LESS){
            sign = -1;
            value = value.substring(1); // Remueve el '-'
        }
        
        // 2. Extraemos los ceros precedentes
        value = extractPrecedentZeros(value);
        
        /*
        El número cero puede tener varias formas en la entrada de string 
        (Ej: "00000", "-000", "0")
        Internamente se representará como positivo, +0.
        `extractPrecedentZeros` ya returna la string nula, pero todavía no hemos
        anulado el negativo:
        */
        if(value.equals("0")){
            sign = +1;
        }
        
        // 3. Creamos la lista enlazada de grupos de tres dígitos
        head = new Node(); // Se crea un nodo temporal
        Node tail = head; 
        String digits;
        while(!value.equals("")){
            // Se calcula la localización del primer índice del substring
            // que consta de 3 dígitos o menos.
            int loc = Math.max(value.length() - Node.MAX_DIGITS, 0);
            
            digits = value.substring(loc); 
                                // Se extraen como máximo MAX_DIGITS dígitos (3)
                                // Si hay <3 dígitos, se corta todo

            // Actualizamos el número (sin el substring extraído previamente)
            value = value.substring(0,loc);
                                // En el caso de loc=0 se tiene una string ""
            
            
            Node block = new Node(digits);
            
            tail.next= block;
            tail = block;
        }
        head = head.next; // Remueve el nodo head ficticio inicial
            
    }   
    
    public BigInt (Node head){
        this.head = head;
        this.sign =  +1;
    }
   
    // ARITHMETIC OPERATIONS
    public BigInt sum(BigInt num){
        /* Se busca resolver los siguientes casos
         * 1: A +  B  -->  A + B
         * 2: A + -B  -->  A - B
         * 3:-A +  B  --> -(A - B)
         * 4:-A + -B  --> -(A + B)
         * Se concluye que se necesitan dos operaciones: 
         * suma positiva y resta básica (A > B)
         */
        
        // Caso 1: Suma positiva
        if (num.isPositive() && this.isPositive())
            return this.sumPos(num);

        // Caso 4: Se hace una suma positiva y se intercambia el signo, a negativo
        if (num.isNegative() && this.isNegative()) {
            BigInt result = this.sumPos(num);
            result.flipSign();
            return result;
        }
        // Caso 2 y 3: 
        //Primer paso, necesitamos conocer el mayor
        int newSign = this.compareTo(num);
                        // Si A>B, se mantiene el signo (Caso 2)
                        // Si A<B, el signo cambia después de la resta (caso 3)
        
        BigInt resultSubstraction;
        if (this.isPositive() & num.isNegative()){  //A es + y B -
            num.flipSign();
            resultSubstraction = this.subtractPos(num);
            num.flipSign();
        }
        else{  //A es - y B +
            this.flipSign();
            resultSubstraction = this.subtractPos(num);
            this.flipSign();
            if(newSign < 0)
                resultSubstraction.flipSign();
        }
        return resultSubstraction;
        
    }
    public boolean isPositive(){
        return this.sign > 0;
    }
    public boolean isNegative(){
        return this.sign < 0;
    }
    public void flipSign(){
        if (this.sign > 0)
            this.sign = -1;
        else this.sign= 1;
    }
    public BigInt sumPos(BigInt num){
        Node p, q, r, t;
        p = this.head;
        q = num.head;
        
        t = new Node(); //TEMP head
        r = t;
        short carry = 0;
        while(p != null && q != null){
            short sum = (short) (carry + p.value + q.value);
            
            r.next = new Node();
            r = r.next;
            
            r.value = (short) (sum % Node.MAX_VALUE);   //Calculo de la suma
            carry = (short) (sum / Node.MAX_VALUE);     //Calculo del acarreo
            
            // Siguientes 2 bloques a sumar
            p = p.next;
            q = q.next;
        }
        
        p = (p == null) ? q: p;  // Restablece p para apuntar 
                                 //a los bloques restantes
        
        while(p != null){
            r.next = new Node();
            r = r.next;
            
            r.value = (short) ((p.value + carry) % Node.MAX_VALUE);
            carry = (short) ((p.value + carry) / Node.MAX_VALUE);
            p = p.next;
        }
                       
        if(carry > 0){  //Desbordamiento
            r.next = new Node((short) carry);
        }
        return new BigInt(t.next);  //Quita el nodo cabeza ficticio
    }
    public BigInt subtract(BigInt num){
        num.flipSign();
        BigInt result = this.sum(num);
        num.flipSign();
        return result;
    }
    private BigInt subtractPos(BigInt num) {
        Node p, q, r, t;
        boolean esNegativo = false;

        // Siempre resta el más pequeño del mayor
        // Si num es mayor, entonces el resultado es negativo
        if (this.compareTo(num) >= 0) { // this - num
            p = this.head;
            q = num.head;
        } else { // -(num - this)
            p = num.head;
            q = this.head;
            esNegativo = true; 
       }

        t = new Node(); // Nodo cabeza ficticio
        r = t;

        short prestamo = 0, minuendo; // para L es un minuendo

        while (p != null && q != null) {
            r.next = new Node();
            r = r.next;
            
            minuendo = (short) (p.value - prestamo);
            
            if (minuendo < q.value) {
                r.value = (short) (Node.MAX_VALUE + minuendo - q.value);
                prestamo = 1;
            } else {
                r.value = (short) (minuendo - q.value);
                prestamo = 0;
            }
            
            p = p.next;
            q = q.next;
        }

        // restablece p para apuntar a los bloques restantes
        p = (p == null) ? q : p;
        
        while (p != null) {
            r.next = new Node();
            r = r.next;
            
            r.value = (short) (p.value - prestamo);
            if (r.value < 0) {
                r.value += Node.MAX_VALUE;
                prestamo = 1;
            } else {
                prestamo = 0;
            }
            
            p = p.next;
        }

        BigInt result = new BigInt(t.next); 
        result = result.extractPrecedentZeros(); 
        if (esNegativo) result.flipSign(); 
        
        return result;
    }
    public BigInt mult(BigInt num) {
        BigInt result = new BigInt("0");

        BigInt multiplicand = new BigInt(this.toString()); // Copia del primer número
        BigInt multiplier = new BigInt(num.toString()); // Copia del segundo número

        // Inicializar para operaciones intermedias
        BigInt temp;
        int shift = 0;

        Node p = multiplier.head;
        while (p != null) {
            // Multiplicar multiplicand por el dígito actual p.value de multiplier
            temp = singleDigitMult(multiplicand, p.value);
            // Desplazar el resultado intermedio adecuadamente
            for (int i = 0; i < shift; i++) {
                temp = temp.multiplyByBase();
            }
            result = result.sum(temp);
            shift++;
            p = p.next;
        }

        // Ajustar el signo según los operandos originales
        if (this.sign != num.sign) {
            result.flipSign();
        }

        return result;
    }

    // Multiplica un BigInt por un solo dígito
    private BigInt singleDigitMult(BigInt bigInt, short digit) {
        BigInt result = new BigInt();
        Node p = bigInt.head;
        Node tempHead = new Node();
        Node r = tempHead;
        short carry = 0;

        while (p != null) {
            long prod = (long) p.value * digit + carry;
            short resValue = (short) (prod % Node.MAX_VALUE);
            carry = (short) (prod / Node.MAX_VALUE);

            r.next = new Node(resValue);
            r = r.next;
            p = p.next;
        }

        // Si queda algún acarreo al final
        if (carry > 0) {
            r.next = new Node(carry);
        }

        result.head = tempHead.next; // Omitir nodo cabeza ficticio
        return result;
    }

    // Multiplica un BigInt por el valor base (para el desplazamiento en la multiplicación)
    private BigInt multiplyByBase() {
        Node newNode = new Node(); // Nodo para el nuevo valor base
        newNode.next = this.head;
        this.head = newNode;
        return this;
    }

    public BigInt div(BigInt num){
        return new BigInt();
    }
    
    public int compareTo(BigInt num){
        BigInt L = this;
        BigInt R = num;
        
        // Si tienen signos diferentes
        if (L.isPositive() && R.isNegative())
            return +1;
        if (L.isNegative() && R.isPositive())
            return -1;
        
        //Si tienen el mismo signo
        // Ojo: se usará una comparación por strings
        String Lstr = L.toString();
        String Rstr = R.toString();
        int result;
        int lengthL = Lstr.length();
        int lengthR = Rstr.length();
        
        //primero verifica la magnitud
        if(lengthL == lengthR)
            result = Lstr.compareTo(Rstr);
        else
            result = (lengthL < lengthR) ? -1 : +1;
        
        return L.sign * result;
        
    }
    
    @Override
    public String toString(){
        StringBuffer strBuf = new StringBuffer("");
        
        /*
        Digamos que tenemos el bloque de value = 7,
        si hay un bloque que le sigue (next diferente de null),
        se tiene que rellenar los ceros precedentes, esto es
        insertar la string "007" en el buffer
        */
        String format = "%0" + Node.MAX_DIGITS + "d";
        Node p = head;
        while (p.next != null){
            strBuf.insert(0, String.format(format, p.value));
            p = p.next; // Se recorre el siguiente bloque 
        }
        strBuf.insert(0, p.value);  // Se agrega el bloque más significativo
                                           // No se requiere rellenar con ceros
                                           
        if(sign < 0){   // Agregamos el signo si es negativo
            strBuf.insert(0, "-");
        }
        
        return strBuf.toString();
    }
    
    
    private static String extractPrecedentZeros(String str){
        StringBuffer strBuf = new StringBuffer(str);
        int length = strBuf.length();
        for(int i = 0; i < length; i++){
            if (strBuf.charAt(0) == '0') // Eliminamos el primer cero
                strBuf.deleteCharAt(0);
        }
        if(strBuf.length() == 0)
            strBuf.append('0');
        return strBuf.toString();
    }
    
    private BigInt extractPrecedentZeros(){
        String numStr = this.toString();
        String result = extractPrecedentZeros(numStr);
        if(result.equals("0"))
            return new BigInt(0);
        else if (result.length() < numStr.length())
            return new BigInt(result);
        else    
            return this;
    }
    
    public static void main(String[] args) {
//        BigInt [] eg = new BigInt[7] ;
//        eg[0] = new BigInt ("12345678") ;
//        eg[1] = new BigInt ("-45");
//        eg[2] = new BigInt ("419284312218947");
//        eg[3] = new BigInt ("-000000000000000000000");
//        eg[4] = new BigInt (123456789) ;
//        eg[5] = new BigInt (-45);
//        eg[6] = new BigInt (777);
//        for (int i = 0; i < eg.length; i++) {
//            System.out.println(i + ":\t" + eg[i].toString());
//        }
//        
//        //Trying arithmetic operations:
//        BigInt bsum = eg[0].sum(eg[6]);
//        System.out.println(bsum.toString() + "\t" + (12345678 + 777));
        
        
        // Comparing against BigInteger
        String[] strArray = {"-100005000",
            "-91827347300072817",
            "8000",
            "3283748300000",
            "-7",
            "100005000",
            "-2147483646",
            "2147480000",
            "-10000000000000000"
        };
        
        BigInt e1;
        BigInt e2;
        BigInt e3;
        BigInteger bi1;
        BigInteger bi2;
        BigInteger bi3;
        
        int errorCount  = 0;
        
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {   
                e1 = new BigInt(strArray[i]);
                e2 = new BigInt(strArray[j]);
                bi1 = new BigInteger(strArray[i]);
                bi2 = new BigInteger(strArray[j]);                
                
                // ------------ SUMS ------------ //
                e3 = e1.sum(e2);
                bi3 = bi1.add(bi2);
                
                if(bi3.compareTo(new BigInteger(e3.toString())) != 0){
                    errorCount++;
                    System.out.printf("Sum failed ");
                    System.out.println("for the pair i = " + i + "\t j = " + j);
                    System.out.println("Numbers:\te1:" + e1.toString() + "\t" + "e2:" + e2.toString());
                    System.out.println("Expected " + bi3.toString() + "\t, got " + e3.toString() + "\n");
                }
                
                // ------------ MULT ------------ //
//                e3 = e1.mult(e2);
//                bi3 = bi1.multiply(bi2);
//                
//                if(bi3.compareTo(new BigInteger(e3.toString())) != 0){
//                    errorCount++;
//                    System.out.printf("Multiplication failed ");
//                    System.out.println("for the pair i = " + i + "\t j = " + j);
//                    System.out.println("Numbers:\te1:" + e1.toString() + "\t" + "e2:" + e2.toString());
//                    System.out.println("Expected " + bi3.toString() + "\t, got " + e3.toString() + "\n");
//                }
                
            }
        }
        int totalOperations = (strArray.length * strArray.length) * 2;
        float successRate = 1 - ((float) errorCount ) / totalOperations;
        System.out.println("\n\nSuccess rate: %" + Float.toString(100 * successRate));
        System.out.println("Number of errors: " + Integer.toString(errorCount));
        
    }
}