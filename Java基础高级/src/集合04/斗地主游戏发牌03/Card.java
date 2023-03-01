package 集合04.斗地主游戏发牌03;

public class Card implements Comparable<Card> {
    private String size;
    private String color;
    private int index;

    public Card() {
    }

    public Card(String size, String color, int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return size + color;
    }

    @Override
    public int compareTo(Card card) {
        return card.index - this.index;
    }
}
