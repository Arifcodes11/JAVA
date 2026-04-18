public class e13 {
    public static void main(String[] args){
        int num = 153;
        int t = num;

        int sum = 0;
        for(;num>0;num/=10){
            int d = num%10;
            sum = sum+(d*d*d);
        }
        if(sum ==t){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
        
    }
}
