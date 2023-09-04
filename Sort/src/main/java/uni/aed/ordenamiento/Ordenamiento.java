
package uni.aed.ordenamiento;

import java.util.Date;

public class Ordenamiento {
       int nIntercambios=0; 
    int nComparaciones=0;

    public int getnIntercambios() {
        return nIntercambios;
    }

    public void setnIntercambios(int nIntercambios) {
        this.nIntercambios = nIntercambios;
    }

    public int getnComparaciones() {
        return nComparaciones;
    }

    public void setnComparaciones(int nComparaciones) {
        this.nComparaciones = nComparaciones;
    }
   
    public Integer[] burbuja(Integer[] X){
        int tintercambios=0,tcomparaciones=0;
        int aux=0;
        Date tiempoInit= new Date();
        
        for(int i=0;i<X.length-1;i++){
            for(int j=0;j<X.length-1;j++){
                tcomparaciones++;
                if(X[j]>X[j+1]){
                    aux=X[j];
                    X[j]=X[j+1];
                    X[j+1]=aux;
                    tintercambios++;
                }
            }
        }
        Date tiempoIFinal= new Date();
        double tiempoEjecucion=tiempoIFinal.getTime()-tiempoInit.getTime();
        this.setnIntercambios(tintercambios);
        this.setnComparaciones(tcomparaciones);
        return X;
    }
    
    public Integer[] insercion(Integer[] X){
        int aux,k;
        boolean sw=false;
        for(int i=1;i<X.length;i++){
            aux=X[i];
            k=i-1;
            sw=false;
            while(sw==false && k>=0){
nComparaciones++;
                if(aux<X[k]){
                       nIntercambios++;
                    X[k+1]=X[k];
                    k--;
                }else{
                    sw=true;
                }
                
            }
            X[k+1]=aux;
        }
       return X;
    }
    
    public Integer[] binaryInsertion(Integer[] arr) {
        int aux, p, u, c;
        for (int i = 1; i < arr.length; i++) {
            aux = arr[i];
            p = 0;
            u = i - 1;
            while(p <= u) {
                c = (p + u) / 2;
                nComparaciones++;
                if (aux < arr[c])
                    u = c - 1;
                else
                    p = c + 1;
            }
            for(int k=1-1;k>=p;k--){
                nIntercambios++;
                arr[k+1]=arr[k];
                arr[p]=aux;
            }
            
        }
        return arr;
    }
    
    public Integer[]seleccion4c(Integer[] X){
        int aux,k;
        for(int i=0;i<X.length-1;i++){
            aux=X[i];
            k=i;
            for(int j=i+1;j<X.length;j++){
                nComparaciones++;
                if(X[j]<aux){
                    aux=X[j];
                    k=j;
                }
            }
            nIntercambios++;
            X[k]=X[i];
            X[i]=aux;
        }
        return X;
    }
    
    
    
}
