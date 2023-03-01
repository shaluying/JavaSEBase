package 方法03;

public class 方法练习05 {
    public static void main(String[] args) {
        // 需求：定义方法，可以打印任意整型数组的内容
        // 比如 [12, 32, 23]
        int[] arr = {5, 8, 9, 65, 14, 53, 87};
        printArray(arr);
        System.out.println("--------------------");

        int[] num = new int[]{8, 95, 65, 41, 78, 23, 20};
        printArray(num);
        System.out.println("--------------------");

        int[] num01 = null;
        int[] num02 = {};
        printArray(num01);
        printArray(num02);
        System.out.println("----------------");

        System.out.println(searchIndex(num02, 9));
        System.out.println(searchIndex(num01, 8));
        System.out.println(searchIndex(num, 41));
    }


    public static void printArray(int[] arr) {
        System.out.print("[");

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1) {
//                System.out.print(arr[i] + ", ");
//            } else {
//                System.out.print(arr[i]);
//            }
                System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i]);
            }
        }

        System.out.println("]");
    }


    public static int searchIndex(int[] arr, int num) {
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    return i;
                }
            }
        }
        return -1;
    }


}
