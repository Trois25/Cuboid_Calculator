/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;

/**
 *
 * @author OWNER
 */
public class Balok extends Persegi implements MenghitungRuang{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
   
    public Balok(double Length,double Width, double Height){
        super(Length,Width);
        this.height = Height;
        
    };
    
    @Override
    public double CuboidVolume() {
        return super.SquareArea() * height;
    }

    @Override
    public double CuboidSurfaceArea() {
        return 2 * ((super.SquareArea()) + (super.getWidth() * height) + (super.getLength() * height));
    }
    
}
