
public class MyCharArrayMethods {

	/*
	 * Char Array Methods
	 */

	/**
	 * The string ending character 'EOF' definition in the char array
	 */
	private static final char EOF = '\0';
	
	/**
	 * Get all characters that exits in the given String
	 * 
	 * @param str The given string
	 * @return A char array of all characters exists in the String.
	 */
	public static char[] getAllCharacters(String str) {
		char[] chars = str.toCharArray();
		char[] allCharacters = new char[chars.length]; Main.initialize(allCharacters);
		int i = 0;
		while(i < chars.length) {
			if(!Main.contains(allCharacters, chars[i])) {
				Main.append(allCharacters, chars[i]);
			}
			i++;
		}
		return allCharacters;
	}

	/**
	 * Whether contains all given chars
	 * <p>
	 * The method checks whether a given char set all exits in another given char set.
	 * 
	 * @param chars The char set that need to be checked.
	 * @param target The char set that need to be check existence
	 * @return Result
	 */
	public static boolean containsAll(char[] chars, char[] target) {
		int length = Main.getLength(target);
		int i = 0;
		while(i < length) {
			if(!Main.contains(chars, target[i])) {
				return false;
			}
			i++;
		}
		return true;
	}

	/**
	 * Whether contains a specified char
	 * <p>
	 * This method look for the given char in the given char array that stores a String.
	 * If exits returns true, else false.
	 * 
	 * @param chars The given char array
	 * @param c The given char
	 * @return Result
	*/
	public static boolean contains(char[] chars, char c) {
		int length = Main.getLength(chars);
		int i = 0;
		while(i < length) {
			if(chars[i] == c) {
				return true;
			}
			i++;
		}
		return false;
	}

	/**
	 * Char appending
	 * <p>
	 * Append a char to the end of a  string stored in a given char array.
	 * 
	 * @param chars The given char array
	 * @param c The char to be appended
	 * @return true if append successfully, false if not enough space in the given char array.
	 */
	public static boolean append(char[] chars, char c) {
		int length = Main.getLength(chars);
		if(length == chars.length && length != 0) {
			return false;
		} else {
			chars[length] = c;
			return true;
		}
	}

	/**
 	 * Print char array
     * <p>
	 * Print char array to Standard output device.
	 */
	public static void printChars(char[] chars) {
		int length = Main.getLength(chars);
		int i = 0;
		while(i < length) {
			System.out.print(chars[i]);
			i++;
			if(i == length) {
				System.out.println();
			}
		}
	}

	/**
	 * Get char array length
	 * <p>
	 * This method returns how long a String existed in the given char array.
	 * String ending is known by 'EOF'.
	 * 
	 * @param chars
	 * @return
	 */
	public static int getLength(char[] chars) {
		int i = 0;
		while(i < chars.length) {
			if(chars[i] == EOF) {
				return i;
			}
			i++;
		}
		return chars.length;
	}

	/**
	 * char array initializer
	 * <p>
	 * This method initialize a char array, assigning every unit of it as 'EOF'.
	 * 
	 * @param chars The array to be initialized
	 */
	public static void initialize(char[] chars) {
		int i = 0;
		while(i < chars.length) {
			chars[i] = EOF;
			i++;
		}
	}
	
}
