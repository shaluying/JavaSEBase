package 面向对象下.枚举02.枚举练习03.月份枚举类;

/*
声明月份枚举类Month：
①声明一个属性，私有化，加final修饰
- description（描述，例如：JANUARY的description为一月，FEBRUARY的description为二月，依次类推）
②声明一个有参构造Month(String description)，创建12个常量对象，常量对象的名称如下
JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER

③public static Month getByValue(int value)：返回对应月份值的枚举对象，例如实参传入1，则返回JANUARY对象。
④public int length(boolean leapYear)：返回这个月的总天数，如果当前对象是FEBRUARY，并且leapYear是true，则返回29，否则返回28。其他月份对象无论leapYear参数是true还是false，都正常返回月份总天数。
⑤重写toString()：返回对象信息，例如：1->JANUARY->一月份。
*/

public enum Month {
    JANUARY("一月"), FEBRUARY("二月"),
    MARCH("三月"), APRIL("四月"),
    MAY("五月"), JUNE("六月"),
    JULY("七月"), AUGUST("八月"),
    SEPTEMBER("九月"), OCTOBER("十月"),
    NOVEMBER("十一月"), DECEMBER("十二月");

    private final String description;

//    Month() {
//        description = "";
//    }

    Month(String description) {
        this.description = description;
    }

    public static Month getByValue(int value) {
//        switch (value) {
//            case 1:
//                return JANUARY;
//            case 2:
//                return FEBRUARY;
//            case 3:
//                return MARCH;
//            case 4:
//                return APRIL;
//            case 5:
//                return MAY;
//            case 6:
//                return JUNE;
//            case 7:
//                return JULY;
//            case 8:
//                return AUGUST;
//            case 9:
//                return SEPTEMBER;
//            case 10:
//                return OCTOBER;
//            case 11:
//                return NOVEMBER;
//            case 12:
//                return DECEMBER;
//        }
//        return null;

        //先获取所有枚举常量对象，使用values方法
 /*       Month[] months = Month.values();
        return months[value-1];*/

        return Month.values()[value - 1];
    }

    public int length(boolean leapYear) {
        switch (this) {
            case FEBRUARY:
                return leapYear ? 29 : 28;
//            case JANUARY:
//            case MARCH:
//            case MAY:
//            case JULY:
//            case AUGUST:
//            case OCTOBER:
//            case DECEMBER:
//                return 31;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }

    @Override
    public String toString() {
        return ordinal() + 1 + "->" + super.toString() + "->" + description;
    }
}
