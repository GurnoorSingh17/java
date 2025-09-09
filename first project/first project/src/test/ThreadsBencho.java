import java.util.Scanner;

public class ThreadsBencho {




    public static void main(String[] args){

        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter a Double:-");
        double IntInput = Scn.nextDouble();
        System.out.println("Ans:- ");
        System.out.println(IntInput/10 + 30 - IntInput/53);
       
        Scn.close();
        
    }
}
