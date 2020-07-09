
public class CharacterOperationMethods {

	/**
	 * char to Binary bits
	 * <p>
	 * This method converts a char to its internal binary bits representation.
	 * 
	 * @param c The char that need to be converted.
	 * @param weightDescend The binary code will be arranged in a weight descending way.
	 * @return The binary bits byte array
	 */
	public static byte[] charToBinaryBits(char c, boolean weightDescend) {
		byte[] bits = new byte[16];
		int decimalCode = c;
		int quotient = decimalCode;
		int remainder = 0;
		int count = 0;
		while (quotient != 0) {
        	quotient = decimalCode / 2;
        	remainder = decimalCode % 2;
        	if (weightDescend) {
         	   bits[bits.length - 1 - count] = (byte) remainder;
        	    count++;
       		} else {
         	   bits[0 + count] = (byte) remainder;
            	count++;
        	}
            decimalCode = quotient;
    	}
    	return bits;
	}
	
	/**
     * char to Binary bits
     * <p>
     * This method converts a char's internal binary bits representation to a char.
     * 
     * @param bits a char's internal binary bits representation.
     * @param weightDescend The binary code will be arranged in a weight descending way.
     * @return The binary bits byte array
     */
	public static char binaryBitsToChar(byte[] bits, boolean weightDescend) {
		int c = 0;
		if (weightDescend) {
			int i = bits.length - 1;
			while (i > 0) {
				if (bits[i] == 0) {
					// Do noting
				} else {
					int temp = (int) Math.pow(2, bits.length - i - 1);

					c += temp;
				}
				i--;
			}
		} else {
			int i = 0;
			while (i < bits.length) {
				if (bits[i] == 0) {
					// Do noting
				} else {
					int temp = (int) Math.pow(2, i);
					c += temp;
				}
				i++;
			}
		}
		return (char) c;
	}
	
}
