class newEmployee{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

        }
public class accessModifiers {
    public static void main(String[] args) {
       newEmployee lara = new newEmployee();
       lara.setId(14);
       lara.setName("Laraib");
        System.out.println(lara.getId() + " " + lara.getName());
    }
}
