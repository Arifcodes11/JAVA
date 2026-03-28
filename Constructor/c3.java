class cat{
    String name;
    int age;

    cat(String n,int a){
        name=n;
        age=a;
    }
}
public class c3{
    public static void main(String[] args) {
        cat c1 = new cat("Kitty",3);
        System.out.println(c1.name+" " +c1.age);
    }
}