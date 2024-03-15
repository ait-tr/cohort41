/*
@date 15.03.2024
@author Sergey Bugaienko
*/

public class EmailValidateException extends Exception {
    /*
    getMessage() - возвращает строку с коротким описание исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - Возвращает строковое представление объекта исключения
    printStackTract() - выводит трассировку стека исключения.
    */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception: " +  super.getMessage();
    }
}
