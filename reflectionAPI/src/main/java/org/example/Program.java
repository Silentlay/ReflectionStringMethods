package org.example;

import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) {

        // Получаю класс String
        Class<String> stringClass = String.class;

        // Получаю все методы класса
        Method[] methods = stringClass.getDeclaredMethods();

        // Вывожу имена методов
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}