class Results{
    private int Phy,Che,Mat;
    public void Physics(int P){
        if (P>=0 && P<=150){
            Phy=P;
        }
        else{
            Phy=-1;
            System.out.println("invalid physics marks");
        }
    }
    public void Chemistry(int C){
        if (C>=0 && C<=150){
            Che=C;
        }
        else{
            Che=-1;
            System.out.println("invalid chemistry marks");
        }
    }
    public void Maths(int M){
        if (M>=0 && M<=150){
            Mat=M;
        }
        else{
            Mat=-1;
            System.out.println("invalid maths marks");
        }
    }
    public void ShowResults(){
        int total;
        if(Phy==-1||Che==-1||Mat==-1){
            System.out.println("no results");
        }
        else{
            total=Phy+Che+Mat;
            System.out.println("total results:"+total);
        }
    }
}

class School{
    public static void main(String XYZ[]){
        Results Peter,James;
    Peter=new Results();
    James=new Results();
    Peter.Physics(75);
    Peter.Chemistry(100);
    Peter.Maths(50);
    Peter.ShowResults();
    }
}