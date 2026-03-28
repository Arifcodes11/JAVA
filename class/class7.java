class Rectangle{
    int length;
    int breadth;

    void area(){
        System.out.println("Area  = "+(length*breadth));
    }
}
public class class7{
    public static void main(String[] args){
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;
        r.area();
    }
}