package LiskovSubstitutionPrinciple;
/*
Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.
This means that every subclass or derived class should be substitutable for their base or parent class.

En esta clase tenemos el conflicto de que bote no tiene ruedas, así que o la clase Transporter no tiene en cuenta el caso de un transporte que no tenga ruedas o simplemente
bote no pertenece a transporter
 */

public class Transporter {
    public int ruedas;
    public String nombre;

    public Transporter(int ruedas, String nombre){
        this.ruedas = ruedas;
        this.nombre = nombre;
    }

    public void mostrarRuedas(){
        if(this.ruedas>0){
            System.out.println("Este vehículo tiene "+this.ruedas);
        } else{
            throw new IllegalArgumentException("El número de ruedas tiene que ser mayor que 0");
        }
    }
}
