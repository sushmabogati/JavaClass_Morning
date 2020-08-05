package day6;

public class TypeCastingDemo1 {
	public static void main(String[] args) {
		//type conversion is only for numbers only.
		//there is no type casting for boolean
		//bite short eat long flat double
		//byte-> short---->int---->long--->float--->double. The conversion from smallest data type to bigger is implicit
		//the conversion from bigger to smaller data type is forceful and is explicit
		//for implicit i.e while going from smaller to to bigger nothing has to be done
		byte b= 100;
		short s =b;
		int i = s;
		long l= i;
		float f = l;
		double d =f;
		System.out.println("b is "+b);
		System.out.println("s is "+s);
		System.out.println("i is "+i);		
		System.out.println("l is "+l);
		System.out.println("d is "+f);
		
		//for explicit type casting while going from bigger to smaller we have to force it.
		//Garbage value is thrown or some data value might be lost while doing explicit conversion
		double d1 = 100.45;
		float f1 =(float)d1;
		long l1 = (long)f1;
		int i1 = (int)l1;
		short s1 = (short)i1;
		byte b1 = (byte)s1;
		System.out.println("d1 is "+d1);
		System.out.println("f1 is "+f1);
		System.out.println("l1 is "+l1);
		System.out.println("s1 is "+s1);
		System.out.println("b1 is "+b1);
		
		char c1 = 97;
		short s11 =97;
		System.out.println(c1);
		System.out.println(s11);
		
		char c11 = 'a';
		short s111 = 'a';
		System.out.println(c11);
		System.out.println(s111);
		
		 char c3 = 65;
		 short s1111 =(short)65;//forcefully has to be converted.
		 System.out.println(c3);
		 System.out.println(s1111);
		
		
	}

}
