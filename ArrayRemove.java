class ArrayRemove{
    public static void main(String XYZ[]){
        String[] numbers={"One","Two","Three"};
        int s=1;
        int i=0;
        while(i<numbers.size()){
            if(numbers.get(i)==s){
                numbers.remove(i);
            }
            i++;
        }
    }
