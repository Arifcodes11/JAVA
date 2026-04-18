public class e18{
    public static void main(String[] args) {
        int n = 145;
        int t = n;
        int sum = 0;
        for(;n>0;n/=10){
            int d = n%10;

            int f = 1;
            for(int i = 1;i<=d;i++){
                f*=i;
            }
            sum +=f;
        }
        if(t==sum){
            System.out.print("Strong Number");
        }
        else{
            System.out.println("Not a strong number");
        }
    }
}