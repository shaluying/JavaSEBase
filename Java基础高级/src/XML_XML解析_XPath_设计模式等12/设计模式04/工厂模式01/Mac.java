package XML_XML解析_XPath_设计模式等12.设计模式04.工厂模式01;

public class Mac extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "以非常优雅的方法启动了，展示了一个苹果logo");
    }
}
