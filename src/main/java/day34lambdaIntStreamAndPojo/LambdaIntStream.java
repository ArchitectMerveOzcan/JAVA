package day34lambdaIntStreamAndPojo;


import day32lambda.UtilsClass;

import java.util.stream.IntStream;

public class LambdaIntStream {
    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred01());//5029
        System.out.println(getSumFromSevenToHundred02());//5029
        System.out.println(getMultiplicationFromTwoToEleven());//39916800
        System.out.println(calculateFactorial01(-5)); //Do not use negative numbers for factorial operations 0
        System.out.println(sumOfIntsInGivenRange(9, -4)); //14
        System.out.println(findSumOfDigitsForTheIntsInTheGivenRange(-23, -32));//-23

    }

    //1) Create a method to find the sum of the integers from 7 to 100.

    public static int getSumFromSevenToHundred01(){

        //IntStream.range(7, 101)==> has the same functionality with for-loop in structured programming

        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }
    public static int getSumFromSevenToHundred02(){

        //IntStream.rangeClosed(7, 100)==>has the same functionality with for-loop in structured programming
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);

    }
    //2)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).

    public static int getMultiplicationFromTwoToEleven(){

        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

    //3) Create a method to calculate the factorial of a given number. (5! ==> 1*2*3*4*5)

    public static int calculateFactorial01(int x){

        if(x>0){
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);//120
        }
        System.out.println("Do not use negative numbers for factorial operations");
        return 0;

    }
    public static Object calculateFactorial02(int x){

        return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers for factorial operations";

    }
    //4) Create a method to calculate the sum of even integers between given two integers

    public static int sumOfIntsInGivenRange(int a, int b){

        int x=0;

        if(a>b){
            x=a;
            a=b;
            b=x;
        }

        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum();
    }
    //5)Create a method to calculate the sum of digits of every integer between two given integers
    // 23 and 32 ==> 2+3  2+4 .... 3+2
    public static int findSumOfDigitsForTheIntsInTheGivenRange(int a, int b){
        int x=0;

        if(a>b){
            x=a;
            a=b;
            b=x;
        }

        return IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigits).sum();

    }


}


