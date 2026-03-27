// public class BinDec {
//     public static void main(String[] args) {
//         int binary = 1011;
//         int decimal = 0;
//         int i = 0;

//         while (binary != 0) {
//             int digit = binary % 10;   // last digit
//             decimal += digit * Math.pow(2, i);
//             binary = binary / 10;
//             i++;
//         }

//         System.out.println("Decimal = " + decimal);
//     }
// }

public class BinDec{
    public static void main(String[] args) {
        int binary = 1101;
        int decimal = 0;
        int p = 0;
        for(;binary>0;binary/=10){
            int d = binary%10;
            decimal+=d * Math.pow(2,p++);
        }
        System.out.println(decimal);  
    }
}