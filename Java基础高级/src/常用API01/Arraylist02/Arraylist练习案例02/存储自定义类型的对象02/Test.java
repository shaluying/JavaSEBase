package 常用API01.Arraylist02.Arraylist练习案例02.存储自定义类型的对象02;

import java.util.ArrayList;

/**
 * 案例：集合存储自定义元素并遍历。
 * 需求：定义电影类（名称，分值，演员），创建3个电影对象，代表三部影片，存入集合中并遍历。
 * 《肖生克的救赎》, 9.7 , 罗宾斯
 * 《霸王别姬》, 9.6 , 张国荣、张丰毅
 * 《阿甘正传》, 9.5 , 汤姆.汉克斯
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("《肖申克的救赎》", 9.7, new String[]{"罗宾斯"}));
        movies.add(new Movie("《霸王别姬》", 9.6, new String[]{"张国荣", "张丰毅"}));
        movies.add(new Movie("《阿甘正传》", 9.5, new String[]{"汤姆.汉克斯"}));

        System.out.println(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }
}
