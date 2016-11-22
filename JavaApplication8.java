package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
        
        System.out.println("1 je sčítání" + "   " + "2 je odečitání");
        Scanner scan = new Scanner (System.in);
        int druh = scan.nextInt();
        
        double x;
        double y;
        double res;
        
        Scanner rovnice = new Scanner (System.in);
        System.out.println("zadejte x: ");
        x = rovnice.nextDouble();
        System.out.println("zadejte y: ");
        y = rovnice.nextDouble();
        
        switch (druh){
            case 1:
                System.out.println("Sčítáme x a y.");
                res = x + y;
                System.out.println("Výsledek je: " + res);
            case 2:
                System.out.println("Odčítáme x a y.");
                res = x - y;
                System.out.println("Výsledek je: " + res);
        }       
    }
    
}
