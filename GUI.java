/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
import javax.swing.*;
/**
 *
 * @author OWNER
 */
public class GUI extends JFrame {
    JLabel lvalue1 = new JLabel("Length : ");
    JTextField fvalue1 = new JTextField();
    
    JLabel lvalue2 = new JLabel("Width : ");
    JTextField fvalue2 = new JTextField();
    
    JLabel lvalue3 = new JLabel("Height : ");
    JTextField fvalue3 = new JTextField();
    
    JLabel Title = new JLabel ("Cuboid Calculator");
    JLabel Result = new JLabel ("Result : ");
    
    JButton Count = new JButton ("Count");
    JButton Reset = new JButton ("Reset");
    
    JLabel SA = new JLabel ("");
    JLabel SC = new JLabel ("");
    JLabel CV = new JLabel ("");
    JLabel CSA = new JLabel ("");
                    
    JLabel resultSA = new JLabel ("");
    JLabel resultSC = new JLabel ("");
    JLabel resultCV = new JLabel ("");
    JLabel resultCSA = new JLabel ("");

    
    public GUI(){
        setTitle("Simple Calculator");
        setSize(350,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(lvalue1);
        add(fvalue1);
        add(lvalue2);
        add(fvalue2);
        add(lvalue3);
        add(fvalue3);
        
        add(Title);
        add(Result);
        add(Count);
        add(Reset);
        
        add(SA);
        add(SC);
        add(CV);
        add(CSA);
        
        add(resultSA);
        add(resultSC);
        add(resultCV);
        add(resultCSA);
        
        Title.setBounds(125, 15, 150, 30);
        lvalue1.setBounds(15, 70, 100, 30);
        fvalue1.setBounds(110, 70, 150, 30);
        lvalue2.setBounds(15, 115, 100, 30);
        fvalue2.setBounds(110, 115, 150, 30);
        lvalue3.setBounds(15, 160, 100, 30);
        fvalue3.setBounds(110, 160, 150, 30);
        
        Result.setBounds(150, 200, 100, 30);
        
        SA.setBounds(15, 250, 150, 30);
        SC.setBounds(15, 280, 150, 30);
        CV.setBounds(15, 310, 150, 30);
        CSA.setBounds(15, 340, 150, 30);
        
        resultSA.setBounds(180, 250, 150, 30);
        resultSC.setBounds(180, 280, 150, 30);
        resultCV.setBounds(180, 310, 150, 30);
        resultCSA.setBounds(180, 340, 150, 30);
        
        Count.setBounds(50, 400, 100, 30);
        Reset.setBounds(200, 400, 100, 30);
        
    }
    
    public String getFValue1(){
        return fvalue1.getText();
    }
    
    public String getFValue2(){
        return fvalue2.getText();
    }
    public String getFValue3(){
        return fvalue3.getText();
    }
}
