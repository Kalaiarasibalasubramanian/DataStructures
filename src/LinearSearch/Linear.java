package LinearSearch;

public class Linear {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int sol = LinearSearch(num,9);
        System.out.println(sol);





    }

     static int LinearSearch( int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
         for (int Element : arr) {
             if (Element == target) {
                 return Element;
             }


         }
         return -1;


     }
}
