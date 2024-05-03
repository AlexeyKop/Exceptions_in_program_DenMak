package Sem3_AdvancedExceptionHandling;
/*Задание No0
 Перепишите следующий код,  используя ресурсный  try

public void rwLine(Path pathRead, Path pathWrite) throws IOException {
    BufferedReader in = null;
    BufferedWriter out = null;

    try {
        in = Files.newBufferedReader(pathRead):
        out = Files.newBufferedWriter(pathWrite);
        out.write(in.readLine());
        } finally {
            try{
                if (in !- null) in.close();
                } catch (I0Exception e) {
            try{
                if (out != null) out.close();
                } catch (IOException e)
}

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;

//public class Task0 {
//    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
//        try(BufferedReader in = new BufferedReader(pathRead);
//            BufferedWriter out = new BufferedWriter(pathWrite)){
//            out.write(in.readLine());
//        }catch (IOException e){
//            System.out.println("Произошла ошибка при работе с файлом.");
//        }
//    }
//}
