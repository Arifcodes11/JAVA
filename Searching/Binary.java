class Binary {
    static int Search(int arr[],int n,int key){
        int start = 0;
        int end = n-1;
        int mid = start+(end-start)/2;

        while(start<=end){
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int key = 8;
        int result = Search(arr,n,key);
        if(result!=-1){
            System.out.println("Key Found at Index : "+result);
        }
        else{
            System.out.println("Key Not Found !!!");
        }
    }
}
