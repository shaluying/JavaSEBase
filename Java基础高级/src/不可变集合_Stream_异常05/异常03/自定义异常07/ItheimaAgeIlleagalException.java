package 不可变集合_Stream_异常05.异常03.自定义异常07;

/*
    自定义的编译时异常
      1、继承Exception
      2、重写构造器
 */
public class ItheimaAgeIlleagalException extends Exception {
    public ItheimaAgeIlleagalException() {
    }

    public ItheimaAgeIlleagalException(String message) {
        super(message);
    }
}
