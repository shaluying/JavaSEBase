package 面向对象下.接口05.排序比较器体会接口用法;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        return ((Employee) t1).getAge() - ((Employee) o).getAge();
    }
}
