package com.example.patterns.behavioral.command;

public class OpenCommand implements Command {

    private final FileOperation fileOperation;

    public OpenCommand(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void execute() {
        fileOperation.openFile();
    }
}
