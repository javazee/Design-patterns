package com.example.patterns.behavioral.command;

public class EditCommand implements Command{

    private final FileOperation fileOperation;

    public EditCommand(FileOperation fileOperation) {
        this.fileOperation = fileOperation;
    }

    @Override
    public void execute() {
        fileOperation.editFile();
    }
}
