public class FindMin {
    static int findmin(int[] a){
        int n=a.length;
        int s=0;
       int e=n-1;
       int ans=0; 
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]>a[n-1]){ 
                  //1st array
                  s=mid+1;

            }else if(a[mid]<=a[n-1]){
                ans=mid;
                e=mid-1;
            }
            

        }
        return ans;
    }
    public static void main(String [] args){
        int a[]={3,4,5,6,1,2};
        System.out.println(findmin(a));;
    }
    
}
