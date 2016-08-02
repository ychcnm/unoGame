/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.List;


/**
 *
 * @author Mitch
 */
public class unoGame {

    private String id;
    private List<unoPlayer> gamePlayers;
    private String gameStatus;
    private unoDeck gameDeck;
    private unoCard dicardPile;

    public unoGame(String id, List<unoPlayer> gamePlayers, String gameStatus, unoDeck gameDeck, unoCard dicardPile) {
        this.id = id;
        this.gamePlayers = gamePlayers;
        this.gameStatus = gameStatus;
        this.gameDeck = gameDeck;
        this.dicardPile = dicardPile;
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

    public void changeStatus(String status) {
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

    public String getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(String gameStatus) {
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
