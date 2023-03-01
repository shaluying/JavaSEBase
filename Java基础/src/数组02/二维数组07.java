package 数组02;

public class 二维数组07 {
	public static void main(String[] args) {
		// 二维数组
		int[][] arr = new int[3][];
		
		System.out.println(arr);//[[I@7852e922
		
		System.out.println(arr[0]);//null
		System.out.println(arr[1]);//null
		System.out.println(arr[2]);//null
		
		int[] arr_1 = {1,2,3};
		arr[0] = arr_1;
		
		int[] arr_2 = {4,5};
		arr[1] = arr_2;
		
		int[] arr_3 = {6,7,8,9};
		arr[2] = arr_3;
		
		System.out.println(arr[0]);//[I@4e25154f
		System.out.println(arr[1]);//[I@70dea4e
		System.out.println(arr[2]);//[I@5c647e05
		
		System.out.println(arr[0][0]);//1
		System.out.println(arr[0][1]);//2
		System.out.println(arr[0][2]);//3
		
		System.out.println(arr[1][0]);//4
		System.out.println(arr[1][1]);//5
		
		System.out.println(arr[2][0]);//6
		System.out.println(arr[2][1]);//7
		System.out.println(arr[2][2]);//8
		System.out.println(arr[2][3]);//9
	}
}
