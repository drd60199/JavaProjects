import java.util.ArrayList;


class Main{
    public static void main(String[]args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("before: " + numbers.toString());


        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
       
        });

        System.out.println("after: "+ numbers.toString());



        //Integer is the reference type form of int
    }
}