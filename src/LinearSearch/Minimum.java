package LinearSearch;

public class Minimum {
    public static void main(String[] args) {
        int[] num = {9,8,7,6,5,4,3,2,1};
        System.out.println(min(num));

    }
    static int min(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int sol = arr[0];

        for (int i = 1; i < arr.length; i++) {
             sol = arr[i];
            if (sol <arr[i]){
                return sol;
            }


        }
        return sol;
    }
}
