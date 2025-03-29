public class SearchString {
    static boolean search(String str,char target){
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="Kunal";
        char target ='v';
        if(search(str, target)){
            System.out.println("Character Exist");
        }
        else{
            System.out.println("Not Exist");
        }
    }
    
}
