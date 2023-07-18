import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner c = new Scanner(System.in);
        age = c.nextInt();
        if(age>56){
            System.out.println("you are experience");
        }
        else if(age>43){
            System.out.println("you are semi experience");
        }
        else if(age>22){
            System.out.println("you are semi-semi experince");
        }
        else{
            System.out.println("you are not experience");
        }
        if(age<10){
            System.out.println("you are child");
        }
    }
}
