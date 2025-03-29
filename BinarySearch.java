public class BinarySearch {
    static boolean binarysearch(int[] a,int target){
        int n=a.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==target){
                return true;



            }else if(a[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int [] a={2,4,5,7,15,20,24,45,50,77};
       System.out.println(binarysearch(a,12)); 
    }
    
}
