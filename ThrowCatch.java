class AbsentException extends Exception{}

class AccountsNBS{
    public float Tax(int Salary,int Absents) throws AbsentException{
    float T;
    if(Absents>=7){
        AbsentException E=new AbsentException();
        throw E;
    }
    else{
        T=Salary*21/100;
    }
    return T;
    }
}
class AccountsHR{
    public static void main (String XYZ[]){
        AccountsNBS x=new AccountsNBS();
        try{
        float NetSalary=2000-x.Tax(2000,3);
        }
        catch(AbsentException E){
        System.out.println("Sorry, too many absences");
        }
    }
}
class AccountsIT{
    public void SalarySlip() throws AbsentException{
    AccountsNBS x=new AccountsNBS();
    float NetSalary=2000-x.Tax(2000,7);
    }
}
class ThrowCatch{
    public static void main(String XYZ[]){
        AccountsIT x=new AccountsIT();
        x.SalarySlip();
    }
}