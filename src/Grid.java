/**
 * Created by david on 1/1/17.
 */
import javax.swing.*;
import java.awt.*;

public class Grid {

    private JPanel panel;
    private JFrame frame;
    private GridLayout layout;
    private JCheckBox[][] checkBox;
    private int x;
    private int y;

    Grid(int x, int y){
        this.x = x;
        this.y = y;
        frame = new JFrame();
        panel = new JPanel();
        layout = new GridLayout(x, y);
        checkBox = new JCheckBox[x][y];
        panel.setLayout(layout);

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
                checkBox[i][j] = new JCheckBox();
                panel.add(checkBox[i][j]);
            }
        }
        frame.setContentPane(panel);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel.setVisible(true);

    }

    String GetFilledBoxes(){
        String output = "[";
        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++){
            if(checkBox[i][j].isSelected()){
                    String point = "["+i+","+j+"],";
                    output = output.concat(point);
                }
            }
        }
        output = output.substring(0, output.length()-1);
        output = output.concat("]");
        //Remove trailing comma and add closing square bracket

        return output;
    }

}
