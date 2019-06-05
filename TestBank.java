class Bank{
    static int Dollar;
    public void SetDollar(int A){
        Dollar=A;
    }
    public void Amount(int B){
        System.out.println("Dollar amount is:"+(B*Dollar));
    }
}
class TestBank{
    public static void main (String XYZ[]){
        System.out.println(XYZ[1]);
        Bank HSBC,Natwest,NBS;
        HSBC =new Bank();
        Natwest =new Bank();
        NBS =new Bank();
        HSBC.SetDollar(100);
        NBS.Amount(2);
        NBS.SetDollar(30);
        Natwest.Amount(2);
    }
}