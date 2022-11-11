package com.example.patterns.behavioral.command;

public class CreateCommand implements Command{

    private final FileOperation fileOperation;

    public CreateCommand(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void execute() {
        fileOperation.createNewFile();
    }
}
