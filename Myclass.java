public class Myclass {
    private int age;
    private String name;
    public Myclass(int age, String name) {
    this.age = age;
    this.name = name;
    }
    public void print() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    
    }
    public static void main(String[] args) {
    Myclass obj = new Myclass(20, "Krishna Murari");
    obj.print();
    }
    }
    
