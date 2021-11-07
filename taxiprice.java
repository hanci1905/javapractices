
import java.util.Scanner;

public class priceoftaxi {
    public static void main( String [] args) {

        double price;

        Scanner input=new Scanner(System.in);
        System.out.println("enter km");
        int km=input.nextInt();
        price=10.0+km*2.2;
        if(price<20){
            price=20;
        }
        System.out.println("the price is " + price);
    }
}
