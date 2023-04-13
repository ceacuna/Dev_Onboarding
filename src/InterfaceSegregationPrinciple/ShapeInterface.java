package InterfaceSegregationPrinciple;
/*
INTERFACE SEGREGATION PRINCIPLE
A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
En este caso esta interfaz no cumple con el principio ya que es una interfaz util para figuras 3d pero no es compatible para figuras 2d
por lo cual debería haber dos interfaces una para figuras 2d y otras para figuras 3d
 */
public interface ShapeInterface {
    public Double calculateArea();

    public Double calculateVolume();
}
