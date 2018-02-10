package org.ffadilaputra.boilerplate.model;

/**
 * Created by irfan on 1/18/2016.
 */
public class Message {
    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
