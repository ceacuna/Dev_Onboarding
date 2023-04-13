package OpenClosedPrinciple;

public class Circle extends Shape{
    public double radius;

    @Override
    public Double CalculateArea(){
        return radius*3.14;
    }
}
