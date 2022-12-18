package com.company.design.observer;

/**
 * packageName : com.company.design.observer
 * className : Button
 * user : jwlee
 * date : 2022/12/18
 */
public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    public void click(String message) {
        buttonListener.clickEvent(message);
    }
}
