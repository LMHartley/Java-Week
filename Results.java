class Results{
    public static void main(String ZYZ[]){
        int Phy,Che,Mat,Total;
        float Per;
        Phy=98;Che=82;Mat=74;
        Total=Phy+Che+Mat;
        Per=Total*100/300f;
        System.out.println("Total marks:"+Total);
        System.out.println("Percentage:"+Per);
        if(Per>=60){
            System.out.println("Passed");
        }
        if(Per<60){
            System.out.println("Failed");
        }
    }
}