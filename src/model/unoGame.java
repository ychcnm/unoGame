/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Status;
import model.unoPlayer;
import model.unoDeck;
import model.unoCard;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mitch
 */
public class unoGame {

    private String id;
    private List<unoPlayer> gamePlayers;
    private Status gameStatus;
    private unoDeck gameDeck;
    private unoCard dicardPile;

    public unoGame() {
         this.gameDeck = new unoDeck();
    }

    public unoGame(String id, Status gameStatus) {
        this.id = id;
        this.gamePlayers = new LinkedList<unoPlayer>();
        this.gameStatus = gameStatus;
        this.gameDeck = new unoDeck();
        this.dicardPile = this.gameDeck.takeCard();
    }

    public void addPlayer(unoPlayer player) {
        this.gamePlayers.add(player);
    }

    public unoCard takeCard() {
        return this.gameDeck.takeCard();
    }

    public void discardToPile(unoCard card) {
        this.dicardPile = card;
    }

    public unoCard takeFromPile() {
        unoCard card = this.dicardPile;
        this.dicardPile = null;
        return card;
    }

    public void changeStatus(Status status) {
        this.gameStatus = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<unoPlayer> getGamePlayers() {
        return gamePlayers;
    }

    public void setGamePlayers(List<unoPlayer> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    public Status getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Status gameStatus) {
        this.gameStatus = gameStatus;
    }

    public unoDeck getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(unoDeck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public unoCard getDicardPile() {
        return dicardPile;
    }

    public void setDicardPile(unoCard dicardPile) {
        this.dicardPile = dicardPile;
    }

}
