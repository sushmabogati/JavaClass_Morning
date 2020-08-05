package day16;

public class ForEachLoopDemo1 {

	public static void main(String[] args) {
		int [][] arr= {{1,2, 4}, {2,3, 4}, {3, 4, 6}};
		for(int i = 0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("======");
		for(int[] ar:arr) {
			for (int a :ar) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
