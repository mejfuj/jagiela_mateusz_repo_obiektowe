package kalkulator;

import java.util.Scanner;

public class Kalkulator{
    public static void main(String[] args){
        
        ObliczImpl oblicz;

        System.out.print("Wybierz dzialanie: [+], [-]: ");
        Scanner sc = new Scanner(System.in);
        String sign = sc.next();
        
        
        if(sign.equals("+")){
            oblicz = new Suma();
        }else if (sign.equals("-")){
            oblicz = new Roznica();
        }else{
            oblicz = null;
        }

        System.out.println("Wynik: "+oblicz.oblicz(5,8));
        
    }
}