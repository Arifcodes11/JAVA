class QuickSort{
    static int partition(int arr[],int s,int e){
        int pivot = arr[s];
        int count = 0;
        int i = s+1;
        while(i<=e){
            if(arr[i]<=pivot){
                count++;
            }
            i++;
        }
        int pivotIndex = s+count;
        int temp = arr[pivotIndex];
        arr[pivotIndex]=arr[s];
        arr[s]=temp;

        i = s;
        int j = e;
        while(i<pivotIndex&& j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex&&j>pivotIndex){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void Quicksort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int p = partition(arr,s,e);
        Quicksort(arr,s,p-1);
        Quicksort(arr,p+1,e);
    }
    public static void main(String[] args){
        int arr[]={9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        Quicksort(arr, 0, n-1);
        int i = 0;
        while(i<n){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}