package day22;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Good";
		System.out.println(s1);
	 s1.concat(" Morning");
		System.out.println(s1);
		System.out.println("==========");
		StringBuilder sb = new StringBuilder("Good");
		System.out.println(sb);
		sb.append(" Morning");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 8);
		System.out.println(sb);
		sb.insert(0, "Hello");
		System.out.println(sb);

	}

}
/*for reverse
 *String r = " ";
 *for(int i=s1.length()-1;i>=0; i--){
 *r = r+1s1.charAt(i)}
 *sout(r);*/
 