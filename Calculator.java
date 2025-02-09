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

        //function buttons methods
        addButton = new JButton("+");
        subButton = new JButton("-");
        multButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        eqButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = eqButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        //for loop to iterate through function Jbuttons 
        for(int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);

        }

         //for loop to iterate through number Jbuttons 

        for(int i = 0; i < 10; i++) {
          numberButtons[i] = new JButton(String.valueOf(i));
          numberButtons[i].addActionListener(this);
          numberButtons[i].setFont(myFont);
          numberButtons[i].setFocusable(false);

        }


        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        //add a panel and set the background and spacing of it

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.PINK);

        //add buttons to the UI in order

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        


        //add buttons to frame
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);

    }    
    
    public static void main(String[] args)  {

        Calculator calc = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //The getSource() method gets the button that was clicked (in this case, numberButtons[i]).The code then checks if the clicked button (e.getSource()) matches one of the buttons in the numberButtons array (numberButtons[i]), and if so, it appends the corresponding number to the text field.

        for(int i = 0; i<10; i++) {
            if(e.getSource() == numberButtons[i]) {
                //
                textfield.setText(textfield.getText().concat(String.valueOf(i)));;
            }
        }

        //functionality for division button
        if(e.getSource()==decButton) {
            textfield.setText(textfield.getText().concat("."));
        }
      
    }
}

