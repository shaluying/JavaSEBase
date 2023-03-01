package XML_XML解析_XPath_设计模式等12.设计模式04.工厂模式01;

public class FactoryPattern {
    /**
     * 定义一个方法，创建对象返回
     */
    public static Computer createComputer(String info) {
        switch (info) {
            case "huawei":
                Computer c = new Huawei();
                c.setName("huawei pro 16");
                c.setPrice(5999);
                return c;
            case "mac":
                Computer c2 = new Mac();
                c2.setName("MacBook pro");
                c2.setPrice(11999);
                return c2;
            default:
                return null;
        }
    }
}
