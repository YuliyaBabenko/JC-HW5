package ru.geekbrains.hw5;

import static ru.geekbrains.hw5.FilesBackUp.createBackup;

public class AppBackUp {
    public static void main(String[] args) {
        String sourceDirectory = "C:\\Users\\Юлия\\Documents\\JavaCore\\05\\TestFolder";
        createBackup(sourceDirectory);
    }
}
