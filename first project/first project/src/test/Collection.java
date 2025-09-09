
import java.util.ArrayList;
import java.util.Collections;

import java.util.LinkedList;

public class Collection {




  public static void main(String[] args) {
    //ArrayList
    
    ArrayList<String> Fruits = new ArrayList<String>();
    Fruits.add("banana");
    Fruits.add("apple");
    Fruits.add("kiwi");
  
    String fr = Fruits.get(2);
    System.out.println(fr);
      

    //LinkedList
    LinkedList<Integer> number = new LinkedList<Integer>();
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    number.add(5);

   

    
    ArrayList<Integer> number2 = new ArrayList<Integer>();
    number2.add(5);
    number2.add(1);
    number2.add(2);
    number2.add(4);
    number2.add(3);
    Collections.sort(number2);

    for( Integer num:number2){
      System.out.println(num);

    }
  
   
  }
}
