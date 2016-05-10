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
public class Circle extends TwoDShape {
    Circle(TwoDShape obj)
    {
        super(obj);
    }
    Circle(double r)
    {
        super(r);
    }
    public double area()
    {
        double x;
        x=super.getwidth();
        return 3.14*x*x;
    }
    
}
