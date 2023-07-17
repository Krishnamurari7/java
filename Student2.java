 class Amp {
    String name;
    int age;
    String section;
    void show(){
        System.out.println(name+" "+age+" "+section);
    }
    void input(String n, int a,String s){
        name = n;
        section = s;
        age = a;
    }
    public class Student2{
        public static void main(String[] args) {
        Amp a = new Amp();
        Amp b = new Amp();
        a.show();
        b.show();
        a.input("sonu",23,"3");
        b.input("anuj",23,"2");
        a.show();
        b.show();
    }
}
}
