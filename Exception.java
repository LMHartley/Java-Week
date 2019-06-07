class Exception{
    public static void main(String XYZ[]){
        int A,B,C;
        A=B=C=0;
        try{
            A=4;
            B=0;
            C=A/B;
            System.out.println("Result is:"+C);
        }
        catch(ArithmeticException Err1){
            System.out.println("Das ist verboten!");
        }
    }
}