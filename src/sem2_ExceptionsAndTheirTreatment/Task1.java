package sem2_ExceptionsAndTheirTreatment;
/*
Посмотрите на этот код. Все ли с ним хорошо? Если нет, то скорректируйте его и обоснуйте свое решение.

public static void main (String[] args) {
    Scanner scanner = new Scanner (System.in);
    int[] arr = new int[10];
    System.out.println ("Укажите индекс элемента массива, в который хотите записать значение 1");
    int index = scanner.nextInt ();
    try {
        arr[index] = 1;
    } catch {Exception e) {
        System.out.println ("Указан индекс за пределами массива");
    }
}
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Input index: ");
        int index = 0;
        // while (index > 9 || index < 0)   // можно и с помощью цикла while
        try{
            index = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Вы ввели не целое число!");
        }
        try{
            arr[index] = 1;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива!");
        }
    }
}
