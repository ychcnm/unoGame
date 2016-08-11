/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine;

import enums.CardColor;
import enums.Image;
import enums.Status;
import enums.Type;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import model.unoCard;
import model.unoDeck;
import model.unoGame;
import model.unoPlayer;

/**
 *
 * @author Mitch
 */
public class unoEngine {

    //color resource
    private static final CardColor colorArray[] = {CardColor.RED, CardColor.YELLOW, CardColor.BLUE, CardColor.GREEN};

    //image resource
    private static final String imageArray[][] = {
        {Image.RED_0, Image.RED_1, Image.RED_2, Image.RED_3, Image.RED_4, Image.RED_5, Image.RED_6, Image.RED_7, Image.RED_8, Image.RED_9, Image.RED_SKIP, Image.RED_REVERSE, Image.RED_DRAWTWO},
        {Image.YELLOW_0, Image.YELLOW_1, Image.YELLOW_2, Image.YELLOW_3, Image.YELLOW_4, Image.YELLOW_5, Image.YELLOW_6, Image.YELLOW_7, Image.YELLOW_8, Image.YELLOW_9, Image.YELLOW_SKIP, Image.YELLOW_REVERSE, Image.YELLOW_DRAWTWO},
        {Image.BLUE_0, Image.BLUE_1, Image.BLUE_2, Image.BLUE_3, Image.BLUE_4, Image.BLUE_5, Image.BLUE_6, Image.BLUE_7, Image.BLUE_8, Image.BLUE_9, Image.BLUE_SKIP, Image.BLUE_REVERSE, Image.BLUE_DRAWTWO},
        {Image.GREEN_0, Image.GREEN_1, Image.GREEN_2, Image.GREEN_3, Image.GREEN_4, Image.GREEN_5, Image.GREEN_6, Image.GREEN_7, Image.GREEN_8, Image.GREEN_9, Image.GREEN_SKIP, Image.GREEN_REVERSE, Image.GREEN_DRAWTWO}};

    //type resouce
    private static final Type typeArray[] = {Type.NORMAL, Type.SKIP, Type.REVERSE, Type.DRAW_2};

    public static unoDeck initDeck(unoDeck deck) {

        System.out.println(">> Start Loading the Uno Card");
        List<unoCard> cardList = new LinkedList<unoCard>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (j <= 9) {
                    if (j == 0) {
                        cardList.add(new unoCard(colorArray[i], typeArray[0], j, imageArray[i][j]));
                    } else {
                        for (int k = 0; k < 2; k++) {
                            cardList.add(new unoCard(colorArray[i], typeArray[0], j, imageArray[i][j]));
                        }
                    }
                } else {
                    for (int k = 0; k < 2; k++) {
                        cardList.add(new unoCard(colorArray[i], typeArray[j % 9], 20, imageArray[i][j]));
                    }
                }
            }
            cardList.add(new unoCard(CardColor.WILD, Type.DRAW_4, 50, Image.WILDCARD));
            cardList.add(new unoCard(CardColor.WILD, Type.DRAW_4, 50, Image.DRWAFOUR));
        }

        Collections.shuffle(cardList);
        deck.setAmount(108);
        deck.setDeck(cardList);
        System.out.println(">> The Card Finished Loading");
        return deck;
    }

    public static unoGame initGame(unoGame game) {
        System.out.println(">> Start deal the Card to Players");
        for (unoPlayer p : game.getGamePlayers()) {
            for (int i = 0; i < 7; i++) {
                p.addToHand(game.getGameDeck().takeCard());
            }
        }
        game.setDicardPile(game.getGameDeck().takeCard());
        game.setGameStatus(Status.GAME_START);
        System.out.println(">> Finish Card Dealing");

        return game;

    }
}
