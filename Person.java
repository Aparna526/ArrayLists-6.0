import java.util.Scanner;

public class Person {
    private int Id;
    private String name;
    private double salary;

    

    @Override
    public String toString() {
        return "Person [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
    }



    public static void main(String[] args) {
        Person p =new Person();
        Scanner sc =new Scanner(System.in);
        p.Id = sc.nextInt();
        p.name = sc.next();
        p.salary = sc.nextDouble();
        System.out.println(p.toString());
    }
}
