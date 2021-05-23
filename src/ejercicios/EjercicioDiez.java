/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.ArrayList;

/**
 * 
 * @author Brayan Guerrero
 */
public class EjercicioDiez{
        public void combinacionesSuma(int num, ArrayList<Integer> numeros, int suma){
            if(suma == num) System.out.println(numeros);
            
            for(int i = 1; i < num; i++){
                suma+=i;
                if(suma <= num){
                    numeros.add(i);
                    combinacionesSuma(num, numeros, suma);
                    numeros.remove(numeros.indexOf(i));
                }
                suma-=i;
            }
        }
        
        public static void main(String[] args) {
        EjercicioDiez d = new EjercicioDiez();
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero = 4;
        int suma = 0;
        d.combinacionesSuma(numero, numeros, suma);
    }
}
