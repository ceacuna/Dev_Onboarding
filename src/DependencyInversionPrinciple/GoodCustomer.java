package DependencyInversionPrinciple;
/*
DIP
En este ejemplo vemos dos casos donde Customer y Order son dos clases distintas
En el ejemplo malo Customer inicializa un objeto Order directamente creando una gran dependencia entre ellas
En el ejemplo bueno Customer depende de una abstraccion (interfaz o clase abstracta) en vez de en una clase directamente

Pregunta: ¿Por qué abstracción en vez de dependencias? Ejemplos de casos negativos

Este comentario es una prueha de git *IGNORAR*
 */
public class GoodCustomer {
    private Orderable order;

    public GoodCustomer(Orderable order) {
        this.order = order;
    }

    public void purchaseItem(Item item) {
        order.addItem(item);
        order.checkout();
    }
}
