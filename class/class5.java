class Mobile{
    String brand;
    int price;

    void show(){
        System.out.println(brand+" costs "+price);
    }
}
public class class5{
    public static void main(String[] args) {
       Mobile m = new Mobile();
       
       m.brand = "apple";
       m.price = 50000;
       m.show();
    }
}