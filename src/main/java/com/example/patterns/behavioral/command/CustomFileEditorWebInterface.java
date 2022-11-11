package com.example.patterns.behavioral.command;

public class CustomFileEditorWebInterface {
    private Command greenButton;
    private Command blueButton;
    private Command redButton;
    private Command yellowButton;

    public CustomFileEditorWebInterface(Command greenButton, Command blueButton, Command redButton, Command yellowButton) {
        this.greenButton = greenButton;
        this.blueButton = blueButton;
        this.redButton = redButton;
        this.yellowButton = yellowButton;
    }

    public void pressGreenButton() {
        greenButton.execute();
    }

    public void pressBlueButton() {
        blueButton.execute();
    }

    public void pressRedButton() {
        redButton.execute();
    }

    public void pressYellowButton() {
        yellowButton.execute();
    }

    public void setGreenButton(Command greenButton) {
        this.greenButton = greenButton;
    }

    public void setBlueButton(Command blueButton) {
        this.blueButton = blueButton;
    }

    public void setRedButton(Command redButton) {
        this.redButton = redButton;
    }

    public void setYellowButton(Command yellowButton) {
        this.yellowButton = yellowButton;
    }
}
