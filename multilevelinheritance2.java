class Student4{
    int reg_no;
    void getno(int no)
    {
        void putno()
        {
            System.out.println("registration number = " +reg_no);
        }
    }
    class Marks extends Student{
        float marks;
        void getmarks(float m)
        {
            marks=m;
        }
        void putmarks()
        {
            System.out.println("marks= "+marks);
        }
    }
    class sports extends marks{
        float score;
        void getscore(float scr)
        {
            score = scr;
        }
        void putscore()
        {
            System.out.println("score = "+score);
        }
    }
    public class multilevelinheritance2{
        public static void main(String args[])
        {
            sports ob=new sports();
            ob.getno(0987);
            ob.putno();
            ob.getmarks(78);
            ob.putmarks();
            ob.getscore(857);
            ob.putscore();
        }
    }
}
