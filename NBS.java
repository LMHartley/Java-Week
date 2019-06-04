class Bank{
    private int Amount;
    public void Deposit(int Money){
        Amount=Money;
    }
    public void Withdraw(int Money){
        if(Money<Amount){
            Amount-=Money;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    public void Balanca(){
        System.out.println("Your Balance:"+Amount);
    }
    public Bank(){
        System.out.println("Hello Friends");
    }
}
class NBS{
    public static void main(String XYZ[]){
        Bank Ref;
        Ref=new Bank();
    }
}
