package LinearSearch;

public class LinearInString {
    public static void main(String[] args) {
        String name= "LinearSearch";
        char target='l';
        System.out.println(Search(name,target));


    }
    static boolean Search (String str,char target){
        if (str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
