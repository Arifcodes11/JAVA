class cat{
    String name;

    cat(String name){
        this.name = name;
    }
    void Display(){
        System.out.println("Cat name :"+name);
    }
}
public class c5{
    public static void main(String[] args) {
        cat c1 = new cat("cat");
        c1.Display();
    }
}