public class e19{
    public static void main(String[] args){
        int dec  = 11;
        String bin = "";
        for(;dec>0;dec/=2){
            int rem = dec%2;
            bin = rem+bin;
        }
        System.out.println(bin);
    }
}