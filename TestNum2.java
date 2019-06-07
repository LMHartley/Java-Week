class digitstowords{
    private String ones(int num){
        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten",
                       "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen",
                       "eighteen","nineteen"};
        return ones[num];
    }
    private String tens(int num){
        String[] tens={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        return tens[num];
    }
    public void convert(int num){
        String answer="";
        if(num>=1000 && num<=9999){
            answer=ones(num/1000)+" thousand ";
            num=num%1000;
        }
        if(num>=100){
            answer+=ones(num/100)+" hundred ";
            num=num%100;
        }
        if(num>=20){
            answer+=tens(num/10)+" ";
            num=num%10;
        }
        if(num>0){
            answer+=ones(num);
        }
        System.out.println("result is:"+answer);
    }
}

class TestNum2{
    public static void main(String XYZ[]){
        digitstowords c= new digitstowords();
        c.convert(1234);
    }
}