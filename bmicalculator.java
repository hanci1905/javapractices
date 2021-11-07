import java.util.Scanner;

public class bmicalculator {

    public static void main( String [] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter kg");
        double kg=input.nextDouble();

        System.out.println("enter length in meter");
        double length=input.nextDouble();
        double bmi;
        bmi=kg/(length*length);
        System.out.println("the bmi is " + bmi);

    }
}
