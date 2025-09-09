import java.io.*;

public class BufferedReaderTest {



    public static void main(String[] args)  {

       File f1 = new File("first project/testing.txt");
       BufferedReader bf = null;

       try{
            FileReader fr = new FileReader(f1);
            bf = new BufferedReader(fr);

            String f = bf.readLine();

            while(f != null){

                System.out.println(f);
                f = bf.readLine();



            }


       }catch(FileNotFoundException fnf){
        
         fnf.printStackTrace();
       }catch(IOException io){
        io.printStackTrace();
       }
       finally{
        try {
            bf.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
       }




    }








}
