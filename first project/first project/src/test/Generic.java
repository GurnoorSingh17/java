import java.util.*;


public class Generic {




    public static void main(String[] args){ 
        // DoStuff();
        GenPrac();
       

    }


    public static void GenPrac(){

        Scanner TakeInput= new Scanner(System.in);
        
        double D1 = TakeInput.nextDouble();
        double D2 = TakeInput.nextDouble();
        double D3 = TakeInput.nextDouble();

        GenericPractise<Double,Double,Double> o1 = new GenericPractise<Double,Double,Double>(D1, D2, D3);

        double x = o1.GiveNum1();
        double y =o1.GiveNum2();
        double z = o1.GiveNum3();
        o1.TakeAverage(x,y,z);
        TakeInput.close();


    }

    public static void DoStuff(){
         Scanner Scn = new Scanner(System.in);
        String scn = Scn.nextLine();
        ArrayList<String> Arr = new ArrayList<String>();
        ArrayList<Gun> Guns = new ArrayList<Gun>();


        Guns.add(new Gun("3", "scn", false, true, 7, 2.5));
        Guns.add(new Gun("2", "scn", false, true, 7, 2.5));
        Guns.add(new Gun("1", "scn", false, true, 7, 2.5));
        Arr.add("hello ");
        Arr.add("world ");
        Arr.add("finisher ");

        for (String m:Arr){
            System.out.println(m + scn);

        }
        for (Gun g:Guns){
            g.ShootKids();

        }
        Scn.close();
    }
}
