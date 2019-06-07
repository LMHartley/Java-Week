class Operations{
    public static void main(String data[]){
        int First,Second,Result;
        First=Second=Result=0;
    try{
        First=Integer.parseInt(data[0]);
        Second=Integer.parseInt(data[1]);
        Result=First/Second;
        System.out.println("Result is:"+Result);
    }
    catch(NumberFormatException E){
        System.out.println("Enter digits only");
    }
    catch(IndexOutOfBoundsException E){
        System.out.println("Not enough values");
    }
    catch(ArithmeticException E){
        System.out.println("Can't divide by zero!");
    }
}
}