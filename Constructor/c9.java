class cat{
    int age;

    cat(int age){
        this.age = age+1;
    }
}
public class c9{
    public static void main(String[] args) {
        cat c1 = new cat(11);
        System.out.println(c1.age);
    }
}