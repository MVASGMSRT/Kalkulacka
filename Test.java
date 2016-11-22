package Sandbox;
import java.util.Scanner;

public class Test {
    
    public static void main(String[]args){
    
        System.out.println("1 je x=y+R"+"   2 je x=y-R");
        Scanner scan = new Scanner(System.in);
	int druh = scan.nextInt();
	
        switch (druh){
		case 1: 
                    
                    double x,y;
        
                    System.out.println("Rovnice x=y+R");
                    Scanner rce = new Scanner(System.in);
                    System.out.println("zadejte x");
                    x = rce.nextDouble();
                    System.out.println("zadejte y");
                    y = rce.nextDouble();
                    
                    double res = x - y;     //x=y+res//
                    
                    System.out.println("Řešení je: " + res);
                    
                case 2:
                    
                    System.out.println("x=y-R");
                    Scanner rce2 = new Scanner(System.in);
                    System.out.println("zadejte x");
                    x = rce2.nextDouble();
                    System.out.println("zadejte y");
                    y = rce2.nextDouble();
                    
                    double res2 = y - x;
                    
                    System.out.println("Řešení je: " + res2);
        }
    }
}