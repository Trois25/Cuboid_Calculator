/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author OWNER
 */
public class Persegi implements MenghitungBidang{
    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public Persegi(double Length, double Width){
        this.length = Length;
        this.width = Width;
    }

    @Override
    public double SquareArea() {
        return length * width;
    }

    @Override
    public double SquareCircumference() {
        return 2 * (length + width);
    }
    
}
