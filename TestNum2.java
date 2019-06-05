class digitstowords{
    private String ones(int num){
        String word="";
        switch(num){ 
            case 1: word="one";break;
            case 2: word="two";break;
            case 3: word="three";break;
            case 4: word="four";break;
            case 5: word="five";break;
            case 6: word="six";break;
            case 7: word="seven";break;
            case 8: word="eight";break;
            case 9: word="nine";break;
            case 10: word="ten";break;
            case 11: word="eleven";break;
            case 12: word="twelve";break;
            case 13: word="thirteen";break;
            case 14: word="fourteen";break;
            case 15: word="fifteen";break;
            case 16: word="sixteen";break;
            case 17: word="seventeen";break;
            case 18: word="eighteen";break;
            case 19: word="nineteen";break;
        }
        return word;
    }
    private String tens(int num){
        String word="";
        switch(num){
            case 2: word="twenty";break;
            case 3: word="thirty";break;
            case 4: word="fourty";break;
            case 5: word="fifty";break;
            case 6: word="sixty";break;
            case 7: word="seventy";break;
            case 8: word="eighty";break;
            case 9: word="ninety";break;
        }
        return word;
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