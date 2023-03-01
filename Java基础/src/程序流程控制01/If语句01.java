package 程序流程控制01;

import java.util.Scanner;

/**
 * 目标：学会使用if分支结构解决问题，理解其流程。
 */

public class If语句01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 需求：心跳（60 - 100）之间是正常的，否则系统提示进一步检查
        // 格式1： if(条件表达式){  代码... }

        System.out.println("请输入心跳：");
        int heartBeat = sc.nextInt();

        if (heartBeat > 60 && heartBeat < 100) {
            System.out.println("您的心跳正常");
        }
        if (heartBeat < 60 || heartBeat > 100) {
            System.out.println("请您进一步检查！");
        }

//        if (heartBeat > 60 && heartBeat < 100) {
//            System.out.println("您的心跳数据是：" + heartBeat + " 您的心跳正常");
//        } else {
//            System.out.println("您的心跳数据是：" + heartBeat + " 请您进一步检查！");
//        }
//        System.out.println("----------------------------------");

        // 格式2： if(条件表达式){ 代码... } else {  代码... }
        // 需求：发红包。
        double money = 10000;

        System.out.println("请输入想要发送红包的金额：");
        double redEnvelope = sc.nextDouble();

        if (redEnvelope < money) {
            money -= redEnvelope;
            System.out.println("红包发送成功，您的余额还剩：" + money);
        } else {
            System.out.println("您的余额不足！");
        }
        System.out.println("-----------------------------------");

        // 格式3： if(条件表达式){ 代码...}else if(条件表达式){ 代码... } ... else{ 代码...}
        // 绩效系统： 0-60 C  60-80 B 80-90 A 90-100 A+

        System.out.println("请输入成绩：");
        int score = sc.nextInt();

        if (score < 60 && score >= 0) {
            System.out.println("您的绩效是C");
        } else if (score < 0) {
            System.out.println("成绩输入有误！");
        } else if (score < 80) {
            System.out.println("您的绩效是B");
        } else if (score < 90) {
            System.out.println("您的绩效是A");
        } else if (score <= 100) {
            System.out.println("您的绩效是A+");
        } else {
            System.out.println("成绩输入有误！");
        }

    }
}
