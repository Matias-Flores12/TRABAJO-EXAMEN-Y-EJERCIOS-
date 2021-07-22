package pe.edu.upeu.arreglos;

import java.util.Scanner;

public class EjemploVectores {

    public static void conceptosvectores() {
        //definir un vector
        int[] vectorX;
        int  []vectorY;
        //definir tamaño de un vector
        vectorX=new int[2];
        vectorX[0]=20; //[0]indice / posicion
        vectorX[1]=8; //[1]indice /posicion
        vectorX[0]=40;
        //vectorX[2]=5;
        System.out.println("Imprimiendo valor de un vector");
        System.out.println(vectorX[0]);//imprimir el valor de un vectorx[0]
        //asignar valores directos de un vector
        int[] vA={1,2,3,4,5,6,7,8,9,10};
        //conocer el tamaño de un vector 
        System.out.println("Tamaño de un vector vA="+vA.length);
    }
     //Crea un array de 10 posiciones de números con valores pedidos por teclado. 
    //Muestra por consola el indice y el valor al que corresponde. 
    //Haz dos métodos, uno para rellenar valores y otro para mostrar.


    public static void mostrarValores(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("v["+i+"]= "+vector[i]+"   Su indice es: "+i+" Su valor es:"+vector[i]);        
        }
    }

    public static int[] rellenarVector(int tv) {
       int[] vector=new int[tv]; 
       Scanner cs=new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese el valor del indice "+i+":");
            vector[i]=cs.nextInt();
            System.out.println("");
        }
        mostrarValores(vector);
        return vector;
    }

    public static void main(String[] args) {
        conceptosvectores();
        System.out.println("Ejercicio 01");
        rellenarVector(10);
    }
    
}
