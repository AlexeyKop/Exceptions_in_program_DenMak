package Sem1_ErrorHandlingInProgramming;
/*
https://meadow-patio-044.notion.site/3f7a62a1ed884f23adb770d6ec157f3f
ссылка на Notion (Денис Макарцев)

Задание No1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
1.если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
2.если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3.если вместо массива пришел null, метод вернет -3
4.придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем.
То есть, этот метод запросит искомое число у пользователя, вызовет первый,
обработает возвращенное значение и покажет читаемый результат пользователю.
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.
*/
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 15};
        // System.out.println(getNumber(arr, 3, 9));
        getText(getNumber(arr, 3, 9));
    }


    public static int getNumber(int[] arr, int min, int num) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -2;

    }

    public static void getText(int code){
        switch (code){
            case -3:
                System.out.println("Массив пустой");
                break;
            case -1:
                System.out.println("Длина меньше заданного min");
                break;
            case -2:
                System.out.println("Искомый элемент не найден");
                break;
            default:
                System.out.println("Искомый элемент на индексе: " + code);
                break;
        }
    }
}