package day0118_09teacher_code.com.atguigu.encapsulability;

public class TestShortCut {
    public static void main(String[] args) {
        int[] arr = {5,3,1,5,6,2,8};

        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
