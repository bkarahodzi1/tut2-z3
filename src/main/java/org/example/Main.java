package org.example;


import java.util.Scanner;

public class Main {
    public static boolean isNum(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Unesite brojeve:");
        Scanner in=new Scanner(System.in);
        String s=new String();
        lista l=new lista();
        do
        {
            s=in.nextLine();
            if(s.equals("stop")) {
                break;
            }
            if(isNum(s)) {
                l.ubaci(Integer.parseInt(s));
            } else {
                System.out.println("Upisite validan broj");
            }
        }while(!s.equals("stop"));
        System.out.println("Minimalna vrijednost: "+l.min());
        System.out.println("Maksimalna vrijednost: "+l.max());
        System.out.println("Mean vrijednost: "+l.mean());
        System.out.println("Srednja vrijednost: "+l.sr_vr());
        System.out.println("Standardna devijascija: "+l.st_dev());
    }
}