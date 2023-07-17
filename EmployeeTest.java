class Employee{
    String companyName;
    String employeeName;
    double salary;
    public Employee(){
    companyName="Google";
    }
    public Employee(String employeeName, double salary) {
    this();
    this.employeeName = employeeName;
    this.salary = salary;
    }
    public void show(){
    System.out.println("Company Name="+companyName);
    System.out.println("Employee Name="+employeeName);
    System.out.println("Salary="+salary);
    }
    }
    class MethodOverloading {
    void display(int a){
    System.out.println("Got Integer data.");
    }
    void display(String a){
    System.out.println("Got String object.");
    }
    }
    public class EmployeeTest {
    public static void main(String[] args) {
    Employee ram=new Employee("Krishna Murari",65000);
    ram.show();
    MethodOverloading m=new MethodOverloading();
    m.display(1);
    m.display("Hello");
    }
    }
    
