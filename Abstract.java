abstract class Calculations{
    abstract public void Tax(int Salary);
    //public void MSG(){
        //Tax();
        //System.out.println("Abstract Tax");
    //}
}
class Calculations2 extends Calculations{
    public void Tax(int Salary){
        float Result;
        Result= Salary*21/100;
        System.out.println(Result);
    }
}
class Abstract{
    public static void main(String XYZ[]){
        Calculations2 X = new Calculations2();
        X.Tax(1000);
    }
}