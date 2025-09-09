package assignment1;

public class question1 {

    public static void main(String[] args){

        int num = 10;
        int num2 = 7;
        double double1 = 1.4;
        double double2 = 12.7;
        char charector = 'a';
        boolean bool = true;
        String word1 = "Hello";
        String word2 = "world"; 

        System.out.println("Integer result of addition: "+ (num+num2));
        System.out.println("Double result of subtraction: " + (double2 - double1));
        System.out.println("Charector: "+charector);
        System.out.println("Result of String Concatenate: " +word1 +" "+ word2);
        System.out.println(bool);



    }

    public static int add(int num1, int num2){

        int answer = num1 + num2;

        return answer;
    }


}
