package day0117_08teacher_code.com.atguigu.exer.overload;

public class ArrayTools {
    void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void sort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    String toString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }

    String toString(double[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }

    String toString(char[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                str += arr[i];
            } else {
                str += "," + arr[i];
            }
        }
        str += "]";
        return str;
    }
}
