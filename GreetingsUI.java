
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsUI extends JFrame {

    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //text area
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingsUI() {
        //configure the GUi
        this.setLayout(new BorderLayout());
        this.setTitle("Greetings UI");
        this.setSize(700, 750);
        this.setBackground(Color.yellow);
        
        //create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Greetings"));
        
        btnsPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create the labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        //create the text fields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //create the text Area
        greetingsTxtArea = new JTextArea(40,50);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [name] [surname]");
        
        //create the buttons
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add the name label textfield to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        //add the surname label textfield to the surname panel
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        //add the name and surname panel to the collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //add the greetings area to its panel
        greetingsAreaPnl.add(greetingsTxtArea);
        
        //add the buttons to their panel
        btnsPnl.add(greetBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        //add all the panels to the main panel
        mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        //add the main panel to the frame's panel
        add(headingPnl,BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        
        //make the frame visible
        setVisible(true);
    }
    
}
