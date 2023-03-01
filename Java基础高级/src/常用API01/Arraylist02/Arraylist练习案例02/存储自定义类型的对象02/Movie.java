package 常用API01.Arraylist02.Arraylist练习案例02.存储自定义类型的对象02;

import java.util.Arrays;

/**
 案例：集合存储自定义元素并遍历。
 需求：定义电影类（名称，分值，演员），创建3个电影对象，代表三部影片，存入集合中并遍历。
 《肖生克的救赎》, 9.7 , 罗宾斯
 《霸王别姬》, 9.6 , 张国荣、张丰毅
 《阿甘正传》, 9.5 , 汤姆.汉克斯
 */

public class Movie {
    private String name;
    private double score;
    private String[] actor;

    public Movie() {
    }

    public Movie(String name, double score, String[] actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor=" + Arrays.toString(actor) +
                '}';
    }
}
