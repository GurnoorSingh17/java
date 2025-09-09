
import java.util.Scanner;

public class DebuggingAndNestedLoops {
    public static void main(String[] args){

        System.out.println("Lets go...");
        int BPM = 0;
        int DesiredBPM;
        Scanner inputScanner = new Scanner(System.in);
        DesiredBPM = inputScanner.nextInt();
        while (BPM <= DesiredBPM){
            if (BPM == DesiredBPM){

                System.out.println("The BPM is now set correctly");
                break;

            }
            System.out.println("The current BPM: "+BPM + " is not equal to the desired BPM: "+DesiredBPM);
            BPM++;


        }

        

//  BYE


        inputScanner.close();
    }




}
