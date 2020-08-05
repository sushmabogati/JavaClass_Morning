package day22;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intro = "I am Sushma Bogati, from  Dallas Texas. I am a full stack developer, cosmetologist and BBA graduate";
		StringTokenizer st = new StringTokenizer(intro);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("=============");
		st = new StringTokenizer(intro, ",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			
		}
		
	}

}
