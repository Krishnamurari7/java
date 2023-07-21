    import java.util.*;
    class str{  
    public static void main(String args[]){  
    StringBuilder sb=new StringBuilder("Hello ");  
    sb.insert(2,"Java");//now original string is changed  
    System.out.println(sb);//prints HJavaello  
    }  
    }  