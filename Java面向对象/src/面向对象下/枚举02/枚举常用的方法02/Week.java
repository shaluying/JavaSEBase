package 面向对象下.枚举02.枚举常用的方法02;

public enum Week{
    MONDAY("星期一"), //表示调用有参构造
    //等价于 public static final Week MONDAY = new Week("星期一");
    TUESDAY,	//表示调用无参构造
    //等价于 public static final Week TUESDAY = new Week();
    WEDNESDAY,THURSDAY,FIRDAY,SATURDAY,SUNDAY;

    private String description;
    Week(){

    }
    Week(String description){this.description = description;}

    @Override
    public String toString() {
        return "Week{" +
                "description='" + description + '\'' +
                '}';
    }
}