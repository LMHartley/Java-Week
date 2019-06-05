class digitstowords{
    private String ones(int num){
        String word="";
        switch(num){
            case 1: word="one";
            case 2: word="two";
            case 3: word="three";
            case 4: word="four";
            case 5: word="five";
            case 6: word="six";
            case 7: word="seven";
            case 8: word="eight";
            case 9: word="nine";
            case 10: word="ten";
            case 11: word="eleven";
            case 12: word="twelve";
            case 13: word="thirteen";
            case 14: word="fourteen";
            case 15: word="fifteen";
            case 16: word="sixteen";
            case 17: word="seventeen";
            case 18: word="eighteen";
            case 19: word="nineteen";
        }
        return word;
    }
    private String tens(int num){
        String word="";
        switch(num){
            case 2: word="twenty";
            case 3: word="thirty";
            case 4: word="fourty";
            case 5: word="fifty";
            case 6: word="sixty";
            case 7: word="seventy";
            case 8: word="eighty";
            case 9: word="ninety";
        }
        return word;
    }
    public void convert(int num){
        String answer="";
        if(num>=1000 && num<=9999){
            answer=ones(num/1000)+"thousand";
            num=num%1000;
        }
        if(num>=100){
            answer+=ones(num/100)+"hundred";
            num=num%100;
        }
        if(num>=20){
            answer+=tens(num/10);
            num=num%10;
        }
        if(num>0){
            answer+=ones(num);
        }
    }
}

class TestNum{
    public static void main(String XYZ[]){
        digitstowords c= new digitstowords();
        c.convert(1234);
    }
}