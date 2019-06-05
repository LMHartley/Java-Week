class Maths{
    public void add(int A,int B){
        int Result=A+B;
        System.out.println("Result:"+Result);
    }
    public void sub(int A,int B){
        System.out.println(A-B);
    }
}
class Maths2 extends Maths{
    public void Multiply(int A,int B){
        System.out.println("Result:"+(A*B));
    }
    public void sub(int A,int B){
        System.out.println("Result:"+(A-B));
    }
}
class TestExtend{
    public static void main(String XYZ[]){
        Maths2 x = new Maths2();
        x.sub(10,5);
    }
}