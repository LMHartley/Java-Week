class Results{
    int Phy,Che,Mat;
    public void ShowResults(){
        int total;
        total=Phy+Che+Mat;
        System.out.println("Total Marks:"+total);
        if (total>=300){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}

class School{
    public static void main(String XYZ[]){
        Results Peter,James;
    Peter=new Results();
    James=new Results();
    Peter.Phy=50;
    Peter.Che=50;
    Peter.Mat=50;
    James.Phy=100;
    James.Che=100;
    James.Mat=100;
    Peter.ShowResults();
    James.ShowResults();
    }
}