package day33lambda;

import day32lambda.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaStringUsage {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");

        printInUpperCase(l); // TOM ALLEY MARK AMANDA JOHN JACKSON MARRY ALBERTO TUCKER BEN
        System.out.println();
        printInUpperCase02(l); // [TOM, ALLEY, MARK, AMANDA, JOHN, JACKSON, MARRY, ALBERTO, TUCKER, BEN]

        printEleSortedByLengths(l); // TOM BEN MARK JOHN ALLEY MARRY AMANDA TUCKER JACKSON ALBERTO
        System.out.println();

        printEleInReverseOrderSortedByLength(l); //JACKSON ALBERTO AMANDA TUCKER ALLEY MARRY MARK JOHN TOM BEN
        System.out.println();

        printDistinctEleSortedByLastChar(l); // AMANDA MARK TOM JOHN JACKSON BEN ALBERTO TUCKER ALLEY MARRY
        System.out.println();

        printSortedByLengthAndSortedByInitial(l); // BEN TOM JOHN MARK ALLEY MARRY AMANDA TUCKER ALBERTO JACKSON
        System.out.println();

        removeIfTheLengthIsGreaterThanFive(l); // [TOM, ALLEY, MARK, JOHN, MARRY, BEN]

        printRemoveIfStartingWithAOrEndingWithN01(l); // [TOM, MARK, MARRY]
        printRemoveIfStartingWithAOrEndingWithN02(l); // [TOM, MARK, MARRY]

        removeIfEleLengthIsBetweenFiveAndNineOrEndingWithO(l);//[TOM, MARK]

        System.out.println(checkLengthToBeLess(l)); //true

        System.out.println(checkNotToStartWithX(l)); //true

        System.out.println(checkAnyEleEndingWithR(l)); //false

    }

    //Task 1) Create a method to print all list elements in uppercase.

    //1.Way:
    public static void printInUpperCase(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(UtilsClass::printlnTheSameLineWithASpace);
    }

    //2.Way:
    public static void printInUpperCase02(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }

    //Task 2) Create a method to print the elements after ordering according to their lengths
    public static void printEleSortedByLengths(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printlnTheSameLineWithASpace);
    }

    //Task 3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printEleInReverseOrderSortedByLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printlnTheSameLineWithASpace);
    }

    //Task 4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctEleSortedByLastChar(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printlnTheSameLineWithASpace);
    }

    //Task 5) Create a method to sort the elements according to their lengths then according to their first character
    public static void printSortedByLengthAndSortedByInitial(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(UtilsClass::printlnTheSameLineWithASpace);
    }

    //Task 6) Remove the elements if the length of the element is greater than 5
    public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        System.out.println(list);
    }

    // Task 7) Remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'

    //1.Way:
    public static void printRemoveIfStartingWithAOrEndingWithN01(List<String> list) {
        list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');
        System.out.println(list);
    }

    //2.Way:
    public static void printRemoveIfStartingWithAOrEndingWithN02(List<String> list) {
        list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);
    }

    // Task 8) Remove the elements if the lengths is between 5 and 9 or ending with 'o'
    public static void removeIfEleLengthIsBetweenFiveAndNineOrEndingWithO(List<String> list) {
        Predicate<String> checkCondition = t -> (t.length() > 4 && t.length() < 10) || t.endsWith("o");
        list.removeIf(t -> checkCondition.test(t));
        System.out.println(list);
    }

    // Task 9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkLengthToBeLess(List<String> list) {
        return list.stream().allMatch(t -> t.length() < 7);
    }

    //Task 10) Create a method to check if the initial of any elements is not uppercase "X"

    public static boolean checkNotToStartWithX(List<String> list) {
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //Task 11) Create a method to check if at least one of the elements ending with "L"
    public static boolean checkAnyEleEndingWithR(List<String> list) {
        return list.stream().anyMatch(t -> t.endsWith("L"));
    }

}