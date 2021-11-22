import java.util.Scanner;

public class areaTriangle {
    public static void main( String [] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first side of trianlgle");
        int first=input.nextInt();
        System.out.println("enter second side of trianlgle");
        int second=input.nextInt();
        System.out.println("enter hipotenus of trianlgle");
        int hipotenus=input.nextInt();
        double sphere=(hipotenus+second+first)/2.0;
        double area;
        double realArea;
        area=sphere*(sphere-first)*(sphere-second)*(sphere-hipotenus);
        realArea=Math.sqrt(area);
        System.out.println("area of the triangle is " + realArea);

    }

    }
