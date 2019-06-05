class One{
    int A;
    public void MSG1(){
        System.out.println("class one");
    }
}
class Two{
    int B;
    public void MSG2(){
        System.out.println("class two");
    }
}
class ParentChildTest{
    public static void main(String XYZ[]){
        Two ref;
        ref=new Two();
        ref.MSG2();
        ref.B=15;
    }
}