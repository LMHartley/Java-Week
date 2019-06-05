class HSBC{
    public void MSG(){
        System.out.println("Hola Amigo!");
    }
    public void Message(){
        System.out.println("Por Favor");
    }
}
class LondonBranch extends HSBC{
    public void MSG(){
        System.out.println("unos dos tres");
    }
}
class Finalised{
    public static void main(String XYZ[]){
        LondonBranch X = new LondonBranch();
        X.MSG();
        X.Message();
    }
}