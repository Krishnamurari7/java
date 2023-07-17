class GrandFather {
    int GrandFather_Bank_bal = 3000;
    public void grandFathersBalance(){
    System.out.println("Grandfather's Bank balance:"+GrandFather_Bank_bal);
    }
    }
    class Father extends GrandFather{
    int Father_Bank_bal = 2000 + GrandFather_Bank_bal;
    public void fathersBalance() {
    System.out.println("Father's Bank balance:"+Father_Bank_bal);
    }
    }
    class Son extends Father {
    int Son_Bank_bal = 1000 + Father_Bank_bal;
    public void sonsBalance() {
    System.out.println("Son's Bank balance:"+Son_Bank_bal);
    }
    }
    public class MultilevelInheritance {
    public static void main(String args[]){
    GrandFather gf = new GrandFather();
    Father f = new Father();
    Son s = new Son();
    gf.grandFathersBalance();
    System.out.println("----------------------------------");
    f.fathersBalance();
    System.out.println("----------------------------------");
    s.sonsBalance();
    }
    }
    
