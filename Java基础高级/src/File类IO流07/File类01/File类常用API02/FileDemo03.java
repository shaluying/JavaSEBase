package File类IO流07.File类01.File类常用API02;

import java.io.File;
import java.io.IOException;

/*
     目标：File类的创建和删除的方法
     - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，
              创建一个新的空文件。 （几乎不用的，因为以后文件都是自动创建的！）
     - public boolean delete() ：删除由此File表示的文件或目录。 （只能删除空目录）
     - public boolean mkdir() ：创建由此File表示的目录。（只能创建一级目录）
     - public boolean mkdirs() ：可以创建多级目录（建议使用的）
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f = new File("Java基础高级\\src\\File类IO流07\\File类01\\File类常用API02\\Demo02.txt");
        // a.创建新文件，创建成功返回true ,反之 ,不需要这个，以后文件写出去的时候都会自动创建
        System.out.println(f.createNewFile());
        File f1 = new File("Java基础高级\\src\\File类IO流07\\File类01\\File类常用API02\\Demo03.txt");
        System.out.println(f1.createNewFile()); // （几乎不用的，因为以后文件都是自动创建的！）
        System.out.println();

        // b.mkdir创建一级目录
        //创建此抽象路径名指定的目录
        File f2 = new File("Java基础高级\\src\\File类IO流07\\File类01\\File类常用API02\\aa");
        System.out.println(f2.mkdir());
        System.out.println();

        // c.mkdirs创建多级目录(重点)
        //创建此抽象路径名指定的目录，包括任何必需但不存在的父目录。
        File f3 = new File("Java基础高级\\src\\File类IO流07\\File类01\\File类常用API02/ccc/ddd/eee/ffff");
        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs()); // 支持多级创建
        System.out.println();

        // d.删除文件或者空文件夹
        System.out.println(f1.delete());
        File f4 = new File("D:\\Program Files\\ModifiableWindowsApps");
        System.out.println(f4.delete()); // 占用一样可以删除

        // 只能删除空文件夹,不能删除非空文件夹.
        File f5 = new File("D:/resources/aaa");
        System.out.println(f5.delete());
    }
}
