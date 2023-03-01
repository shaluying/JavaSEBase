package 集合04.斗地主游戏发牌03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doudizhu {
    private static List<Card> allCards = new ArrayList<>();

    //静态代码块 初始化 静态类变量
    static {
        //点数 确定数量及类型 用数组
        String[] sizeArr = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //花色 确定数量及类型 用数组
        String[] colorArr = {"♠", "♥", "♣", "♦"};

        //代表牌的大小属性
        int index = 0;

        for (int i = 0; i < sizeArr.length; i++) {
            index++;
            for (int j = 0; j < colorArr.length; j++) {
                //生成一张牌
                Card card = new Card(sizeArr[i], colorArr[j], index);
                //将牌加入到集合中
                allCards.add(card);
            }
        }

        //将大小王加入到集合中
        Collections.addAll(allCards, new Card("", "🃏", ++index), new Card("", "👲", ++index));

        System.out.println("新牌：" + allCards);
    }

    /**
     * @return 返回被打乱顺序的牌
     */
    private static List<Card> getshaffleCards() {
        Collections.shuffle(allCards);
        System.out.println("乱序牌：" + allCards);
        return allCards;
    }

    /**
     * @return 返回生成的每个人扑克牌和三张底牌 在一个集合中
     */
    public static List<List<Card>> getThreeCards() {
        //数量类型确定 不用数组的原因 是 兼容游戏规则可能改成4个人玩
        List<List<Card>> threeCard = new ArrayList<>();

        //获取被打乱顺序的牌
        List<Card> shaffleCard = getshaffleCards();

        List<Card> cardOne = new ArrayList<>();
        List<Card> cardTwo = new ArrayList<>();
        List<Card> cardThree = new ArrayList<>();
        //除去三张底牌 生成每人的牌
        for (int i = 0; i < shaffleCard.size() - 3; i++) {
            if (i % 3 == 0) {
                cardOne.add(shaffleCard.get(i));
            } else if (i % 3 == 1) {
                cardTwo.add(shaffleCard.get(i));
            } else if (i % 3 == 2) {
                cardThree.add(shaffleCard.get(i));
            }
        }

        //生成三张底牌 使用了List集合的subList方法截取某一段
        List<Card> cardLast = shaffleCard.subList(shaffleCard.size() - 3, shaffleCard.size());

        Collections.sort(cardOne);
        Collections.sort(cardTwo);
        Collections.sort(cardThree);

        //将每人的牌和三张底牌添加到集合中
        Collections.addAll(threeCard, cardOne, cardTwo, cardThree, cardLast);
        return threeCard;
    }


}
