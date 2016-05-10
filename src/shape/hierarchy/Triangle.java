/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape.hierarchy;

/**
 *
 * @author User
 */
public class Triangle extends TwoDShape{
    Triangle(double r,double l)
    {
        super(r,l);
    }
    Triangle(TwoDShape obj)
    {
        super(obj);
    }
    public double area()
    {
        return super.getlength()*super.getwidth()*.5;
    }
    
}
