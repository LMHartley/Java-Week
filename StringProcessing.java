class WordCount{
    public void wordCount(String msg){
        int words=1;
        int i=0;
        while(i<msg.length()){
            if(msg.substring(i,i+1).equals(" ")){
                words++;
            }
            i++;
        }
        System.out.println(words);
    }
}
class PrintWord{
    public void printWord(String msg){
        String words="";
        int i=0;
        while(i<msg.length()){
            if(msg.substring(i,i+1).equals(" ")){
                System.out.println(words);
                words="";
            }
            else{
                words=words+(msg.substring(i,i+1));
            }
            i++;
        }
    }
}
class ReverseWords{
    public void reverseWords(String msg){
        String words="";
        int i=msg.length()-1;
        while(i>=0){
            if(msg.substring(i,i+1).equals(" ")){
                System.out.println(words);
                words="";
            }
            else{
                words=(msg.substring(i,i+1))+words;
            }
            i--;
        }
    }
}
class ReversingWords{
    public void reversingWords(String msg){
        String words="";
        int i=msg.length()-1;
        while(i>=0){
            if(msg.substring(i,i+1).equals(" ")){
                System.out.println(words);
                words="";
            }
            else{
                words=words+(msg.substring(i,i+1));
            }
            i--;
        }
    }
}
class StringProcessing{
    public static void main(String xyz[]){
        WordCount x=new WordCount();
        x.wordCount(" hello my friends ");
        PrintWord y=new PrintWord();
        y.printWord(" Hello my friends ");
        ReverseWords z=new ReverseWords();
        z.reverseWords(" Hello my friends ");
        ReversingWords r=new ReversingWords();
        r.reversingWords(" Hello my friends ");
    }
}