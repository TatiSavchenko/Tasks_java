package org.example;

import java.util.HashMap;

public class HW_05 {
    public static void main(String[] args){

        HashMap<String,String> hashMap = new HashMap<>();  // Создать множество, где ключ и знач - строки

        hashMap.put("Чили","Сантьяго"); // Добавить 6 элементов:
        hashMap.put("Россия","Москва");
        hashMap.put("Турция","Анкара");
        hashMap.put("Великобритания","Лондон");
        hashMap.put("Перу","Лима");
        hashMap.put("Чехословакия","Прага");

        System.out.println(hashMap.values()); //Вывести значения в консоль

        //Добавить ко всем значениям символ "!".
        hashMap.forEach((k,v) -> hashMap.merge(k, "!", String::concat));

        //Создать второе множество с таким же обобщением.
        HashMap<String, String> hashMap2 = new HashMap<>();

        //Ключи второго множества частично совпадают с ключами первого.
        hashMap2.put("Чили","Сантьяго");
        hashMap2.put("Франция","Париж");
        hashMap2.put("Перу","Лима");
        hashMap2.put("Италия","Рим");
        hashMap2.put("Финляндия","Хельсинки");
        hashMap2.put("Россия","Москва");

        //Объединить значения во втором множестве и первом, если ключи совпадают.
        hashMap2.forEach((k2,v2) -> hashMap.forEach((k,v) -> {
            if (k2.hashCode() == k.hashCode() && k2.equals(k)) {
                hashMap2.put(k2, v+v2);
            }
        }));

        //Вывести результат в консоль.
        hashMap2.forEach((k, v) -> System.out.format("%-10s %-1s%n", k, v));
    }

}
