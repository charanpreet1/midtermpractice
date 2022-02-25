/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 */
public class CardHand {

    private int handSize=60;
    public Card[] cards=new Card[handSize];
    
    //A method which generate a deck of cards
    
    public void generateHand()
    {
        int countCards=0;
        
        for(Card.Color s:Card.Color.values())
        {
            for(Card.Ranks v: Card.Ranks.values() )
            {
                cards[countCards]=(new Card(s,v));
                countCards++;            
            }
        
        
        }
    
    
    }
    
}
