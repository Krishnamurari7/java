import java.util.Scanner;
public class switc {
     public static void main(String[] args) {
        int age ;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
         switch (age) {
            case 18:
                System.out.println("you are enjoy");
                break;
            case 23:
                 System.out.println("you are adult");    
        
            default:
                System.out.println("enjoy your life");
                break;
        }
    }
}
