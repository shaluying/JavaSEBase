package 面向对象上.练习04;

public class TestMyInt {
    public static void main(String[] args) {
        MyInt i = new MyInt();
        i.value = 79;

        System.out.println(i.isNatural());
        System.out.println(i.approximateNumberCount());
        System.out.println(i.isPrimeNumber());
        for (int i1 = 0; i1 < i.getAllPrimeNumber().length; i1++) {
            System.out.print(i.getAllPrimeNumber()[i1] + " ");
        }
        System.out.println();

    }
}
