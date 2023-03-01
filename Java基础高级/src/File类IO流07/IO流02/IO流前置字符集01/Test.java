package File类IO流07.IO流02.IO流前置字符集01;

import java.util.Arrays;

/*
     目标：学会自己进行文字的编码和解码，为以后可能用到的场景做准备。

     常见字符集底层字符的编码是什么样的？
        英文和数字等在任何国家的字符集中都占1个字节
        GBK字符中一个中文字符占2个字节
        UTF-8编码中一个中文1般占3个字节
     编码前的字符集和解码时的字符集有什么要求？
        必须一致，否则会出现字符乱码
        英文和数字不会乱码

如何使用程序对字符进行编码？
    String类下的方法：
        byte[] getBytes​()：默认编码 返回字节数组
        byte[] getBytes​(String charsetName)：指定编码 返回字节数组
    如何使用程序进行解码？
        String类的构造器：
        String​(byte[] bytes)：使用默认编码解码
        String​(byte[] bytes, String charsetName))：指定编码解码

 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1、编码：把文字转换成字节（使用指定的编码）
        String name = "abc我爱你中国";
        byte[] bytes = name.getBytes(); // 以当前代码默认字符集进行编码 （UTF-8）
        byte[] bytes1 = name.getBytes("GBK"); // 指定编码
        System.out.println(bytes.length);
        System.out.println(bytes1.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes1));
        System.out.println("-------------");
        // 2、解码：把字节转换成对应的中文形式（编码前 和 编码后的字符集必须一致，否则乱码 ）
        String rs = new String(bytes); // 使用默认的UTF-8解码
        String rs1 = new String(bytes1, "GBK"); // 指定GBK解码
        System.out.println(rs);
        System.out.println(rs1);
    }
}
