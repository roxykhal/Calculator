import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

    JFrame frame;
    //will hold the numbers and result
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    //create an array that holds function buttons
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,multButton,divButton;
    JButton decButton, eqButton, delButton, clrButton;

    //Panel to hold all of the seperate buttons
    JPanel panel;

    //declare a font to use java
    Font myFont = new Font("Ink Free", Font.BOLD,30);

    //num1 and 2 stores values inputted by user, initialised to 0
    //operator stores the mathmetical operator inputted by user
    //result stores result of the operation performed using num1,2 and operator
    double num1=0,num2=0,result=0;
    char operator;

    Calculator() {


        frame = new JFrame("Calculator");
        //allows us to close out the program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        //cannot edit the textbox unless buttons are pressed
        textfield.setEditable(false);

        //buttons methods
        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");


        frame.add(textfield);
        frame.setVisible(true);

    }    
    
    public static void main(String[] args)  {

        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
      
    }
}

