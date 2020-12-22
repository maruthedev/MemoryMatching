package Game;

import javax.swing.*;

public class Card extends JLabel {
    public Icon FaceSide;
    public Icon BackSide;
    public boolean isFaceUp;
    public int Index;
    public boolean isMatched;
    public boolean cantClick;

    Card(Icon FaceSide, Icon BackSide, boolean isFaceUp, int Index, boolean isMatched, boolean cantClick) {
        this.FaceSide = FaceSide;
        this.BackSide = BackSide;
        this.isFaceUp = isFaceUp;
        this.Index = Index;
        this.isMatched = isMatched;
        this.cantClick = cantClick;
    }

    public boolean matched(Card card1) {
        return this.Index == card1.Index;
    }
}
