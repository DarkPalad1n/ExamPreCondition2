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

    JFrame calculatorFrame; //Creates an object of class JFrame.

    JLabel label = new JLabel();
    JTextField textField = new JTextField();

    JRadioButton switchOn = new JRadioButton("on");
    JRadioButton switchOff = new JRadioButton("off");

    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("x");
    JButton buttonDivision = new JButton("/");
    JButton buttonModulo = new JButton("mod");
    JButton buttonSum = new JButton("sum");
    JButton buttonQuer = new JButton("quer");
    JButton buttonEqual = new JButton("=");
    JButton buttonMemory = new JButton("Memory");

    //----------CONSTRUCTOR----------//

    public GuiCalculator(){
        completeCalculatorFrame();

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

    /*
    Sets the initial properties of the calculator's frame and adding it into calculatorFrame.
     */
    public void setCalculatorFrameProperties(){
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.WHITE);
        calculatorFrame.add(label); //Adding defined objects to the calculator frame.
    }

    /*
    Sets the text field properties and adding it into calculatorFrame.
     */
    public void setTextFieldProperties(){
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        calculatorFrame.add(textField);
    }

    /*
    Sets the switch on button's properties and adding it into calculatorFrame.
     */
    public void setSwitchOnProperties(){
        switchOn.setBounds(10, 95, 60, 40);
        switchOn.setSelected(true); //Initial state's switched on.
        switchOn.setFont(new Font("Arial", Font.BOLD, 14));
        switchOn.setBackground(Color.BLACK);
        switchOn.setForeground(Color.WHITE);
        calculatorFrame.add(switchOn);
    }

    /*
    Sets the switch off button's properties and adding it into calculatorFrame.
     */
    public void setSwitchOffProperties(){
        switchOff.setBounds(10, 120, 60, 40);
        switchOff.setSelected(false);
        switchOff.setFont(new Font("Arial", Font.BOLD, 14));
        switchOff.setBackground(Color.BLACK);
        switchOff.setForeground(Color.WHITE);
        calculatorFrame.add(switchOff);
    }

    /*
    Creates a ButtonGroup object storing JRadioButtons in it.
     */
    public void createButtonGroup(){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(switchOn);
        buttonGroup.add(switchOff);
    }

    /*
    Sets the properties of button zero and adding it into calculatorFrame.
     */
    public void setButtonZeroProperties(){
        buttonZero.setBounds(10, 410, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonZero);
    }

    /*
    Sets the properties of button one and adding it into calculatorFrame.
     */
    public void setButtonOneProperties(){
        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonOne);
    }

    /*
    Sets the properties of button two and adding it into calculatorFrame.
     */
    public void setButtonTwoProperties(){
        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonTwo);
    }

    /*
    Sets the properties of button three and adding it into calculatorFrame.
     */
    public void setButtonThreeProperties(){
        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonThree);
    }

    /*
    Sets the properties of button four and adding it into calculatorFrame.
     */
    public void setButtonFourProperties(){
        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonFour);
    }

    /*
    Sets the properties of button five and adding it into calculatorFrame.
     */
    public void setButtonFiveProperties(){
        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonFive);
    }

    /*
    Sets the properties of button six and adding it into calculatorFrame.
     */
    public void setButtonSixProperties(){
        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonSix);
    }

    /*
    Sets the properties of button seven and adding it into calculatorFrame.
     */
    public void setButtonSevenProperties(){
        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonSeven);
    }

    /*
    Sets the properties of button eight and adding it into calculatorFrame.
     */
    public void setButtonEightProperties(){
        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonEight);
    }

    /*
    Sets the properties of button nine and adding it into calculatorFrame.
     */
    public void setButtonNineProperties(){
        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        calculatorFrame.add(buttonNine);
    }

    /*
    Sets the properties of mathematical button equal and adding it into calculatorFrame.
     */
    public void setButtonEqualProperties(){
        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(Color.ORANGE);
        calculatorFrame.add(buttonEqual);
    }

    /*
    Sets the properties of mathematical button plus and adding it into calculatorFrame.
     */
    public void setButtonPlusProperties(){
        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(Color.ORANGE);
        calculatorFrame.add(buttonPlus);
    }

    /*
    Sets the properties of mathematical button minus and adding it into calculatorFrame.
     */
    public void setButtonMinusProperties(){
        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(Color.ORANGE);
        calculatorFrame.add(buttonMinus);
    }

    /*
    Sets the properties of mathematical button multiply and adding it into calculatorFrame.
     */
    public void setButtonMultiplyProperties(){
        buttonMultiply.setBounds(220, 230, 60, 40);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMultiply.setBackground(Color.ORANGE);
        calculatorFrame.add(buttonMultiply);
    }

    /*
    Sets the properties of mathematical button division and adding it into calculatorFrame.
     */
    public void setButtonDivisionProperties(){
        buttonDivision.setBounds(220, 110, 60, 40);
        buttonDivision.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDivision.setBackground(Color.ORANGE);
        calculatorFrame.add(buttonDivision);
    }

    /**
     * Combines all the numbered button set-up methods in a
     * method which is used in completeSetUp().
     */
    public void numberedButtonProperties(){
        setButtonZeroProperties();
        setButtonOneProperties();
        setButtonTwoProperties();
        setButtonThreeProperties();
        setButtonFourProperties();
        setButtonFiveProperties();
        setButtonSixProperties();
        setButtonSevenProperties();
        setButtonEightProperties();
        setButtonNineProperties();
    }

    /**
     * Combines all the mathematical button set-up methods in a
     * method which is used in completeSetUp().
     */
    public void mathematicalButtonProperties(){
        setButtonEqualProperties();
        setButtonPlusProperties();
        setButtonMinusProperties();
        setButtonMultiplyProperties();
        setButtonDivisionProperties();
    }

    /**
     * Combines all the set-up methods in a sequential
     * method for constructor usage.
     */
    public void completeCalculatorFrame(){
        setUpGraphicalUserInterface();
        setCalculatorFrameProperties();
        setTextFieldProperties();
        setSwitchOnProperties();
        setSwitchOffProperties();
        createButtonGroup();
        numberedButtonProperties();
        mathematicalButtonProperties();
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
