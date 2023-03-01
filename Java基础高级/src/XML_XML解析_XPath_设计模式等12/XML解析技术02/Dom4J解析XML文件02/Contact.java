package XML_XML解析_XPath_设计模式等12.XML解析技术02.Dom4J解析XML文件02;

/*
 <contact id="1" vip="true">
 <name>   潘金莲  </name>
 <gender>女</gender>
 <email>panpan@itcast.cn</email>
 </contact>
 */
public class Contact {
    private String name;
    private int id;
    private boolean vip;
    private char gender;
    private String email;

    public Contact() {
    }

    public Contact(String name, int id, boolean vip, char gendar, String email) {
        this.name = name;
        this.id = id;
        this.vip = vip;
        this.gender = gendar;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", vip=" + vip +
                ", gendar=" + gender +
                ", email='" + email + '\'' +
                '}';
    }
}
