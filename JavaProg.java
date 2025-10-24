import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int d = sc.nextInt();

        int largest;

        if (a >= b && a >= d)
            largest = a;
        else if (b >= a && b >= d)
            largest = b;
        else
            largest = d;

        System.out.println("The largest number is: " + largest);
    }

}
