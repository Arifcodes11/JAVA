class cat{
    String name;

    cat(String name){
        this.name = name;
    }
}
public class c8{
    public static void main(String[] args){
        cat c1 = new cat("kitty");
        cat c2 = new cat("Orange");

        System.out.println(c1.name+" "+c2.name);
    }
}