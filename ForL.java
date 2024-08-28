import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop

  ArrayList<String> A = new ArrayList<>();
  A.add("Apple");
  A.add("Grapes");
  A.add("Guava");
  A.add("Mango");

  for(String p: A){
    System.out.println(p);
  }


}
}
