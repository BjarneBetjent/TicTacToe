package GUI;

import Logic.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {

    @FXML
    Button x00, x01, x02, x10, x11, x12, x20, x21, x22, resetBtn;
    @FXML
    Label xLabel, oLabel, winLabel;

    boolean whosTurn; // X will be true, O false;
    boolean unfinished = true;
    Board board = new Board();

    public void xTurn()
    {
        whosTurn = true;
        xLabel.setText("X go!");
        oLabel.setText("");
    }
    public void oTurn()
    {
        whosTurn = false;
        xLabel.setText("");
        oLabel.setText("O go!");
    }

    public void win(int a)
    {
        if( a == 1)
        {
            winLabel.setText("X won!");
            xLabel.setText("");
            unfinished = false;
        }
        else if(a == 2)
        {
            winLabel.setText("O won!");
            unfinished = false;
            oLabel.setText("");
        }
    }

    @FXML
    private void handleReset(ActionEvent event) throws IOException
    {
        board.reset();
        x00.setText("");
        x01.setText("");
        x02.setText("");
        x10.setText("");
        x11.setText("");
        x12.setText("");
        x20.setText("");
        x21.setText("");
        x22.setText("");
        winLabel.setText("");
        unfinished = true;
        oTurn();
    }

    @FXML
    private void handle00(ActionEvent event) throws IOException
    {
        if(board.x00.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x00.setField(1);
                x00.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x00.setField(2);
                x00.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle01(ActionEvent event) throws IOException
    {
        if(board.x01.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x01.setField(1);
                x01.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x01.setField(2);
                x01.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle02(ActionEvent event) throws IOException
    {
        if(board.x02.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x02.setField(1);
                x02.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x02.setField(2);
                x02.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle10(ActionEvent event) throws IOException
    {
        if(board.x10.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x10.setField(1);
                x10.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x10.setField(2);
                x10.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle11(ActionEvent event) throws IOException
    {
        if(board.x11.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x11.setField(1);
                x11.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x11.setField(2);
                x11.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle12(ActionEvent event) throws IOException
    {
        if(board.x12.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x12.setField(1);
                x12.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x12.setField(2);
                x12.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle20(ActionEvent event) throws IOException
    {
        if(board.x20.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x20.setField(1);
                x20.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x20.setField(2);
                x20.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle21(ActionEvent event) throws IOException
    {
        if(board.x21.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                board.x21.setField(1);
                x21.setText("X");
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                board.x21.setField(2);
                x21.setText("O");
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }
    @FXML
    private void handle22(ActionEvent event) throws IOException
    {
        if(board.x22.getField() == 0 && unfinished)
        {
            if(whosTurn)
            {
                x22.setText("X");
                board.x22.setField(1);
                if(board.didHeWin(1))
                {
                    win(1);
                }
                else oTurn();
            }
            else
            {
                x22.setText("O");
                board.x22.setField(2);
                if(board.didHeWin(2))
                {
                    win(2);
                }
                else xTurn();
            }

        }
    }

}
