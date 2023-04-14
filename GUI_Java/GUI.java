/*******************
  Name:Ajani Dawson

  Date:07/04/2020

 Notes:Creating a GUI with a push button....    
*******************/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Actions extends JFrame
{
    private JLabel firstL, secondL, resultL;
    
    private JTextField firstTF, secondTF, resultTF;
    
    private JButton rightB, leftB;
    
    private RightButtonHandler rbHandler;
    private LeftButtonHandler lbHandler;
    
    private static final int WIDTH = 600;
    private static final int HEIGHT = 300;
    
    public Actions()
    {
     
        firstL = new JLabel("Enter first string: ",
                            SwingConstants.RIGHT);
        secondL = new JLabel("Enter second string: ",
                             SwingConstants.RIGHT);
        resultL = new JLabel("Larger string: ",
                             SwingConstants.RIGHT);
                             
        
        firstTF = new JTextField();
        secondTF = new JTextField();
        resultTF = new JTextField();
        
        
        rightB = new JButton("Right Side");
        rbHandler = new RightButtonHandler();
        rightB.addActionListener(rbHandler);
        
        
        leftB = new JButton("Left Exit");
        lbHandler = new LeftButtonHandler();
        leftB.addActionListener(lbHandler);
        
        setTitle("The Set Up");
        
        
        Container pane = getContentPane();
        
        
        pane.setLayout(new GridLayout(8, 4));
        
        
        pane.add(firstL);
        pane.add(firstTF);
        pane.add(secondL);
        pane.add(secondTF);
        pane.add(resultL);
        pane.add(resultTF);
        pane.add(rightB);
        pane.add(leftB);
        
        
        
        
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private class RightButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String str1, str2;
            
            str1 = firstTF.getText();
            str2 = secondTF.getText();
            
            if (str1.compareTo(str2) > 0)
                resultTF.setText(str1);
            else
                resultTF.setText(str2);
        }
     }
    
     private class LeftButtonHandler implements ActionListener
     {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
     }
     
     public static void main(String[] args)
     {
         Actions eg = new Actions();
     }
}     