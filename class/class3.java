class Dog{
    String name;
    void bark(){
        System.out.println(name + " is barking");
    }
}
public class class3{
    public static void main(String[] args){
        Dog d = new Dog();
        d.name = "Tommy";
        d.bark();
    }
}