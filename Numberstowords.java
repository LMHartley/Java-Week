class Numberstowords{
   
    private static String units(int num){
        int numofunits=num%10;
        switch(numofunits){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    private static String special(int num){
        switch(num){
            case 0: return "zero";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
    private static String tens(int num){
        int numoftens=(num%100-num%10)/10;
        switch(numoftens){
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "fourty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }
    private static String hundreds(int num){
        int numofhundreds=(num%1000-num%100)/100;
        String output=units(numofhundreds) + "hundred";
    }
    private static String thousands(int num){
        int numofthousands=(num%10000-num%1000)/1000;
        return units(numofthousands) + "thousand";
}