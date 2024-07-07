package genrics;

import java.util.ArrayList;

public class Lambda {
    // Basically, inline function i.e,single line executable
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.forEach((item)-> System.out.println(item*2)); // lambda function

    }

    static int muliple(int a , int b){
        return a+b;
    }



}
