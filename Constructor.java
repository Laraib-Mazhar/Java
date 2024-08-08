class MyEmployee{
    int id;
    String name;
    int salary;
    //First constructor
    public MyEmployee(){
        id = 10;
        name = "lara";
        salary = 10000;
    }
    //Constructor Overloaded
    public  MyEmployee(int s){
        id = 1;
        name = "Gull";
        salary = s;
    }
    public int getId() {
        return id;
    }
    public void setId(int i){
        id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary = s;
    }

}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee me = new MyEmployee(10000);
        System.out.println("ID : " + me.id);
        System.out.println("Name : " + me.name);
        System.out.println("Salary : " + me.salary);
    }
}