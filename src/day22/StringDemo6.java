package day22;

public class StringDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intro = "My name is Sushma Bogati, I am from Dallas Texas. I am a full stack developer, cosmetologist and BBA graduate.";
		String [] words = intro.split(" ");
		for(String w : words) {
			System.out.println(w);
		}
		words = intro.split(",");
		for(String w : words) {
			System.out.println(w);
		}
		

	}

}
