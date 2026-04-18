public class e3{
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        for(;n>0;n/=10){
            int d = n%10;
            sum+=d;
        }
        System.out.println(sum);
    }
}