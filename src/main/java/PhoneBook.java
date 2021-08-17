import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        add("+79164444444", "Timofeev", phoneBook);
        add("+79161234567", "Ivanov", phoneBook);
        add("+79162345678", "Petrov", phoneBook);
        add("+79164567891", "Timofeev", phoneBook);
        add("+79165678910", "Sidorov", phoneBook);
        System.out.println(phoneBook);
        System.out.println();
        get("Timofeev", phoneBook);
        get("Timofeev2", phoneBook);
    }


    public static void add(String key, String value, Map map) {
        map.put(key, value);
    }

    public static void get(String value, HashMap<String, String> map) {
        System.out.print(value + ":");
        boolean i=false;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (pair.getValue().equals(value)) {
                System.out.print(" " + pair.getKey());
                i=true;
            }
        }
        if (!i) System.out.println(" не найден"); else System.out.println();

    }

}
