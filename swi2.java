import java.util.Scanner;
public class swi2 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter case number:-");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        switch(num){
            case 1:
                System.out.println("inside case 1");
                break;
            case 2:
                System.out.println("inside case 2");
                break;
            case 3:
                System.out.println("inside case 3");
                break;
            default:
                System.out.println("inside default case");         
        }
        System.out.println("after switch statement");
    }
}
