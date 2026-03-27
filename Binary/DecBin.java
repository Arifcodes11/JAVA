public class DecBin{
    // public static void main(String[] args) {
    //     int decimal = 13;
    //     String binary = "";

    //     while(decimal>0){
    //         int rem = decimal%2;
    //         binary = rem + binary;
    //         decimal = decimal/2;
    //     }
    //     System.out.println("Binary = "+binary);
    // }
    public static void main(String[] args) {
        int n  = 13;
        int bin = 0;
        int place = 1;
        while(n>0){
            int r = n%2;
            bin=bin+r*place;
            place*=10;
            n/=2;
        }
        System.out.print("Binary = "+bin);
    }
}