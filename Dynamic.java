import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop

  ArrayList<Person> l = new ArrayList<Person>();
  l.add(new Person(1,"Aparna", 35000.152));
  l.add(new Person(2,"Kalki", 100000.250));
  

  Iterator<Person> i = l.iterator();
  while (i.hasNext()) {
    System.out.println(i.next());
    
  }
}
}
