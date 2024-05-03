package Sem3_AdvancedExceptionHandling;

/*ЗаданиеNo3
1.Создайте класс исключения,который будет выбрасываться при делении на 0. Исключение должно отображать
понятное для пользователя сообщение об ошибке.
2.Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
Исключение должно  отображать понятное для пользователя сообщение об ошибке
3.Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
Исключение должно отображать понятное для пользователя сообщение об ошибке.*/

import java.io.FileNotFoundException;

public class Task3 {

    class MyDivByZero extends ArithmeticException{

        public MyDivByZero(){
            super("Делить на ноль нельзя");
        }
    }

    class ApplyArrayElementNull extends NullPointerException{
        public ApplyArrayElementNull() {
            super("Обращение к пустому элементу");
        }

        public ApplyArrayElementNull(int index) {
            super("Пустой элемент находится на индексе " + index);
        }
    }

    class ErrorOpenFile extends FileNotFoundException{
        public ErrorOpenFile() {
            super("Файл не найден");
        }

        public ErrorOpenFile(String s) {
            super("Файл не найден по данному пути " + s);
        }
    }

}
