package 面向对象上.类和对象的创建及调用01;

public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student();

        st.name = "qmq";
        st.age = 22;

        st.study();
        st.rest();

    }
}
