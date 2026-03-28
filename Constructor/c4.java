class cat{
    String name;

    cat(String name){
        this.name=name;
    }
}
public class c4{
    public static void main(String[] args) {
        cat c1 = new cat("Kitty");
        System.out.println(c1.name);
    }
}