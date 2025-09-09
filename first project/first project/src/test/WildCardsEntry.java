import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WildCardsEntry {
    
    
    public static void main(String[] args){
        
        System.out.println("-------------------I hereby present u the Fibonacci series of numbers---------------------");
        ArrayList<?> Arr1 = new ArrayList<>();
        ArrayList<Integer> Arr2 = new ArrayList<>();
        
        Arr1 = Arr2;
        int FCurrent = 1;
        int FPrev = 0; 
        int FNext =0;
        
        System.out.println("Kindly enter the max number u want the Fibonacci series to cap at: ");
        Scanner UptoIpt = new Scanner(System.in);
        int UptoNum =  UptoIpt.nextInt();
        Arr2.add(FPrev);
        while (FNext <= UptoNum){
            FNext = FPrev + FCurrent;
            Arr2.add(FCurrent);
            FPrev = FCurrent;
            FCurrent = FNext;
        }
        System.out.println("Very well i may say here is the series upto the value least smaller that " + UptoNum);
        Iterator<?> I1 = Arr1.iterator();
        while (I1.hasNext()){
            System.out.println(I1.next());
        }
        UptoIpt.close();
    }   





}
