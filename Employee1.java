class Employee
{
    float salary=34562*85;
}
class Executive extends Employee{
    float bonus=500*5;
    public static void main(String args[])
    {
        Executive obj = new Executive();
        System.out.println("Total salary credit: "+obj.salary);
        System.out.println("Total salary credit: "+obj.bonus);
    }
}
