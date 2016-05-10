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
public class Cube extends ThreeDShape{
    Cube(double r)
    {
        super(r);
    }

   
    public double area()
    {
        return 6*super.getwidth()*super.getwidth();
    }
    public double volume()
    {
        double x;
        x=super.getwidth();
        return x*x*x;
    }
    
    
}
