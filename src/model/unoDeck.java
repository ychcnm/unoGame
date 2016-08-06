/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.CardColor;
import enums.Image;
import model.unoCard;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mitch
 */
public class unoDeck {

    private int amount;
    private List<unoCard> deck;

    public unoDeck(int amount, List<unoCard> deck) {
        this.amount = amount;
        this.deck = deck;
    }

    public unoDeck() {
        this.amount = 0;
        this.deck = new LinkedList<unoCard>();
    }

    public unoCard takeCard() {
        if (this.deck.isEmpty()) {
            return null;
        }
        this.amount--;
        return this.deck.remove(0);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<unoCard> getDeck() {
        return deck;
    }

    public void setDeck(List<unoCard> deck) {
        this.deck = deck;
    }

}
