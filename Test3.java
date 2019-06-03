class Maths{
    public void Addition(int A,int B){
        int Result;
        Result=A+B;
        System.out.println("Addition result:"+Result);
    }
    public int Subtraction(int A,int B){
        int Answer;
        Answer=A-B;
        return Answer;
    }
}
class Test3{
    public static void main(String XYZ[]){
        Maths x;
        x=new Maths();
        x.Addition(2,10);
        System.out.println("Subtraction result:"+x.Subtraction(100,10));
    }
}