package day12;

public class ObjectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDemo1 ob = new ObjectDemo1();
		System.out.println(ob);
		ObjectDemo1 ob1;
		ob1 = new ObjectDemo1();
		System.out.println(ob1);
	
		System.out.println(	new ObjectDemo1());
		
//note:-ASA an object is constructed, a hash code for the obj is assigned. Java converts it into an id.
//day12.ObjectDemo1@15db9742
//		day12.ObjectDemo1@6d06d69c
//		day12.ObjectDemo1@7852e922

	}

}
