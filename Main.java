import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x; ");
        double x= input.nextDouble();
        System.out.println("Enter y; ");

        double y= input.nextDouble();


        Point myObj = new Point();

        Point p2 = new Point(x, y);
        System.out.println(myObj.distance(p2));

    }
}