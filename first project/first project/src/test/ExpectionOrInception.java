import java.util.Scanner;

public class ExpectionOrInception {

    public static void main(String[] args) throws Exception{

        Scanner scr = new Scanner(System.in);
        System.out.println("pls enter a string");
        String str =  scr.nextLine();
        scr.close();
        String ans = LenCheck(str);
        System.out.println(ans);




    }





    public static String LenCheck( String str) throws Exception{


        if (str.length() > 10){

            throw new Exception("Too long");


        }
        
        return (str + " is within the valid length");


    }



}
