/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package cardgameweek5;

/**
 *
 * @author Megha Patel
 * @charanpreet Singh
 */
public class Card {
    
    public enum Color{  // encapsulation(task 3)
    RED,YELLOW,GREEN,BLUE
    }
    public enum Ranks{  // encapsulation(task 3)
       ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,
        SEVEN,EIGHT,NINE,SKIP,REVERSE,DRAW_TWO,DRAW_FOUR,WILDCARD
    }
    
    private final Color color;
    private final Ranks ranks;

    public Card(Color color,Ranks ranks)   //card cunstructor can be reused in another program (task4)
    {
        this.color=color;
        this.ranks=ranks;
    }
    /**
     * @return the suit
     */
    public Color getColor() {
        return color;
    }

    /**
     * @return the value
     */
    public Ranks getRank() {
        return ranks;
    }
}


//#3--->Reusability principle of OO allows us to reuse our original Card code and extend it to become on UNO deck. Reusability means to reuse the properties of parent class in a subclass. This can be achieved by the concept of inheritance.

//#4--->The concept of packages allow Card class to be reused or extended in another program. A package is basically a group of similar types of classes or interfaces that means the Card class methods are also used by another program just by importing it in the program.

