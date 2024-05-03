package sem2_ExceptionsAndTheirTreatment;

import java.io.*;


/* Исправьте код, примените подходящие способы обработки исключений.

public class SomeClass {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings [2];
            test ();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        catch (Throwable e) {
            e.printStackTrace ();
        catch (StackOverflowError error) {
            System.out.println("asdfasdfdsa");
        } finally {
            System.out.println ("Я Bce paBHO выполнился!") ;

        System.out.println ("Я жив!");

    }

    public static void test () throws IOException {
        File file= new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
*/
public class Task4 {
    public static void main(String[] args) {

        InputStream inputStream;
        String[] strings = {"asdf", "asdf"};
        try {
            String strings1 = strings[2];  // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println("Выход за пределы массива");
        }
        try {
            // test(); // переполнение стека, вызов функции самой себя
        } catch (Throwable error) {
            error.printStackTrace();
            // System.out.println("Переполнение стека рекурсии ");
        }
        try {
            int a = 1 / 0;  // деление на 0
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            System.out.println("Я Bce paBHO выполнился!");
        }
        System.out.println("Я жив!");

    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();

    }

}
