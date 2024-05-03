package Sem3_AdvancedExceptionHandling;

import java.io.IOException;
/* https://meadow-patio-044.notion.site/3f7a62a1ed884f23adb770d6ec157f3f
ссылка на Notion (Денис Макарцев)
 */

/*Задание No1
 Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
 (тело самого метода прописывать необязательно). Вызовите этот метод из main и обработайте в нем исключение,
 которое вызвал метод doSomething().    */
public class Task1 {
    public static void main(String[] args) {
        try{
            doSomething();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException{

    }
}
