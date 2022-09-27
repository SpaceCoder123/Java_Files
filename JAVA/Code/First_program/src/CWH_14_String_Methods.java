public class CWH_14_String_Methods {
    public static void main(String[] args) {
        String word = "Marvelous";
        // we have created a string variable called word
        // let us get the length of the string
        int len_of_string = word.length();
        //System.out.println(len_of_string);

        // let us convert the string from regular to lowercase
        String lower_case_word = word.toLowerCase();
        //System.out.println(lower_case_word);

        // let us convert the string to upper case
        String upper_case_word = word.toUpperCase();
        //System.out.println(upper_case_word);

        // the above methods that are used does not care the nature of strings

        String nonTrimmedString = "          Mohan    ";
        // System.out.println(nonTrimmedString);
        // suppose you want to remove the empty spaces before and after the word
        String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        // suppose you want to get sub string in the main string
        String sentence = "Hello, this is my new sentence";
        String first_Five_removed = sentence.substring(4);
        // System.out.println(first_Five_removed);
        // the first four characters have been removed until the start index matches with 4
        String five_ten_only = sentence.substring(5,10);
        // System.out.println(five_ten_only);
        // here the string starting from 5 and ending at 10, excluding 10 is returned

        // note if you write substring(0) then it is the same thing as returned the original string itself so the method is redundant

        // replace characters in a string at particular locations
        // System.out.println(sentence.replace("l","p")); // note the attributes are case sensitive
        // System.out.println(sentence.replace("l","lll")); // note the attributes are case sensitive

        // check if the string is starting or ending with particular string or item
        // System.out.println(sentence.startsWith("Hello")); // returns boolean. true if the condition matches else false
        // System.out.println(sentence.endsWith("Hello"));

        // get the character value at the particular index value
        System.out.println(sentence.charAt(2));
        System.out.println(sentence.indexOf("e")); // this will return the index value of the first occuring string the particular string
        







    }
}
