package XML_XML解析_XPath_设计模式等12.设计模式04.装饰模式02;

/*
   共同父类
 */
public abstract class InputStream {
    public abstract int read();
    public abstract int read(byte[] buffer);
}
