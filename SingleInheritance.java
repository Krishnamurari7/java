class Father {
    int Father_Bank_bal = 2000;
    public void fathersBalance() {
    System.out.println("Father's Bank balance:"+Father_Bank_bal);
    }
    }
    class Son extends Father{
    int Son_Bank_bal = 1000 + Father_Bank_bal;
    public void sonsBalance(){
    System.out.println("Son's Bank balance:"+Son_Bank_bal);
    }
    }
    public class SingleInheritance {
    public static void main(String args[]){
    Father f = new Father();
    Son s = new Son();
    f.fathersBalance();
    System.out.println("----------------------------------");
    s.sonsBalance();
    }
    }
    
