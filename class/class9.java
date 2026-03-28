class Dog{
    String name;
    void bark(){
        System.out.println(name+" Says woof");
    }
}
public class class9{
    public static void main(String[] args){
        Dog d1  = new Dog();
        d1.name = "Tommy";

        Dog d2 = new Dog();
        d2.name = "Bruno";

        d1.bark();
        d2.bark();
    }
}