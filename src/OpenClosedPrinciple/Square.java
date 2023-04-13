package OpenClosedPrinciple;



public class Square extends Shape {
    public double length;

    @Override
    public Double CalculateArea(){
        return length*2;
    }
}
