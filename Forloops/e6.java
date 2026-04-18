public class e6{
    public static void main(String[] args) {
        int arr[]={6,5,4,8,3,1,9};
        int max = arr[0];

        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max : "+max);
    }
}