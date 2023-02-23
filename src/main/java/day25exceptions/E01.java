package day25exceptions;

public class E01 {

    public static void main(String[] args) {

        divide(6, 0);
        divide2(6, 0);
    }
    // 1.Way: We do not recommend that way
    //      i)It is not mandatory for developers to know all math rules.
    //      ii)In Math, there may be very problematic rules, it is so difficult to cover all in if statement.
    public static void divide(int a, int b){
        if(b==0){
            System.out.println("A number cannot be divided by zero");
        }else {
            System.out.println(a / b);
        }
    }

    // 2.Way: Handle Exception by using try-catch block
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println("Hi Exception");
            System.out.println("Bye Exception");

        }catch(ArithmeticException e){
            System.out.println("A problem occurred in division");
        }
    }



}
