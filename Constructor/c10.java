class cat{
    String name;
    int age;
    String color;

    cat(String name,int age,String color){
        this.name = name;
        this.age=age;
        this.color =color;
    }

    void show(){
        System.out.println(name +" "+ age + " "+color);
    }
}
public class c10{
    public static void main(String[] args) {
        cat c1 = new cat("kitty",10,"orange");
        c1.show();
    }
}