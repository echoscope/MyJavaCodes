
public class MyString {

    /** 
    * String Divide
    * <p>
    * This method divides a String into substrings of equal length.
    * The method generates an array of String that store those substrings.
    * Substrings that don't have enough characters to fulfill the equal length will be appended with given placeholder.
    * 
    * @param str The String to be divided
    * @param splitLength The length of splitting
    * @param placeholder The placeholder
    * @return A String array to store substrings
    */ 
    public static String[] StringDivide(String str, int splitLength, char placeholder) {
        int numofSubStrs;
        if(str.length() % splitLength == 0){
            numofSubStrs = str.length() / splitLength;
        } else {
            numofSubStrs = str.length() / splitLength + 1;
        }
        String[] subStrs = new String[numofSubStrs];
        int count = 0;
        int i = 0;
        while(i < str.length()){
            int j = i;
            String subStr = "";
            while(j < i + splitLength){
            	char c = placeholder;
            	try {
            		c = str.charAt(j);
            	} catch(StringIndexOutOfBoundsException e) {
            		// Do nothing
            	}
            	subStr += c;
                j++;
            }
            subStrs[count] = subStr;
            i += splitLength;
            count++;
        }
        return subStrs;
    }
    
    
    
    
    
}
