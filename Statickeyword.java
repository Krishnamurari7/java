class Student {
    int rollno;
    String name;
    static String college="abc";
        public void show(){
            System.out.println(name+" "+rollno+" "+college);
        }
        public void input(int n,String s){
            name = s;
            rollno = n;
        }
    }
    public class Statickeyword{
        public static void main(String []args) {
            Student a = new Student();
            Student b = new Student();
            a.input(3,"sonu");
            b.input(5,"aman");
            a.show();
            a.show();
            
        }
    }
