package ru.geekbrains.hw5;

import java.io.File;
public class Tree {

    public static void main(String[] args) {
        print(new File("."), "", true);
    }

    /**
     * TODO: Доработать метод print, необходимо распечатывать директории и файлы
     *
     * @param file
     * @param indent
     * @param isLast
     */
    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }

        System.out.print(file.getName());

        // обозначения, чтобы различать файлы и каталоги в дереве
        if (file.isDirectory())
            System.out.println("  (d)");
        else
            System.out.println("  (f)");

        File[] files = file.listFiles();
        if (files == null) //выходим, если файлы закончились
            return;

         // выводим файлы
        for (File f : files) {
            print(f, indent, f == files[files.length - 1]);
        }
    }
}
