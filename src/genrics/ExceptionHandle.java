package genrics;

public class ExceptionHandle {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try{
           // int c =a/b;
            divide(a,b);
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }



    }
    static int divide(int a,int b) throws Exception{
        if(b==0){
            throw new ArithmeticException("Can't possible");
        }
        return a/b;
    }

}
