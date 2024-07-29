package _03_Printing_Binary;

import java.util.Iterator;

public class _01_BinaryPrinter {
    /*
     * Complete the methods below so they print the passed in parameter in binary.
     * Do not use the Integer.toBinaryString method!
     * Use the main method to test your methods.
     */


    public static void printByteBinary(byte b) {
        // We first want to print the bit in the one's place
    	 int byt = Byte.toUnsignedInt(b);
        // Shift b seven bits to the right
   
        // Use the & operator to "mask" the bit in the one's place
        // This can be done by "anding" (&) it with the value of 1
    	for (int i = 8; i -->0;) {
    		 byt = (int) b>>i;
    		System.out.print(byt&1);
		}
    	
        // Print the result using System.out.print (NOT System.out.println)

        //Use this method to print the remaining 7 bits of b
    }

    public static void printShortBinary(short s) {
        // Create 2 byte variables
    	int sh = Short.toUnsignedInt(s);
    	byte upper = (byte) (sh>>8);
    	byte lower = (byte) (sh&0xFF);
    	printByteBinary(upper);
    	System.out.println("\n");
    	printByteBinary(lower);
        // Use bit shifting and masking (&) to save the first
        // 8 bits of s in one byte, and the second 8 bits of
        // s in the other byte
    	
        // Call printByteBinary twice using the two bytes
        // Make sure they are in the correct order
    }

    public static void printIntBinary(int i) {
        // Create 2 short variables
    	
    	short upper = (short) (i>>16);
    	short lower = (short) (i&0xFFFF);
    	printShortBinary(upper);
    	System.out.println("\n");
    	printShortBinary(lower);
        // Use bit shifting and masking (&) to save the first
        // 16 bits of i in one short, and the second 16 bits of
        // i in the other short

        // Call printShortBinary twice using the two short variables
        // Make sure they are in the correct order
    }

    public static void printLongBinary(long l) {
        // Use the same method as before to complete this method
    	int upper = (int) (l>>32);
    	int lower = (int) (l&0xFFFFFFFF);
    	printIntBinary(upper);
    	System.out.println("\n");
    	printIntBinary(lower);
    }

    public static void main(String[] args) {
    	//byte e = 0b00100010;
    	//short r = (short) 0b1101_1000_0101_0101;
    	//int t = 0b1111_0000_1100_1010_0000_1111_0011_1101;
    	long y = 0b0111_0000_1100_1010_0000_1111_0011_1101;
    	y = y<<8;
        // Test your methods here
    	//printByteBinary(e);
    //	printShortBinary(r);
    	//printIntBinary(t);
    	printLongBinary(y);
    }
}
