package day5;

public class DataTypeDemo {
	// 2 types of data types. Reference and primitive data types. 8 primitive type
	// and 3 reference type. Class enum interface are under reference.
	// boolean and numeric
	// purpose of dat- to determine ,type of operation, memory size and what kind of
	// value is takes
	public static void main(String[] args) {
		byte b1 = 127;// max range
		byte b2 = -128;// min value
		/*
		 * 1 byte = 8 bit, default value is 0 ad range is -2^7-1 to 2^7. In above max
		 * and min value is calculated from range.-2^7-1 to 2^7 from a table to find out
		 * range do this. min value is -2^bit equivalent number -1 and max value is
		 * (2^(equivalent value to bit-1)to (2^equivalent value in bit-1)-1 eg. 1 byte =
		 * 8 bit. Therefore range is -2^8-1 to (2^8-1)-1
		 */
		short s1 = 32767;// max range;
		short s2 = -32767;// min range

		int i1 = 2147483647;// max range
		int i2 = -2147483647;// min range
		// memorizing is not posible in java and is not necessary because there is a
		// library classes that can give us max and min value
		// and that is Integer class
		long l1 = 9223372036854775807L;// max range note Long data type should have l to it.
		long l2 = -9223372036854775807L;// min range

		float f1 = 3.4028235E38F;// max range float should have capital F in the end
		float f2 = 1.4E-45F;// min range

		double d1 = 1.7976931348623157E308; // double data type is ok without D at the end max range
		double d2 = 4.9E-324;// min range

		char c1 = 65535;// mx range
		char c2 = 0;// min range

		boolean bb1 = true;// no number is related to boolean.
		boolean bb2 = false;
		/*
		 * Data types are used as per requirement. Generally int is used but for long
		 * numbers like phone number long is used. there are library classes which can
		 * be used. For even longer numbers To work with number we have Byte short int
		 * long, to work with real numbers we have float and double user char for
		 * character(anything inside single quotation mark is character. to work with
		 * true and false work with boolean data type.)
		 */
	}

}
