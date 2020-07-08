
public class MyByteArrayMethods {
    
    /*
     * byte array methods
     */
     
    /**
	 * Right shifting (moving) of a byte Array
	 * <p>
	 * This methods shifts a byte array right-ward according to specified steps.
     * Empty spaces will be filled with placeholders.
	 * 
	 * @param bits The byte array
	 * @param step
	 */
	public static void rightShift(byte[] bits, int step, byte placeholder) {
		if (step >= bits.length) {
			int i = 0;
			while (i < bits.length) {
				bits[i] = placeholder;
				i++;
			}
		} else {
			int i = bits.length - 1 - step;
			while (i >= 0) {
				bits[i + step] = bits[i];
				i--;
			}
			i = 0;
			while (i < step) {
				bits[i] = placeholder;
				i++;
			}
		}
	}
     
     
	/**
	 * Left shifting (moving) of a byte Array
	 * <p>
	 * This methods shifts a byte array left-ward according to specified steps.
     * Empty spaces will be filled with placeholders.
	 * @param bits The byte array
	 * @param step
	 */
	public static void leftShift(byte[] bytes, int step, byte placeholder) {
		if (step >= bytes.length) {
			int i = 0;
			while (i < bytes.length) {
				bytes[i] = placeholder;
				i++;
			}
		} else {
			int i = 0;
			while (i < bytes.length) {
				if (i - step < 0) {
					// Do nothing
				} else {
					bytes[i - step] = bytes[i];
				}
				i++;
			}
			i = bytes.length - 1;
			while (i > bytes.length - 1 - step) {
				bytes[i] = placeholder;
				i--;
			}
		}
	}
     
    /**
	 * Print byte array to Standard Output Device (System.out).
	 * 
	 * @param bytes The byte array
	 */
	public static void printBytes(byte[] bytes) {
		int i = 0;
		while (i < bytes.length) {
			System.out.print(bytes[i]);
			i++;
			if (i == bytes.length) {
				System.out.println();
			}
		}
	}
     

}
