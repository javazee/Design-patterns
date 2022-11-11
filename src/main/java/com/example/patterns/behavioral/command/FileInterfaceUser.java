package com.example.patterns.behavioral.command;

public class FileInterfaceUser {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        CustomFileEditorWebInterface customEditor =
                new CustomFileEditorWebInterface(new CreateCommand(fileOperation),
                        new EditCommand(fileOperation),
                        new DeleteCommand(fileOperation),
                        new SaveCommand(fileOperation));

        //first variant of using custom buttons
        System.out.println("initial customization for buttons:");
        customEditor.pressGreenButton();
        customEditor.pressBlueButton();
        customEditor.pressYellowButton();
        customEditor.pressRedButton();

        //changing command for green button
        System.out.println("\nafter changing option for green button:");
        customEditor.setGreenButton(new OpenCommand(fileOperation));
        customEditor.pressGreenButton();
        customEditor.pressBlueButton();
        customEditor.pressYellowButton();
        customEditor.pressRedButton();

    }
}
