import java.util.*;
 public class su {
     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
    System.out.print("Enter Start and End point of range\n");
    System.out.print("Start: ");
    int start = s.nextInt();
    System.out.print("End : ");
    int end = s.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    for (int i = start; i <= end; i++) {
    if (i % 2 == 0) {
    evenSum += i;
    } else {
    oddSum += i;
   }
   }
   System.out.println("Sum of even numbers: " + evenSum);
   System.out.println("Sum of odd numbers: " + oddSum);
   }
   }
