package 面向对象下.抽象类04.抽象类概念及其特点01;

public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    /*public void eat(){
            //这里无法给出满足所有子类的合理的实现，干脆不写方法体了
        }*/
    public abstract void eat(); //没有方法体
}
