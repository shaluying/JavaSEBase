package 常用API01.Arraylist02.Arraylist练习案例02.元素搜索03;

/**
 * 案例：学生信息系统：展示数据，并按照学号完成搜索
 * 学生类信息（学号，姓名，性别，班级）
 * 测试数据：
 * "20180302","叶孤城",23,"护理一班"
 * "20180303","东方不败",23,"推拿二班"
 * "20180304","西门吹雪",26,"中药学四班"
 * "20180305","梅超风",26,"神经科2班"
 */

public class Student {
    private String id;
    private String name;
    private int age;
    private String classes;

    public Student() {
    }

    public Student(String id, String name, int age, String classes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                '}';
    }
}
