import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Зотов А.С.");
        nameBook.put(1, "Зотова И.А.");
        nameBook.put(2, "Петров С.С.");
        nameBook.put(3, "Смирнов М.Е.");
        for (int i = 0; i < nameBook.size(); i++) {
            if (phoneBook.get(i) == null) {
                phoneBook.put(i, new ArrayList<String>());
                phoneBook.get(i).add("8-999-123-45-" + i + i + ";" + "8-999-123-22-" + i + i);
            }
            System.out.println("Телефонные номера абонента" + " " + nameBook.get(i) + " :" + phoneBook.get(i));
        }

    }
}
