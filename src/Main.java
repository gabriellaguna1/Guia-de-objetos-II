import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static <list> void main(String[] args) {

        //region EJERCICIO 1
        //Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
        //precio, stock y Autor, este último posee las características de nombre, apellido,
        //email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
        //único autor. Ejecute las siguientes instrucciones:
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        //b. Imprima por pantalla al autor previamente instanciado.
        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.
        //d. Imprima por pantalla el libro instanciado.
        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.
        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        //h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
        //cambios necesarios en el método del punto g, para imprimir un nuevo
        //mensaje que liste los autores que contribuyeron a ese libro.

        /*Autor a= new Autor("Joshua", "Bloch","joshua@email.com", "M");
        //agregado de punto h
        Autor b= new Autor("Montoto", "flores", "montotoflores@email.com", "M");
        a.printAutor(a);
        Libro book= new Libro("Effective java", 450f, 150, a, b);
        book.printBook(book);

        book.setPrice(500f);
        book.setStock(book.getStock()+50);
        book.printBook(book);

        System.out.println("imprimiendo atributos autor desde el libro...");
        book.getAutorFromBook(book);
        book.getPriceOfBook(book);
        */
        //endregion
        //region EJERCICIO 2
        //Nos contratan para hacer un programa que lleve el control de las ventas de un
        //local. Para esto es necesario modelar la clase Cliente, que posee un atributo id
        //como identificador del cliente, el mismo debe ser un valor compuesto por letras y
        //números aleatorios que se generan automáticamente al crear un Cliente. El Cliente
        //también posee un nombre, un email y un porcentaje de descuento.
        //Por otro lado vamos a tener el objeto Factura que representa una venta del
        //local, cada Factura posee un identificador de las mismas características que el
        //usado en Cliente. A su vez cada factura posee un monto total, una fecha y el Cliente
        //que generó la compra. Para la fecha de la venta se le va a asignar la fecha y hora al
        //momento de creación del objeto Factura. El tipo Factura debe contar con un
        //método que calcule el monto final luego de aplicarle el descuento que posee el
        //cliente.
        //a. Investigue la clase UUID y sus métodos estáticos para la generación de los
        //ids. Investigue la clase LocalDate y sus métodos estáticos para la generación
        //de la fecha.
        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        //haga uso de un método que facilite la impresión del mismo.
        //Cliente[id=?, nombre=?, email=?, descuento=?]
        //c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento.
        //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        //siga el siguiente formato.
        //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
        //email=?, descuento=?]]
        //e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        //forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        //precio unitario. Considere las modificaciones necesarias en el tipo Factura
        //para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        //calcular los montos totales con y sin el descuento aplicado.

        System.out.println("Ingrese nombre del cliente: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("ingrese e-mail: ");
        String eMail = sc.nextLine();
        System.out.println("Ingrese porcentaje de descuento: ");
        Scanner sr = new Scanner(System.in);
        Float descuento = sr.nextFloat();


        Cliente client = new Cliente(name, eMail, descuento);
        client.getClient(client);
        System.out.println("para crear una factura ingrese el monto total de la venta: ");
        Float venta = sr.nextFloat();
        LocalDate f = LocalDate.now();
        String fecha = f.toString();
        //agregado punto e


        ItemVenta itemVenta1 = new ItemVenta("Lapiz", "Lapiz numero 3", 15.0f);
        ItemVenta itemVenta2 = new ItemVenta("Hojas A4", "Hojas A4 x150", 175.5f);
        ItemVenta itemVenta3 = new ItemVenta("Carpeta A4", "Carpeta negra A4", 25.0f);

        List<ItemVenta> product = new ArrayList<>();
        product.add(itemVenta1);
        product.add(itemVenta2);
        product.add(itemVenta3);

        Factura fac = new Factura(venta, fecha, client, product);
        System.out.println("Monto total factura ID: " + fac.ID + " " + fac.montoTotal + ", con descuento: " + fac.finalPrice(fac));
        System.out.println("mostrando todos los datos de la factura...");
        fac.getFactura(fac);
        fac.mostrarArreglo(fac);


    }
}