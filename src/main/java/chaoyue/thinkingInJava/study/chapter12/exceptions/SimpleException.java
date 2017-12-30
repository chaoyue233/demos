package chaoyue.thinkingInJava.study.chapter12.exceptions;

public class SimpleException extends Exception {
    private String code;

    public SimpleException() {
    }

    public SimpleException(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
