class Employee{
    int salary;
    }
    class SoftwareDeveloper extends Employee{
    public SoftwareDeveloper(int i) {
    salary = i;
    }
    public void displaySalary(){
    System.out.println("Software Developer's salary in US$:"+salary);
    }
    }
    class SoftwareTester extends Employee {
    public SoftwareTester(int i) {
    salary = i;
    }
    public void displaySalary(){
    System.out.println("Software Tester's salary in US$:"+salary);
    }
    }
    public class Hierarchical_Inher {
    public static void main(String args[]){
    SoftwareDeveloper d = new SoftwareDeveloper(90000);
    SoftwareTester t = new SoftwareTester(80000);
    d.displaySalary();
    System.out.println("-----------------------------------------");
    t.displaySalary();
    }
    }
    
