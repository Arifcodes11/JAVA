class Book {
    String title;
    int price;

    void display(){
        System.out.println(title+" cost "+price);
    }
}
public class class10{
    public static void main(String[] args){
        Book b1 = new Book();
        b1.title = "java Basics";
        b1.price = 500;

        b1.display();
    }
}