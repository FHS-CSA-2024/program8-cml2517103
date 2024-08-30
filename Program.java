import java.lang.Math;
import java.util.Scanner;

public class Program8{
    public static void main(String[] args){
        Scanner survey = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int n1 = survey.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = survey.nextInt();
        
        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        double average = (double)(n1 + n2) / 2;
        int distance = Math.abs(difference);
        int max = (Math.abs(n1 - n2) + n1 + n2)/2;
        int min = Math.abs((Math.abs(n2 - n1) - n1 - n2)/2);
        
        System.out.println("Original numbers are " + n1 + " and " + n2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = "+ difference);
        System.out.println("Product = " + product);
        System.out.printf("Average = " + average);
        System.out.println("Distance = " + distance);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
