/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.ArrayList;
import java.util.Collections;
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

    public static unoDeck createNewDeck() {
        String colorArray[] = {Value.RED, Value.YELLOW, Value.BLUE, Value.GREEN};
        String imageArray[][] = {
            {Value.RED_0, Value.RED_1, Value.RED_2, Value.RED_3, Value.RED_4, Value.RED_5, Value.RED_6, Value.RED_7, Value.RED_8, Value.RED_9, Value.RED_SKIP, Value.RED_REVERSE, Value.RED_DRAWTWO},
            {Value.YELLOW_0, Value.YELLOW_1, Value.YELLOW_2, Value.YELLOW_3, Value.YELLOW_4, Value.YELLOW_5, Value.YELLOW_6, Value.YELLOW_7, Value.YELLOW_8, Value.YELLOW_9, Value.YELLOW_SKIP, Value.YELLOW_REVERSE, Value.YELLOW_DRAWTWO},
            {Value.BLUE_0, Value.BLUE_1, Value.BLUE_2, Value.BLUE_3, Value.BLUE_4, Value.BLUE_5, Value.BLUE_6, Value.BLUE_7, Value.BLUE_8, Value.BLUE_9, Value.BLUE_SKIP, Value.BLUE_REVERSE, Value.BLUE_DRAWTWO},
            {Value.GREEN_0, Value.GREEN_1, Value.GREEN_2, Value.GREEN_3, Value.GREEN_4, Value.GREEN_5, Value.GREEN_6, Value.GREEN_7, Value.GREEN_8, Value.GREEN_9, Value.GREEN_SKIP, Value.GREEN_REVERSE, Value.GREEN_DRAWTWO}};
        String typeArray[] = {Value.NORMAL, Value.SKIP, Value.REVERSE, Value.DRAW_2};
        System.out.println("The Game Start Loading,Please Wait a Minitue");
        List<unoCard> cardList = new ArrayList<unoCard>();
        unoCard card;
        unoCard card1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (j < 9) {
                    if (j == 0) {
                        card = new unoCard(colorArray[i], typeArray[0], j, imageArray[i][j]);
                        cardList.add(card);
                    } else {
                        for (int k = 0; k < 2; k++) {
                            card = new unoCard(colorArray[i], typeArray[0], j, imageArray[i][j]);
                            cardList.add(card);
                        }
                    }
                } else {
                    for (int k = 0; k < 2; k++) {
                        card = new unoCard(colorArray[i], typeArray[j % 9], 20, imageArray[i][j]);
                        cardList.add(card);
                    }
                }
            }
            card = new unoCard(Value.WILD, Value.DRAW_4, 50, Value.WILDCARD);
            card1 = new unoCard(Value.WILD, Value.DRAW_4, 50, Value.DRWAFOUR);
            cardList.add(card);
            cardList.add(card1);
        }
        Collections.shuffle(cardList);
        unoDeck deck = new unoDeck(108, cardList);
        System.out.println("The Card Finished Loading");
        return deck;
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
