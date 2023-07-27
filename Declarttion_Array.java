public class  Declarttion_Array{
    public static void main(String[] args) {
        String[] games;//declaration of an array
        games = new String[5];//Allocation of an array
        //initializing of an array by using the indexes
        games[0] = "cricket";
        games[1] = "football";
        games[2] = "chess";
        games[3] = "badminton";
        games[4] = "hockey";
        System.out.println(games[0]);
        System.out.println(games[1]);
        System.out.println(games[2]);
        System.out.println(games[3]);
        System.out.println(games[4]);
    }
}