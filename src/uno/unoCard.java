/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

/**
 *
 * @author Mitch
 */
public class unoCard {

    private String color;
    private String type;
    private int value;
    private String image;

    public unoCard(String color, String type, int value, String image) {
        this.color = color;
        this.type = type;
        this.value = value;
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
