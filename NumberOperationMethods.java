
public class NumberOperationMethods {
	
	/**
	 * Binary to Hexadecimal
	 * <p>
	 * Convert a binary bits expression to a hexadecimal character
	 * 
	 * @param fourBits The four binary bits representation
	 * @return The Hexadecimal character
	 */
	public static char binaryToHexadecimal(byte[] fourBits) {
		int decimal = Main.binaryToDecimal(fourBits);
		switch (decimal) {
		case 0:
			return '0';
		case 1:
			return '1';
		case 2:
			return '2';
		case 3:
			return '3';
		case 4:
			return '4';
		case 5:
			return '5';
		case 6:
			return '6';
		case 7:
			return '7';
		case 8:
			return '8';
		case 9:
			return '9';
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';
		default:
			return '\0';
		}
	}
	
	/**
	 * Binary to Decimal
	 * <p>
	 * Convert a binary bits representation to decimal number
	 * 
	 * @param bits The binary bits representation
	 * @return The converted decimal number
	 */
	public static int binaryToDecimal(byte[] bits) { // Weight Ascend
		int decimal = 0;
		int i = 0;
		while (i < bits.length) {
			if (bits[i] == 0) {
				// Do nothing
			} else {
				decimal += Math.pow(2, bits.length - 1 - i);
			}
			i++;
		}
		return decimal;
	}

    public static void bitOperationExample() {
    
		// Bit operation example: 23
		/*
		 * 23 0001 0111
		 * 
		 * 0001 0111 0001 0111 0001 0111 1111 1111 & 1111 1111 | 1111 1111 ^ -----------
		 * ----------- ----------- 0001 0111 = 23 1111 1111 = 255 1110 1000 = 232
		 */
		int num = 23;
		System.out.printf("Origin: %d\n", num);
		num = num & 255;
		System.out.printf("%d ", num);
		num = 23;
		num = num | 255;
		System.out.printf("%d ", num);
		num = 23;
		num = num ^ 255;
		System.out.printf("%d\n", num);
		num = 23;

		/*
		 * 23 0001 0111
		 * 
		 * 0001 0111 0001 0111 0001 0111 0000 0000 & 0000 0000 | 0000 0000 ^ -----------
		 * ----------- ----------- 0000 0000 = 0 0001 0111 = 23 0001 0111 = 23
		 */
		num = num & 0;
		System.out.printf("%d ", num);
		num = 23;
		num = num | 0;
		System.out.printf("%d ", num);
		num = 23;
		num = num ^ 0;
		System.out.printf("%d\n", num);
		num = 23;

		/*
		 * 23 0001 0111
		 * 
		 * 0001 0111 0001 0111 ~ 0000 0001 + ----------- ----------- 0000 1000 = 8 ? x
		 * --> v 0001 1000 = 24 * -1 = -24
		 */
		num = ~num;
		System.out.printf("%d\n", num);
		num = 23;

		/*
		 * 23 0001 0111
		 * 
		 * 23 >> 2 23 << 2 0000 0101 = 5 0101 1100 = 92
		 */
		num = num >> 2;
		System.out.printf("%d\n", num);
		num = 23;
		num = num << 2;
		System.out.printf("%d\n", num);
		num = 23;
	}

}
