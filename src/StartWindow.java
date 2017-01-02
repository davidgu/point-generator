import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by david on 1/1/17.
 */
public class StartWindow {
    private JTextField txtInputX;
    private JPanel panel1;
    private JButton btnGenerate;
    private JTextField txtInputY;
    private JLabel txtX;
    private JLabel txtY;
    private JTextField txtPointOutput;
    private JButton btnOutputPoints;

    int gridX = 0;
    int gridY = 0;
    Grid grid;
    String points;

    public StartWindow() {
        JFrame frame = new JFrame("Configure");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                gridX = Integer.parseInt(txtInputX.getText());
                gridY = Integer.parseInt(txtInputY.getText());
                grid = new Grid(gridX,gridY);


            }
        });
        btnOutputPoints.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtPointOutput.setText(grid.GetFilledBoxes());
            }
        });
    }
}
