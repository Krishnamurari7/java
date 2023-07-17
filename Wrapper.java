public class Wrapper{
    void Boxing(){
    Integer obj = new Integer("2526");
    int i = obj.intValue();
    System.out.println("Value of 'i' Using Boxing:"+i);
    }
    void AutoBoxing(){
    Character gfg = 'a';
    System.out.println("Value of 'gfg' Using AutoBoxin:" + gfg);
    }
    void UnBoxing(){
    Integer i= new Integer(50);  
    int a=i;  
    System.out.println("Value of 'a' Using UnBoxing:"+a); 
    }	
    void AutoUnboxing(){
    Character gfg = 'a';
    char ch = gfg;
    System.out.println("Value of ch Using AutoUnboxing:" +ch);
    }
    public static void main(String[] args){
    Wrapper w=new Wrapper();
    w.Boxing();
    w.AutoBoxing();
    w.UnBoxing();
    w.AutoUnboxing();
    }
    }
    
