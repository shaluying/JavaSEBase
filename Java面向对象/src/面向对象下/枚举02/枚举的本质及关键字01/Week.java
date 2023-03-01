package 面向对象下.枚举02.枚举的本质及关键字01;

public enum Week {
    MONDAY,//表示使用无参构造创建的对象
    TUESDAY("星期二"), //表示使用有参构造创建的对象
    WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    private final String description;//final是建议，不是必须

    Week(){//这里是省略了private，和普通的类有点不同
        System.out.println("无参构造");
        description = "";
    }

    Week(String description) {
        System.out.println("有参构造");
        this.description = description;
    }

}
