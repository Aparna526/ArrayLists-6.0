import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load Values in ArrayList
  // Iterate it by usig Iterator and While Loops

 

  List<Integer> l = new ArrayList<Integer>();
  l.add(5);
  l.add(2);
  l.add(8);
  l.add(12);
  l.add(22);

  Iterator<Integer> I = l.iterator();
  while (I.hasNext()) {
    System.out.println(I.next());
    
  }
}
}
