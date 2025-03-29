//package Sorting;

public class ZerosAtEnd {
    static void zeroatend(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 4,0, 2, 0,6, 5};
        zeroatend(arr);
        
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
