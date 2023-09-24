import java.util.HashMap;

class Main {
    public static void main(String[]args) {
       HashMap<String, Integer>examScore=new HashMap<String, Integer>(); 

       examScore.put("Math", 75);
       examScore.put("Sociology", 85);
       examScore.put("English", 95);
       examScore.put("Computer Programming", 100);

        examScore.forEach((subject, score) -> {
            examScore.replace(subject, score - 10);
        });

        System.out.println(examScore.toString());
        


       
}
}