/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import bidang.Persegi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ruang.Balok;

/**
 *
 * @author OWNER
 */
public class Main {
    public static void main(String[] args) {
        View gui = new View();
        
        gui.Count.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    String Length = gui.getFValue1();
                    String Width = gui.getFValue2();
                    String Height = gui.getFValue3();
                    
                    double L = Integer.parseInt(Length);
                    double W = Integer.parseInt(Width);
                    double H = Integer.parseInt(Height);
                    
                    Persegi cube = new Persegi(L,W);
                    Balok cuboid = new Balok(L,W,H);
                    
                    String hasilSA = String.valueOf(cube.SquareArea());
                    String hasilSC = String.valueOf(cube.SquareCircumference());
                    String hasilCV = String.valueOf(cuboid.CuboidVolume());
                    String hasilCSA = String.valueOf(cuboid.CuboidSurfaceArea());
                    
                    gui.SA.setText("Square Area : ");
                    gui.SC.setText("Square Circumference : ");
                    gui.CV.setText("Cuboid Volume : ");
                    gui.CSA.setText("Cuboid Surface Area : ");
                    
                    gui.resultSA.setText(hasilSA);
                    gui.resultSC.setText(hasilSC);
                    gui.resultCV.setText(hasilCV);
                    gui.resultCSA.setText(hasilCSA);
                    
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, exc.getMessage() + " Input Number!");
                }
             }
        });
        
        gui.Reset.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                gui.SA.setText("");
                gui.SC.setText("");
                gui.CV.setText("");
                gui.CSA.setText("");
    
                gui.resultSA.setText("");
                gui.resultSC.setText("");
                gui.resultCV.setText("");
                gui.resultCSA.setText("");
                
                gui.fvalue1.setText("");
                gui.fvalue2.setText("");
                gui.fvalue3.setText("");
            }
        });
    }
}
