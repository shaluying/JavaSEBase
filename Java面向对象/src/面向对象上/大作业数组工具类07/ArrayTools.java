package 面向对象上.大作业数组工具类07;

public class ArrayTools {

    // 反转[start,end]范围内的元素
    void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // 复制arr数组，新数组的长度newLength。
    // 如果newLength<=arr.length，则复制arr数组的[0, newLength-1]范围的元素，
    // 如果newLength>arr.length，则复制arr数组的所有元素到新数组，剩下的元素则默认。
    int[] copyOf(int[] arr, int newLength) {
        int[] arrNew = new int[newLength];
//        if (newLength <= arr.length) {
//            for (int i = 0; i < arrNew.length; i++) {
//                arrNew[i] = arr[i];
//            }
//        } else {
//            for (int i = 0; i < arr.length; i++) {
//                arrNew[i] = arr[i];
//            }
//        }
        for (int i = 0; i < arrNew.length && i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        return arrNew;
    }

}
