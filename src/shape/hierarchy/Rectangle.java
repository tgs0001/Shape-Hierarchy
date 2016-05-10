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
public class Rectangle extends TwoDShape{
    Rectangle(double r,double l)
    {
        super(r,l);
    }
    Rectangle(TwoDShape obj)
    {
        super(obj);
    }
    public double area()
    {
        return super.getlength()*super.getwidth();
    }
    
}
