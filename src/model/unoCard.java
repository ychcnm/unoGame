/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.CardColor;
import enums.Type;

/**
 *
 * @author Mitch
 */
public class unoCard {

    private CardColor color;
    private Type type;
    private int value;
    private String image;

    public unoCard(CardColor color, Type type, int value, String image) {
        this.color = color;
        this.type = type;
        this.value = value;
        this.image = image;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "color=" + color + ", type=" + type + ", value=" + value + ", image=" + image;
    }
}
