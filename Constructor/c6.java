class cat{
    String name;
    cat(){
        name = "Unknown";
    }
    cat(String name){
        this.name = name;
    }
}
public class c6{
    public static void main(String[] args) {
        cat c1 = new cat("Meow");
        cat c2 = new cat();
        System.out.println(c2.name);
        System.out.println(c1.name);
    }
}