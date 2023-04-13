package SingleResponsabilityPrinciple;

public class AreaCalculator {
    /*
    SINGLE RESPONSIBILITY PRINCIPLE
    A class should have one and only one reason to change, meaning that a class should have only a job
    En esta clase el problema es que no solo hace una labor, si no que tanto calcula como printea
    La forma correcta sería crear una clase ajena que se encargase del output y usar esta únicamente para calcular el área
     */
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
}
