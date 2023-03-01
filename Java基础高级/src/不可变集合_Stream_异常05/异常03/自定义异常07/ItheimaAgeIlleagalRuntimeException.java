package 不可变集合_Stream_异常05.异常03.自定义异常07;

/*
    自定义的运行时异常
      1、继承RuntimeException
      2、重写构造器
 */
public class ItheimaAgeIlleagalRuntimeException extends RuntimeException{
    public ItheimaAgeIlleagalRuntimeException() {
    }

    public ItheimaAgeIlleagalRuntimeException(String message) {
        super(message);
    }
}
