package practice01;



public class Q03 {
    // Write a Java program to break an integer into a sequence of individual digits.
// Hint: use / and %
// x: input: 12345
//    output: 1
//            2
//            3
//            4
//            5

    public static void main(String[] args) {
        int x = 12345;

        int  lastDigit = x%10;
        int forthDigit = (x/10)%10;
        int thirdDigit = (x/100)%10;
        int secondDigit = (x/1000)%10;
        int firstDigit = (x/10000)%10;

        System.out.println(firstDigit+ "\n" +secondDigit+ "\n" +thirdDigit+ "\n" +forthDigit+ "\n" +lastDigit);





    }







}
