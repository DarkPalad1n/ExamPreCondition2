package intCalculatorGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ...
 *
 * @author DarkPalad1n
 */

public class GuiCalculator extends JFrame implements ActionListener {

    //----------VARIABLES----------//

    //JButton button[] = new JButton[10]; //Array of ten buttons to store digits from 0 to 9 in it.
    //JButton addition, subtraction, multiplication, division, equation, clear;
    JFrame calculatorFrame; //Creates an object of class JFrame.

    //----------CONSTRUCTOR----------//

    public GuiCalculator(){
        setUpGraphicalUserInterface();

    }

    //----------METHODS----------//

    /**
     * This method's creating an object of class JFrame as well
     * as setting the following properties:
     *
     * title, size, layout, background schema, resizable option,
     * centered location, visibility and the default close
     * operation.
     *
     * It's used in the constructor of class GuiCalculator.
     */
    public void setUpGraphicalUserInterface(){
        calculatorFrame = new JFrame();
        calculatorFrame.setTitle("Calculator");
        calculatorFrame.setSize(300,490);
        calculatorFrame.getContentPane().setLayout(null); //Sets the layout.
        calculatorFrame.getContentPane().setBackground(Color.BLACK);
        calculatorFrame.setResizable(false); //With false preventing the window from resizing.
        calculatorFrame.setLocationRelativeTo(null); //Centers the window.
        calculatorFrame.setVisible(true);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
