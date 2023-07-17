import java.util.Scanner;
public class Try_catch{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter The value");
int n=sc.nextInt();
try{
int a=45/n;
System.out.println("a value is:"+a);
}
catch(ArithmeticException e){
System.out.println(e);
}
finally {
System.out.println("I am in Finally");
}
System.out.println("close connection");
}
}


