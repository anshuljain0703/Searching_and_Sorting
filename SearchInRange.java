public class SearchInRange{
    static boolean search(int []arr,int target,int s,int e){
        for(int i=s;i<=e;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        int arr[]={18,12,-7,3,14,28};
        int s=1; 
        int e=4;
        int target=7;
      boolean ans=  search(arr, target, s, e);
      System.out.println(ans);
    }
}