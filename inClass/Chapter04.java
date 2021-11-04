public class Chapter04 {
    /*
    **for debug**
    
    The letter 'A/a' was used to test the methods 
    
    public static void main(String[] args){
        System.out.println(isDigit('A'));
        System.out.println(isLetter('A'));
        System.out.println(isLetterOrDigit('A'));
        System.out.println(isLowerCase('A'));
        System.out.println(isUpperCase('A'));
        System.out.println(toLowerCase('A'));
        System.out.println(toUpperCase('a'));
    }
    */
    

    // will return true if the character is a digit
    public static boolean isDigit(char ch){
        return '0' <= ch && ch <= '9';
    }

    // will return if the character is a digit
    public static boolean isLetter(char ch){
        return 'A' <= ch && ch <= 'Z';
    }

    // will return true if the character is a letter or a digit
    public static boolean isLetterOrDigit(char ch){
        return isLetter(ch) || isDigit(ch);
    }

    // will return true if the character is lower case
    public static boolean isLowerCase(char ch){
        return 'a' <= ch && ch <= 'z';
    }
    
    // will return true if the character is upper case
    public static boolean isUpperCase(char ch){
        return 'A' <= ch && ch <= 'Z';
    }

    // will return the lower case of the character
    public static char toLowerCase(char ch){
        // add 32 to get the Ascii lower case
        return ch += 32;
    }
    
    // will return the upper case of the character
    public static char toUpperCase(char ch){
        // subtract 32 to get the Ascii upper case
        return ch -= 32;
    }

}
