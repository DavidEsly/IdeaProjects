package com.dtech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrada int: ");
        int i = scan.nextInt();

        System.out.print("Entrada double");
        double d = scan.nextDouble();

        System.out.print("Entrada String: ");
        //Aqui ele irá pegar como vazio
        String s = scan.nextLine();
        //Porém aqui eu vou validar se há entrada caso true ele vai reler
        if(scan.hasNextLine()){
            s += scan.nextLine();
        }

        //String h = scan.nextLine();
        //String s = j + h;


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
