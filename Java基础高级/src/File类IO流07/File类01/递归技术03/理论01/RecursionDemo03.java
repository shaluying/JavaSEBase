package File类IO流07.File类01.递归技术03.理论01;

/**
      目标：1 - n求和
 */
public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else {
            return f(n - 1)  + n;
        }
    }
}












