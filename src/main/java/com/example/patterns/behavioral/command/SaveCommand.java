package com.example.patterns.behavioral.command;

public class SaveCommand implements Command {

    private final FileOperation fileOperation;

    public SaveCommand(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void execute() {
        fileOperation.saveFile();
    }
}
