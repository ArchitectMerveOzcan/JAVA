package day06stringmanipulations;

public class MyNotes02 {

        public static void main(String[] args) {

            // 14. contains() method: Checks the characters (just a single character or multiple characters) exist or not inside the String.

            String str = "Java is easy";

            boolean isExist = str.contains("a"); // Does the String contains "a" ? ==> true
            boolean isExist2 = str.contains("x"); // Does the String contains "x" ? ==> false
            boolean isExist3 = str.contains("Java"); // Does the String contains "Java" ? ==> true
            boolean isExist4 = str.contains("java"); // Does the String contains "java" ? ==> false  (case sensitivity)

            // 15. startsWith() Methods:

            // i) startsWith() method 1- (String Prefix):
            boolean result = str.startsWith("J"); // Is the String starting with "J"? ==> true
            boolean result2 = str.startsWith("Java"); // Is the String starting with "Java"? ==> true

            // ii) startsWith() method 2- (String Prefix, int toffset):
            // If you use startsWith() method with 2 parameters, second parameter means skip the first characters.
            // Why do we need this method? Because sometimes we want to check if the 6.character "i" or not in the String.

            boolean res = str.startsWith("i", 5); // skip first 5 characters, then focuses on the 6.character is "i" ==> true
            // Java İs easy

            // 16. endsWith() method: Checks the last character or last characters in a String
            String s = "Do practise to be better";

            boolean rslt = s.endsWith("r"); // true
            boolean rslt2 = s.endsWith("e"); // false
            boolean rslt3 = s.endsWith("better"); // true

            // 17. concat() method: Second way to do concatenation, it is same with the "+" in Java.
            // Which one is better to use? If Java created a method for a specific task, using "concat() method" is better everytime. This is general rule.

            String m = s.concat("!"); // ==> Do practice to be better!
            String n = s.concat("!").concat("..."); // ==> Do practice to be better!...
            //If you use multiple methods side by side, it is called "method chain"

            // 18.trim() method: Removes spaces from the beginning and from the end, it does not touch spaces in the middle
            String fullName = "    Tom Hanks    ";
            String fixedFullName = fullName.trim(); // ==> "Tom Hanks"

            // 19.isEmpty() method: Returns true if the String does not have any character, returns false if the String has any character.
            // str.length()==0 and isEmpty() have same meaning but to check if a String is empty using isEmpty() is preferable.

            String sentence = "String is a non-primitive data type in Java";

            boolean myResult = sentence.isEmpty(); // false (because there is many characters in String)
            // isEmpty("")==>true, isEmpty(" ")==>false  (space is a character for isEmpty() method)

            // 20.isBlank() method: It is very similar to isEmpty method; but isBlank() will give you "true" if you use space character.
            // isBlank("")==>true, isBlank(" ")==>true (space is not a character for isBlank() method like a people :)
            boolean myResult2 = sentence.isBlank(); // false
        }
    }
