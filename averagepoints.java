import java.util.Scanner;

public class first {
    public static void main( String [] args){
        int math,physics,music,turkish,history,chemistry;
        System.out.print("enter math points");

        Scanner input= new Scanner(System.in);
        math=input.nextInt();
        System.out.print("enter physics points");

        physics=input.nextInt();
        System.out.print("enter music points");

        music=input.nextInt();
        System.out.print("enter turkish points");

        turkish=input.nextInt();
        System.out.print("enter history points");

        history=input.nextInt();
        System.out.print("enter chemistry points");

        chemistry=input.nextInt();
        int sum =math+physics+chemistry+turkish+history+music;
        double average=sum/6.0;
        System.out.println(average);
    }}
