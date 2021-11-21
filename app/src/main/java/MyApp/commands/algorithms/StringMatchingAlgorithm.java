package MyApp.commands.algorithms;

public class StringMatchingAlgorithm {
    public static String match(String Text, String searchString){
        int stringSize = searchString.length();
        int textSize = Text.length();
        char[] text = Text.toCharArray();
        char[] sstring = searchString.toCharArray();
        int i = 0;
        while ((i + stringSize) <= textSize) {
            int j = 0;
            while (text[i + j] == sstring[j]) {
                j += 1;
                if (j >= stringSize)
                    return "found. The string is between the index: " + (i-1) + " and " + (i + stringSize-2) + "." ;
            }
            i += 1;
        }
        return "Not found";
    }
}
