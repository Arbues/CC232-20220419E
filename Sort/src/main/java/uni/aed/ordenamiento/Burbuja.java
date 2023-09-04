package uni.aed.ordenamiento;
public class Burbuja {
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
        for(int i=0;i<X.length-1;i++){
            for(int j=0;j<X.length-1;j++){
                tcomparaciones++;
                if(X[j]<X[j+1]){
                    aux=X[j];
                    X[j]=X[j+1];
                    X[j+1]=aux;
                    tintercambios++;
                }
            }
        }
        this.setnIntercambios(tintercambios);
        this.setnComparaciones(tcomparaciones);
        return X;
    }
}
