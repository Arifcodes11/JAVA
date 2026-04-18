public class e10{
    public static void main(String[] args){
        int num = 122234;
        int digitToFind = 2;
        int count = 0;
        for(;num>0;num/=10){
            if(num%10 == digitToFind){
                count++;
            }
        }
        System.out.println(count);
    }
}