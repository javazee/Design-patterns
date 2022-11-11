package com.example.patterns.behavioral.command;

public class FileOperation {

    public void createNewFile() {
        System.out.println("creating new file...");
    }

    public void deleteFile() {
        System.out.println("deleting file...");
    }

    public void editFile() {
        System.out.println(("editing file..."));
    }

    public void saveFile() {
        System.out.println("saving file...");
    }

    public void openFile() {
        System.out.println("opening file...");
    }
}
