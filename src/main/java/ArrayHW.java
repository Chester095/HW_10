import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayHW {

    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Создать");
        arrayList1.add("массив");
        arrayList1.add("с");
        arrayList1.add("набором");
        arrayList1.add("слов");
        arrayList1.add("10-20");
        arrayList1.add("слов");
        arrayList1.add("должны");
        arrayList1.add("встречаться");
        arrayList1.add("повторяющиеся");
        arrayList1.add("Найти");
        arrayList1.add("вывести");
        arrayList1.add("список");
        arrayList1.add("уникальных");
        arrayList1.add("слов");
        arrayList1.add("из");
        arrayList1.add("которых");
        arrayList1.add("состоит");
        arrayList1.add("массив");
        System.out.println(arrayList1);
        Map<String, Integer> map1 = new HashMap<>();
        System.out.println(uniqueWords(arrayList1));
    }

    public static Map uniqueWords(ArrayList<String> arrayList) {
        Map<String, Integer> map1 = new HashMap<>();
        for (String s: arrayList) {
            if (map1.containsKey(s)) {
                int i=map1.get(s);
                map1.put(s, ++i);
            }
            else  map1.put(s,1);
        }
        return map1;
    }

}
