import java.util.ArrayList;
import java.util.Iterator;

public class GenericMethodPractise {


    public static void main(String[]args){



        
        ArrayList<Integer>Ar1 = new ArrayList<Integer>();
        Ar1.add(1);
        Ar1.add(2);
        Ar1.add(3);
        ArrayList<Integer>Ar2 = new ArrayList<Integer>();
        Ar2.add(11);
        Ar2.add(22);
        Ar2.add(33);
    
        ArrayList<Integer> ARR = AddTwoArrayListFunction(Ar1,Ar2);

        Iterator<Integer> I1 = ARR.iterator();
        while (I1.hasNext()){
            System.out.println(I1.next());
        }
        

    }



    public static <E> ArrayList<E> AddTwoArrayListFunction(ArrayList<E> ArL1,ArrayList<E> ArL2){

        ArrayList<E> S1 = new ArrayList<>();
        S1.addAll(ArL1);
        S1.addAll(ArL2);
        return S1;

    }   




}
