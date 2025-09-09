import java.io.File;
import java.io.FileNotFoundException;     
import java.util.Scanner;

public class InputOutputTest {

    public static void main(String[] args) throws FileNotFoundException{
        File OurFile = new File("first project/testing.txt");

        try{

            Scanner OurScanner = new Scanner(OurFile);
            while (OurScanner.hasNext()){
                String NextLine = OurScanner.next();
                System.out.println(NextLine);
    
    
            }
            OurScanner.close();
        }
        catch(FileNotFoundException e){
            System.out.println("dabad");
        }




    }





}
