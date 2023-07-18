public class logical1 {
    public static void main(String[] args) {
        int age = 19;
        String national = "indian";
        int country_code = 91;
        //AND operater(&&)
        //all condition is right == right
        if(age >= 18 && national.equals("indian")){
            System.out.println("you are elligiable for votting");
        }
        //OR operater(||)
        //one condition is right == right
        if(age>=18 &&(national.equals("indian")) || country_code==23){
            System.out.println("you are elligiable are voting");
        }
        else{
            System.out.println("not");
        }
        //not operater(!)
        if(country_code != 23){
            System.out.println("you are not elligiable are votting");
        }
    }
}
