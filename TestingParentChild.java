abstract class Draw{
    abstract public void Drawing();
}
class line extends Draw{
    public void Drawing(){
        System.out.println("Drawing Line");
    }
}
class circle extends Draw{
    public void Drawing(){
        System.out.println("Drawing Circle");
    }
}
class TestingParentChild{
    public static void main(String XYZ[]){
        line X=new line();
        LetsDraw(X);
        circle x=new circle();
        LetsDraw(x);
    }
    public static void LetsDraw(Draw D){
        D.Drawing();
    }
}