import java.util.Scanner;
class Shape {
Scanner sc = new Scanner(System.in);
void area(){
System.out.println("Main Class");
}
}
class Rectangle extends Shape {
void area(){
int a=sc.nextInt();
int b=sc.nextInt();
int area=a*b;
System.out.println("Area of Rectangle:"+area);
}
}
class Square extends Shape {
void area(){
int a=sc.nextInt();
int area=a*a;
System.out.println("Area of Square:"+area);
}
}
class Circle extends Shape {
void area(){
int r=sc.nextInt();
double area=3.14*r*r;
System.out.println("Area of Circle:"+area);
}
}
public class Main{
public static void main(String[] args){
System.out.println("Enter the length & breath of rectangle");
Shape obj1=new Rectangle();
obj1.area();
System.out.println("Enter the side of square");
Shape obj2=new Square();
obj2.area();
System.out.println("Enter the radius of circle");
Shape obj3=new Circle();
obj3.area();
}
}

