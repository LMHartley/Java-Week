class Second{
    public Second(){
        System.out.println("2nd");
    }
}
class First extends Second{
    public First(){
        super();
        System.out.println("1st");
    }
}
class One extends First{
    public One(){
        super();
        System.out.println("One");
    }
}
class Two extends One{
    public Two(int A){
        super();
        System.out.println("Two");
    }
    public Two(){
        System.out.println("Two Blank");
    }
}
class TestSuper{
    public static void main(String XYZ[]){
        Two X=new Two(10);
    }
}