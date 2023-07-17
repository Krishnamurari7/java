import java.util.*;
public class factorial {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = s.nextInt();
int factorial = calculate(num);
System.out.println("Factorial of "+ num +":"+ factorial);
}	
public static int calculate(int num) {
if (num == 0) {
return 1;
}
else
{
return num * calculate(num - 1);
}
}
}
