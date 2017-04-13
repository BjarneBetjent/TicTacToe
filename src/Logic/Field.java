package Logic;

/**
 * Created by Olav on 13-Apr-17.
 */
public class Field
{

    // 0 is free field, 1 is X, 2 is O
    private int field;

    public Field()
    {
        this.field = 0;
    }

    public int getField()
    {
        return field;
    }
    public void setField(int a)
    {
        field = a;
    }
}
