
package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */

        ResourceBundle res = read("resources/strings/titles");

        System.out.println(res.getString("menu.edit"));

    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {

//        Locale.setDefault(new Locale("en", "US"));

        ResourceBundle introLabels = ResourceBundle.getBundle(path);

     //   System.out.println(introLabels.getString("menu.edit"));

        return introLabels;

    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {

        throw new UnsupportedOperationException("Not implement yet!");
    }
}
