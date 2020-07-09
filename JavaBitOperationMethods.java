
public class JavaBitOperationMethods {

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
