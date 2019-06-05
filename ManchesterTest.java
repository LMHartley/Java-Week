class Manchester{
    public Manchester(int A){
        System.out.println("Hello Manchester");
    }
    public Manchester(int A,int B){
        System.out.println("Hello Swindon");
    }
}
class ManchesterTest{
    public static void main(String XYZ[]){
        Manchester x= new Manchester(1,2);
        Manchester y=x;
    }
}