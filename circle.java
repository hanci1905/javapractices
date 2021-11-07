import java.util.Scanner;

public class circle {
    public static void main( String [] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter radius");
        int radius=input.nextInt();
        double area;
        double sphere;
        double pi=3.14;
        area=pi*radius*radius;
        sphere=2*pi*radius;
        System.out.println("enter angle");
        int angle=input.nextInt();
        double realArea=(pi*(radius*radius)*angle)/360.0;
        System.out.println("circle slice area " + realArea);

    }
    }
