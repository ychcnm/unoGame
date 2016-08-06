/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.unoCard;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mitch
 */
public class unoPlayer {

    private String name;
    private String id;
    private List<unoCard> handCards;

    public unoPlayer(String name, String id) {
        this.name = name;
        this.id = id;
        this.handCards = new LinkedList<unoCard>();
    }

    public unoPlayer(String name, List<unoCard> handCards) {
        this.name = name;
        this.handCards = handCards;
    }

    public void addToHand(unoCard card) {
        this.handCards.add(card);
    }

    public unoCard removeFormHand() {
        if (this.handCards.isEmpty()) {
            return null;
        }
        return this.handCards.remove(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<unoCard> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<unoCard> handCards) {
        this.handCards = handCards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name + ", id=" + id;
    }

}
