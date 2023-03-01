package 常用API_正则表达式_Lambda_算法02.Lambda表达式05;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢~~~~~");
            }
        };
        a.run();

        // 注意：lambda并不是可以简化所有匿名匿名内部类形式！！
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式（函数式接口）
        //因为Aniamal是抽象类不是接口所以匿名内部类不可以用Lambda表达式简化
//       Animal a1 = () -> {
//           System.out.println("");
//       };
//        a1.run();
    }
}


abstract class Animal {
    public abstract void run();
}


