package Logic;

/**
 * Created by Olav on 13-Apr-17.
 */
public class Board
{
    public Field x00;
    public Field x01;
    public Field x02;
    public Field x10;
    public Field x11;
    public Field x12;
    public Field x20;
    public Field x21;
    public Field x22;

    public Board()
    {
        x00 = new Field();
        x01 = new Field();
        x02 = new Field();
        x10 = new Field();
        x11 = new Field();
        x12 = new Field();
        x20 = new Field();
        x21 = new Field();
        x22 = new Field();
    }

    public void reset()
    {
        x00.setField(0);
        x01.setField(0);
        x02.setField(0);
        x10.setField(0);
        x11.setField(0);
        x12.setField(0);
        x20.setField(0);
        x21.setField(0);
        x22.setField(0);
    }

    public boolean didHeWin(int a)
    {
        //Horizontally
        if(x00.getField() == a && x01.getField() == a && x02.getField() == a) return true;
        if(x10.getField() == a && x11.getField() == a && x12.getField() == a) return true;
        if(x20.getField() == a && x21.getField() == a && x22.getField() == a) return true;

        //Vertically
        if(x00.getField() == a && x10.getField() == a && x20.getField() == a) return true;
        if(x01.getField() == a && x11.getField() == a && x21.getField() == a) return true;
        if(x02.getField() == a && x12.getField() == a && x22.getField() == a) return true;

        //Diagonally
        if(x00.getField() == a && x11.getField() == a && x22.getField() == a) return true;
        if(x02.getField() == a && x11.getField() == a && x20.getField() == a) return true;

        return false;
    }
}
