class Maths{
    int A;
    public void Message(){
        int A;
        A=20;
        this.A=15;
        System.out.println("This is:"+A);
    }
    public void Message2(){
        System.out.println(A);
    }
}
class This{
    public static void main(String XYZ[]){
        Maths X=new Maths();
        Maths Y=new Maths();
        X.Message();
        X.Message2();
    }
}