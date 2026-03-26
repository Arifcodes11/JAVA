public class Linear {
    static boolean Search(int arr[],int n,int key){
        for(int i = 0 ; i < n ; i ++){
            if(arr[i]==key){
                System.out.println("Key Found at Index : "+i);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int arr[]={4,5,6,9,8,7,2,1};
        int n = arr.length;
        int key = 2;
        boolean Result = Search(arr,n,key);
        if(!Result){
            System.out.println("Key Not Found !!!");
        }
    }
}
