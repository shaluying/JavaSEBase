package 面向对象下.接口05.排序比较器体会接口用法;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
//        return (int) (((Employee) o).getSalary() - ((Employee) t1).getSalary());//小数没有参与比较
        return Double.compare(((Employee) o).getSalary(), ((Employee) t1).getSalary());//小数参与了比较
    }
}
