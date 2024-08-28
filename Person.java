import java.util.Scanner;

public class Person {
    private int Id;
    private String name;
    private double salary;

    

    @Override
    public String toString() {
        return "Person [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
    }



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

    }  

    public Person(int id, String name, Double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }
    



    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    public static void main(String[] args) {
        Person p =new Person();
        Person p1 = new Person(2, "Kalki", 35000.0);
        Scanner sc =new Scanner(System.in);
        p.Id = sc.nextInt();
        p.name = sc.next();
        p.salary = sc.nextDouble();
        System.out.println(p.toString());
    }
}
