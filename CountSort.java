class CountSort{
    static int findMax(int [] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
            
        }
        return mx;
    }
    static void countsort(int [] arr,int mx){
        int max=findMax(arr);
        int n=arr.length;
        int count[]=new int[max+1];
        int output[]=new int [n];
        //Freq Count
        for(int i=0;i<n;i++){
          count[arr[i]]++;
        }
//PrefixSum
for(int i=1;i<count.length;i++){
    count[i]+=count[i-1];

}
//sorting
for(int i=n-1;i>=0;i--){
    int idx=count[arr[i]]-1;
    output[idx]=arr[i];
    count[arr[i]]--;
}
//copying to arr
for(int i=0;i<output.length;i++){
    arr[i]=output[i];
}

    }
    public static void main(String[] args) {
        int arr[] ={4,3,1,5,3,1,3,5};
        countsort(arr, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
System.out.println();
    }

}