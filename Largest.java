import java.util.Scanner;
public class Largest {
public static void main(String[] args) {

int n;
Scanner input = new Scanner(System.in);
System.out.print("Enter the value of n: ");
n = input.nextInt();

int[] numbers = new int[n];
System.out.println("Enter " + n + " numbers:");
for(int i = 0; i< n; i++) {
numbers[i] = input.nextInt();
}
int largest = numbers[0];
for(int i = 1; i< n; i++) {
if(numbers[i] > largest) {
largest = numbers[i];
}}
System.out.println("The largest number is: " + largest);
}}
