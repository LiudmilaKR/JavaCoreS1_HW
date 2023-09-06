package ru.geekbrains.lesson1.regular;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {
    /**
     * Метод декорирует число, добавляя к нему строку
     * при помощи функции форматирования строк
     * @param a число, требующее декорации
     * @return отформатированная строка.
     */
    public static String decorate(int a) {
        return String.format("Here i your number: %d.", a);
    }
}
