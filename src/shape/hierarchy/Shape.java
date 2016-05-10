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
abstract class Shape {
    private double width;
    Shape(double r1)
    {
        this.width=r1;
    }
    Shape(Shape obj)
    {
        width=obj.width;
    }
    double getwidth()
    {
        return width;
    }
    
    
}
