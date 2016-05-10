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
class TwoDShape extends Shape{
    private double length;
    TwoDShape(double r,double l)
    {
        super(r);
        this.length=l;
    }
    TwoDShape(double r)
    {
        super(r);
    }
    TwoDShape(Shape obj)
    {
        super(obj);
    }
    public double area()
    {
        System.out.println("Area for 2D");
        return 0.0;
    }
    double getwidth()
    {
        return super.getwidth();
    }
    double getlength()
    {
        return length;
    }
    
}
