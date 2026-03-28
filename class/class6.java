class calculator{
    int a;
    int b;
    void add(){
        System.out.println("Sum :"+(a+b));
    }
}

public class class6{
    public static void main(String[] args){
        calculator c = new calculator();

        c.a = 10;
        c.b  =20;
        c.add();
    }
}