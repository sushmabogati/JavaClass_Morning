package day14;
//array is a collection of elements of same data type arranged in a sequential manner

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];// I@15db9742 int is primitive data type so it can not have an obj here, I is
								// proxcy obj
		System.out.println(arr);//
		System.out.println(arr.length);// length of the array i.e total number of elements
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 4;
		System.out.println(arr[0]);//if there was data in a[0] then it would give default value of int which is 0
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
