/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author User
 */
class Circle extends Shape{
    
    private double radius;
    public Circle(String name){
        
        super(name);
    }
    public void setDimension(double radius){
        
        this.radius=radius;
    }
    @Override
    public void printDimension(){
    
        System.out.println("radius : "+radius);
    }
    @Override
    public double getArea(){
        
        return 3.14*radius*radius;
    }
}