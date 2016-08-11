/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Status;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author Mitch
 */
public class unoGame {

    private String id;
    private String title;
    private List<unoPlayer> gamePlayers;
    private Status gameStatus;
    private unoDeck gameDeck;
    private unoCard dicardPile;
    private int capcity;

    public unoGame() {
        this.gameDeck = new unoDeck();
    }

    public unoGame(String id, String title, Status gameStatus, int capacity) {
        this.id = id;
        this.title = title;
        this.gamePlayers = new LinkedList<unoPlayer>();
        this.gameStatus = gameStatus;
        this.gameDeck = new unoDeck();
        this.dicardPile = this.gameDeck.takeCard();
        this.capcity = capacity;
    }

    public JsonObject toJson() {
        JsonObject gameJson = Json.createObjectBuilder()
                .add("gameId", this.id)
                .add("gameTitle", this.title)
                .add("capacity", this.getCapcity())
                .add("playerAmount", this.getGamePlayers().size())
                .add("gameStatus", this.getGameStatus().toString())
                .build();
        return gameJson;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getCapcity() {
        return capcity;
    }

    public void setCapcity(int capcity) {
        this.capcity = capcity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
