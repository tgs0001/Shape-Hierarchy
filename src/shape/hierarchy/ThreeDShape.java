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
public class ThreeDShape extends Shape{
    private double height;
    ThreeDShape(Shape obj,double h)
    {
        super(obj);
        height=h;
    }
    ThreeDShape(double r)
    {
        super(r);
    }
    double getr()
    {
        return super.getwidth();
    }
    public double area()
    {
        return 0.0;
    }
    public double volume()
    {
        return 0.0;
    };
    
    
}
