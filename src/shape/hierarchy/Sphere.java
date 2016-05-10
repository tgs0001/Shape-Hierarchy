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
public class Sphere extends ThreeDShape{
    Sphere (double r)
    {
        super(r);
    }
    public double area()
    {
        double x=super.getwidth();
        return 4*3.14*x*x;
    }
    public double volume()
    {
        double x=super.getwidth();
        return 4/3*3.14*x*x*x;
    }
    
}
