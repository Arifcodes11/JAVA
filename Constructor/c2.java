class cat{
    String name;

    cat(String n){
        name = n;
    }
}
public class c2{
    public static void main(String[] args) {
        cat c1 = new cat("Kitty");
        System.out.println(c1.name);
    }
}