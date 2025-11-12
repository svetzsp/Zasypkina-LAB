package lesson2e6;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    private String name;
    private String phone;
    private HashMap<String, String> list = new HashMap<>();

    // В этот телефонный справочник с помощью метода add() можно добавлять записи,
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
    // тогда при запросе такой фамилии должны выводиться все телефоны.
    public void add(String phone, String name) {
        list.put(phone, name);
    }

    // а с помощью метода get() искать номер телефона по фамилии.
    public void get(String name) {
        for (Map.Entry<String, String> p : list.entrySet()) {
            if (p.getValue() == name) {
                System.out.println(p.getKey());
            }
        }
    }
}
