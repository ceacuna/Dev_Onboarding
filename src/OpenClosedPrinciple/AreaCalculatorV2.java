package OpenClosedPrinciple;

import SingleResponsabilityPrinciple.Circle;
import SingleResponsabilityPrinciple.Square;

public class AreaCalculatorV2 {
    /*OPEN CLOSED PRINCIPLE
    Objects or entities should be open for extension but closed for modification
    En este caso este principio no se cumple porque esta clase debería ser extendible sin la necesidad de modificar la clase
    por ejemplo si creasemos un triángulo deberíamos de modificar esta clase
    SOLUCIÇIÓN: añadir un método en cada shape que calcule el área de sí mismo y que nuestro AreaCalculator simplemente retorne ese área
    */

    /*
    public String calculateArea(Object shape) {
        Double area = 0.0;
        if(shape instanceof Square){
            Square square = (Square) shape;
            return "Area of the SingleResponsabilityPrinciple.Square is: "+ area;
        } else if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            return "Area of the SingleResponsabilityPrinciple.Circle is: "+ area;
        } else {
            return "Incorrect shape";
        }
    }
     */

    public Double calculateArea(Shape shape) {
        return shape.CalculateArea();
    }
}
