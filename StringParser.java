
/**
 * An introduction to Strings and String methods.
 *
 * @author Wilhem Alcivar
 */
public class StringParser
{
    /**
     * Takes a String and returns that String with all characters uppercased.
     * E.G. cat would become CAT. dOnUt would become DONUT.
     *
     * @param s
     * @return String
     * stringName.toUpperCase()---> this is the method of the string class 
     * to turn all the letters in a string to uppercase
     */
    public static String upperCaseString(String s)
    {
        return s.toUpperCase();

    }

    /**
     * Takes a String and returns that String with all characters lowercased.
     * E.G. MOUSE would become mouse. dOnUt would become donut.
     *
     * @param s
     * @return String
     */
    public static String lowerCaseString(String s) {
        return s.toLowerCase();

    }

    /**
     * Takes a String and returns the first character of that string.
     * E.G. cat would return c. Embark would return E.
     *
     * @param s
     * @return String
     */
    public static Character getFirstCharacter(String s) {

        return s.charAt(0); 

    }

    /**
     * Takes a String and returns the character at index n of that string.
     * E.G. cat, 2 would return t. Embark, 4 would return r.
     *
     * @param s
     * @param n
     * @return String
     */
    public static Character getNthCharacter(String s, Integer n) {
        return s.charAt(n);
    }

    /**
     * Takes a String and returns that string with the first character uppercased.
     * E.G. cat would return Cat. cofFee would return CofFee.
     *
     * @param s
     * @return String
     */
    public static String upperCaseFirstCharacter(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    /**
     * Takes a String and returns that string with the first character of each word in it uppercased
     * and then joined.
     * E.G. dog whistle would return DogWhistle. adjuNCT pRoFessOR would return AdjuctProfessor.
     *
     * @param s
     * @return String
     */
    public static String camelCaseString(String s) {

        String c = s.toLowerCase();
        String ten = c.split(" ")[0];
        String five = c.split(" ")[1];
        String twenty = ten.substring(0,1).toUpperCase() + ten.substring(1);
        String twentyone = five.substring(0,1).toUpperCase() + five.substring(1);
        String numbersandletters = twenty + twentyone;
        return numbersandletters.trim();
        
    }

    /**
     * Takes a String and returns that string with each character lowercased
     * and then joined with an underscore
     * E.G. dog whistle would return dog_whistle. adjuNCT pRoFessOR would return adjuct_professor.
     *
     * @param s
     * @return String
     */
    public static String snakeCaseString(String s) {
        String a = s.replaceAll(" ", "_").toLowerCase();
        return a; 
    }

    /**
     * Takes a String and returns the length of that string
     * E.G. cat would return 3. extra would return 5.
     *
     * @param s
     * @return String
     */
    public static Integer getLength(String s) {
        int length = s.length();
        return length; 
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return false. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqual(String s1, String s2) {
        return s1.equals(s2);
       
    }

    /**
     * Takes in two strings and returns true if they are equal
     * E.G. example and shelf would return false. 
     * cat and CaT would return true. 
     * Dog and Dog would return true
     *
     * @param s1
     * @param s2
     * @return String
     */
    public static Boolean isEqualIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }
}
