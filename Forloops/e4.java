public class e4{
    public static void main(String[] args) {
        int n = 122;
        int t = n;
        int rev = 0;
        for(;n>0;n/=10){
            int d = n%10;
            rev = rev * 10+ d;
        }
        if(rev == t){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not plaindrome");
        }
    }
}