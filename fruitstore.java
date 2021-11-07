import java.util.Scanner;

public class fruitstore {
    public static void main( String [] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter kg of armut");
        int armut=input.nextInt();
        System.out.println("enter kg of apple");
        int apple=input.nextInt();
        System.out.println("enter kg of tomato");
        int tomato=input.nextInt();
        System.out.println("enter kg of banana");
        int banana=input.nextInt();
        System.out.println("enter kg of eggplant");
        int eggplant=input.nextInt();
        double sum=armut*2.14+apple*3.67+tomato*1.11+banana*0.95+eggplant*5;
        System.out.println("price is " + sum);


    }
    }
