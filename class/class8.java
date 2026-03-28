class Employee{
    String name;
    int salary;

    void show(){
        System.out.println(name+ " earns "+salary);
    }
}
public class class8{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Arif";
        e1.salary = 100000000;
        e1.show();
    }
}