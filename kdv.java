import java.util.Scanner;

public class kdv {
    public static void main( String [] args) {

    int realPrice;
    double tax;
    Scanner input=new Scanner(System.in);
    System.out.println("enter price");
    int price=input.nextInt();
    if(price>1000) {
        realPrice = (price * 118) / 100;
        tax=(0.18)*price;
    }
    else {
        realPrice = (price * 108) / 100;
        tax=(0.08)*price;

    }
    System.out.println("the real price is " + realPrice);
    System.out.println("tax is " + tax);

    }
    }
