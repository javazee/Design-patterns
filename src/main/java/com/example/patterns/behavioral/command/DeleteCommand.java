package com.example.patterns.behavioral.command;

public class DeleteCommand implements Command{

    private final FileOperation fileOperation;

    public DeleteCommand(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void execute() {
        fileOperation.deleteFile();
    }
}
