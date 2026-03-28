class cat{
    String name;
    int age;
    cat(){
        name  ="Unknown";
        age = 0;
    }
    cat(String name){
        this.name = name;
        age = 1;
    }
    cat(String name,int age){
        this.name = name;
        this.age  = age;
    }
}
public class c7{
    public static void main(String[] args){
        cat c1 = new cat();
        cat c2 = new cat("kitty");
        cat c3 = new cat("Meow",5);
        System.out.println(c1.name+"  "+c1.age);
        System.out.println(c2.name+"  "+c2.age);
        System.out.println(c3.name+"  "+c3.age);
    }
}