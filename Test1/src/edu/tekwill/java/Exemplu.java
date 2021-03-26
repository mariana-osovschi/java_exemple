package edu.tekwill.java;

import java.util.Scanner;

public class Exemplu {
    public static void main (String args[]){
      /*  Scanner introd = new Scanner(System.in);
        System.out.println("Introduceti un string");
        String str = introd.nextLine();
        System.out.println("Stringul este \n" +str);*/
        int x=3;
        int y=4;
        int z = x<y? (x+y) : (x-y);
        System.out.println(z);
        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
