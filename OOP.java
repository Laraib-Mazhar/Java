class Employee{
    int id;
    String name;
    int age;
    int salary;
    public void employeeDetails(){
        System.out.println("My ID is : " + id);
        System.out.println("My name is : " + name);
        System.out.println("My age is : " + age);
    }
    public int getSalary(){
        return salary;
    }
}

public class OOP {
    public static void main(String[] args) {
        System.out.println("Custom class");
        System.out.println();
        //Instantiating a new Employee object
        Employee laraib = new Employee();
        Employee akash = new Employee();

        //Setting attributes for laraib
        laraib.id = 10;
        laraib.name = "laraib";
        laraib.age = 22;
        laraib.salary = 40000;

        //Setting attributes for akash
        akash.id = 11;
        akash.name = "Akash";
        akash.age = 22;
        akash.salary = 40000;

        //Printing the attributes
        laraib.employeeDetails();
        int salary = laraib.salary;
        System.out.println(laraib.name + " salary is : " + salary);

        akash.employeeDetails();
    }
}
