/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

/**
 * 
 * @author Brayan Guerrero
 */
public class EjercicioTres {
    int[] array;
/**
 * En un array de enteros A de tamaño n, escriba algoritmos recursivos para cada uno de los siguientes casos: 
 * a. Calcular la suma de los elementos del array
 * b. Encontrar la posición del mayor valor en el array
 * c. Invertir el array sobre el mismo
 * d. Encontrar el primer índice tal que A[i] sea igual a i
 * e. Con otro array B de tamaño n, construir un tercer array que contenga la intersección de los dos arrays originales (elementos comunes).
 * f. Con otro array B de tamaño n, construir un tercer array que contenga la unión de los dos arrays origina les (aquellos elementos que aparecen tanto en A como en B).
**/
    
    public int[] getArray(){
        return array;
    }

    public void rellenarArray(int n) {
        array = new int[n];
        for(int i=0; i<array.length; i++){
            array[i] = i+1;
        }
    }
    
    public void imprimir(int[] array){
        System.out.println("Lista de elementos");
        for(int elemento : array){
            System.out.println("- "+elemento);
        }
    }
    
    //Punto A
    public int sumatoria(int n){
        if(n<1) return(0);
        else return array[n-1] + sumatoria(n-1);
    }
    
    //Punto B
    public void mayorElemento(int n,int indice){
         if(n != array.length-1){
             if(array[n] < array[n+1]) indice = n+1;
             else indice = n;
             mayorElemento(n+1, indice);
         }
         else{
             System.out.println("La posicion en el array del mayor elemento es : "+indice);
         }
    }
    
    //Punto C
    public void invertirArray(int n){
        if(n==(array.length/2)){
            imprimir(array);
        }
        else{
            int aux = array[n];
            array[n] = array[array.length-(n+1)];
            array[array.length-(n+1)] = aux;
            invertirArray(n+1);
        }
    }
    
    //Punto D
    public void primerIndice(int n){
        if(n != array.length){
            if(array[n] == n) System.out.println("Primer indice: "+n);
            else primerIndice(n+1);
        }
    }
    
    //Punto E
    //public int[] interseccion(){
        
    //}
    
    //Punto F
    public int[] union(int[] b){
        int[] c = new int[array.length + b.length];
        unir(b,c, 0);
        return c;
    }
    
    public void unir(int[] b, int[] c, int n){
        if(n < c.length){
            if(n < b.length) c[n] = b[n];
            else c[n] = array[n - b.length];
            unir(b,c,n++);
        }
    }
    
    public static void main(String[] args) {
        EjercicioTres t = new EjercicioTres();
        EjercicioTres aux = new EjercicioTres();
        System.out.println("Array A:");
        t.rellenarArray(6);
        t.imprimir(t.getArray());
        System.out.println("");
        System.out.println("Array B:");
        aux.rellenarArray(3);
        aux.imprimir(aux.getArray());
        System.out.println("");
        
        System.out.println("Punto A:");
        System.out.println("La sumatoria de los elementos dentro del array A es de "+t.sumatoria(t.getArray().length));
        System.out.println("La sumatoria de los elementos dentro del array B es de "+aux.sumatoria(aux.getArray().length));
        System.out.println("");
        
        System.out.println("Punto B: ");
        System.out.println("Array A:");
        t.mayorElemento(0, 0);
        System.out.println("Array B:");
        aux.mayorElemento(0, 0);
        System.out.println("");
        
        System.out.println("Punto C:");
        System.out.println("Array A:");
        t.invertirArray(0);
        System.out.println("Array B");
        aux.invertirArray(0);
        System.out.println("");
        
        System.out.println("Punto D:");
        System.out.println("Arary A:");
        t.primerIndice(0);
        System.out.println("Array B:");
        aux.primerIndice(0);
        System.out.println("");
        
        System.out.println("Punto E:");
        System.out.println("");
        
        System.out.println("Punto F:");
        t.imprimir(t.union(aux.getArray()));
        System.out.println("");
    }
}
