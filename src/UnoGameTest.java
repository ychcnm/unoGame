/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import engine.unoEngine;
import java.util.ArrayList;
import java.util.List;
import enums.Image;
import model.unoCard;
import model.unoDeck;
import model.unoGame;
import model.unoPlayer;

/**
 *
 * @author Mitch
 */
public class UnoGameTest {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

      
        unoGame g = new unoGame();
        

        
        List<unoPlayer> players = new ArrayList<unoPlayer>();
        players.add(new unoPlayer("Mitch", "Mitch"));
        players.add(new unoPlayer("Melody", "Melody"));
        players.add(new unoPlayer("ThinSwe", "ThinSwe"));
        players.add(new unoPlayer("Johnson", "Johnson"));
        players.add(new unoPlayer("John", "John"));
        System.out.println("The Player is Ready");
        
        g.setGamePlayers(players);

        System.out.println("The Game is Created");
        
        unoEngine.initDeck(g.getGameDeck());
        
        unoEngine.initGame(g);
        
        System.out.println("run: ");
        System.out.println("Discard: card: " + g.getDicardPile());
        System.out.println("Cards on deck: " + g.getGameDeck().getAmount());
        for (unoPlayer p : g.getGamePlayers()) {
            System.out.println("        Player:" + p);
            System.out.println("        Cards in hand:");
            for (unoCard c : p.getHandCards()) {
                System.out.println("                Card: " + c);
            }
            System.out.println();
        }
    }
}
