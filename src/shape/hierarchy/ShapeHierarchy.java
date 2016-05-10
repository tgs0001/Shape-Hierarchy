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
public class ShapeHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cube obj=new Cube(5.0);
        System.out.println(obj.area());
        System.out.println(obj.volume());
        TwoDShape obj1=new TwoDShape(6.0);
        Circle obj2=new Circle(obj1);
        System.out.println(obj2.area());
    }
}
