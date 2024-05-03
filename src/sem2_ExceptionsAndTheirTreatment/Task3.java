package sem2_ExceptionsAndTheirTreatment;
/*Задание No3
 📔Запишите в файл следующие строки:
 Анна=4
 Елена=5
 Марина=6
 Владимир=?
 Константин=?
 Иван=4
 Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
 (либо HashMap, если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 если сохранено значение ?, заменить его на соответствующее число. Если на каком-то месте встречается символ,
 отличный от числа или ?, бросить подходящее исключение. Записать в тот же файл данные с замененными символами ?.

*/
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("1.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        List<String> ls = new ArrayList<>();
        try {
            String content = br.readLine();
            while (content != null) {
                ls.add(content);
                content = br.readLine();
            }
            br.close();
        } catch (NullPointerException e){
            e.printStackTrace();
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String i: ls){
            // i = "Анна=4\n"
            String[] patrs = i.split("=");
            if (patrs.length != 2)
                throw new IllegalArgumentException("Неверное кол-во аргументов!");
            String name = patrs[0];
            // parts = ["Anna", "4"]
            map.put(name, name.length());
        }
        FileWriter file = new FileWriter("1.txt");
        StringBuilder out = new StringBuilder();
        for (String key: map.keySet()){
            out.append(key).append("=").append(map.get(key)).append("\n");
        }
        // out = "Анна=4\nЕлена=5\n..."
        file.write(String.valueOf(out));
        file.close();
    }
}
