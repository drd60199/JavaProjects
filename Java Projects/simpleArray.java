import java.util.Arrays;

class Main {
    public static void main(String[]args){
       int numbers[] = {1, 2, 3, 4, 5};

        int startingIndex = 1;
       int endingIndex = 10;
       
       int copyOfNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);


       Arrays.fill(numbers, 0);

       System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(copyOfNumbers));

        

        

    }
}