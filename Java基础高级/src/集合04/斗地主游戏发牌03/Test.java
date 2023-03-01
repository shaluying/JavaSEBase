package 集合04.斗地主游戏发牌03;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        int total = 0;
        while (true) {
            List<List<Card>> threeCard = Doudizhu.getThreeCards();
            System.out.println("小明：" + threeCard.get(0));
            System.out.println("小刘：" + threeCard.get(1));
            System.out.println("小芳：" + threeCard.get(2));
            System.out.println("底牌：" + threeCard.get(3));
            System.out.println("---------------------------");
            total++;
            if (threeCard.get(3).get(0).getColor() == "👲" || threeCard.get(3).get(1).getColor() == "👲" || threeCard.get(3).get(2).getColor() == "👲") {
                System.out.println(total);
                break;
            }
        }

    }
}
