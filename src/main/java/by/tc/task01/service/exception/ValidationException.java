package by.tc.task01.service.exception;

/**
 * Created by Дима on 26.01.2018.
 */
public class ValidationException extends Exception {

    String objectName;
    String param;
    String valueOfParam;

    public ValidationException(String objectName, String param, String valueOfParam) {
        this.objectName = objectName;
        this.param = param;
        this.valueOfParam = valueOfParam;
    }

    public String exceptionInfo() {
        return "Объект " + objectName + "\n" + param + "=" + valueOfParam + "[Неверное значение]";
    }
}
