package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos los tres números por consola y los asignamos a sus variables.
        System.out.println("Introduzca el primer número \"A\":\n");
        Scanner sc=new Scanner(System.in);
        int numeroA=sc.nextInt();
        System.out.println("Introduzca el segundo número \"B\":\n");
        int numeroB=sc.nextInt();
        System.out.println("Introduzca el tercer número \"C\":\n");
        int numeroC=sc.nextInt();

        //Comparamos los números y en función de cual es el mayor, los mostramos en orden.
        if (numeroA>=numeroB) {
            if(numeroA>=numeroC){
                if(numeroB>=numeroC){
                    System.out.printf("%d, %d, %d.\n", numeroA, numeroB, numeroC);
                }else {
                    System.out.printf("%d, %d, %d.\n", numeroA, numeroC, numeroB);
                }
            }else{
                System.out.printf("%d, %d, %d.\n", numeroC, numeroA, numeroB);
            }
        } else {
            if(numeroB>=numeroC){
                if(numeroA>=numeroC){
                    System.out.printf("%d, %d, %d.\n", numeroB, numeroA, numeroC);
                }else{
                    System.out.printf("%d, %d, %d.\n", numeroB, numeroC, numeroA);
                }
            }else{
                System.out.printf("%d, %d, %d.\n", numeroC, numeroB, numeroA);
            }
        }
    }
}
