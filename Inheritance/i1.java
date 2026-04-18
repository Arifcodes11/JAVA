class Animal {
    String name = "Animal";
}

class cat extends Animal {
    String name = "Cat";

    void show() {
        System.out.println(name);
        System.out.println(super.name);
    }

}

public class i1 {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.show();
    }
}