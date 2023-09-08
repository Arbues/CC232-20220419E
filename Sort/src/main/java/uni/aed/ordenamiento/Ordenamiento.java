
package uni.aed.ordenamiento;

import java.util.Date;

public class Ordenamiento {
       int nIntercambios=0; 
    int nComparaciones=0;
    long tiempoEjecucion;

    public int getnIntercambios() {
        return nIntercambios;
    }

    public long getTiempoEjecucion() {
        return tiempoEjecucion;
    }
    
    public void setTiempoEjecucion(long tiempoEjecucion){
        this.tiempoEjecucion = tiempoEjecucion;
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
        long xd=System.nanoTime();
        
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
        long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
        this.setnIntercambios(tintercambios);
        this.setnComparaciones(tcomparaciones);
        return X;
    }
    
    public Integer[] insercion(Integer[] X){
        long xd=System.nanoTime();
        int aux,k;
        boolean sw=false;
        Date tiempoInit= new Date();
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
          Date tiempoIFinal= new Date();
       
       long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
       return X;
    }
    
    public Integer[] binaryInsertion(Integer[] arr) {
        int aux, p, u, c;
        long xd=System.nanoTime();
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
        long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
        return arr;
    }
    
    public Integer[] seleccion4c(Integer[] X){
        int aux,k;
        long xd=System.nanoTime();
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
        long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
        return X;
    }
    
    public void Callquicksort(Integer[] X) {
        
        nComparaciones=0;
        nIntercambios=0;
        long xd=System.nanoTime();
        if (X == null || X.length <= 1) {
            return; // La matriz ya está ordenada o es vacía
        }

        quicksort(X, 0, X.length - 1);
        long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
    }

    private void quicksort(Integer[] X, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(X, low, high);
            quicksort(X, low, pivotIndex - 1);
            quicksort(X, pivotIndex + 1, high);
        }
    }

    private int partition(Integer[] X, int low, int high) {

        int pivot = X[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            nComparaciones++;
            if (X[j] < pivot) {
                i++;
                swap(X, i, j);
                nIntercambios++;
            }
        }

        swap(X, i + 1, high);
        nIntercambios++;
        return i + 1;
    }

    private void swap(Integer[] X, int i, int j) {
        int temp = X[i];
        X[i] = X[j];
        X[j] = temp;
    }
    
    public Integer[] shellSort(Integer[] X) {
        if (X == null || X.length <= 1) {
            return X; // La matriz ya está ordenada o es vacía
        }
        long xd=System.nanoTime();
        int n = X.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = X[i];
                int j;
                for (j = i; j >= gap && X[j - gap] > temp; j -= gap) {
                    nComparaciones++;
                    X[j] = X[j - gap];
                    nIntercambios++;
                }
                X[j] = temp;
            }
        }
        long tfinal=System.nanoTime();
       setTiempoEjecucion(tfinal-xd);
        return X;
    }
}
