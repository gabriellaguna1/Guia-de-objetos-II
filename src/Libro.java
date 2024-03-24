
//Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
//        //precio, stock y Autor
public class Libro {
    String title;
    Float price;
    Integer stock;
    Autor autor;
    //agregado de punto h
    Autor autor1;

    public Libro() {
    }

    public Libro(String title, Float price, Integer stock, Autor autor, Autor autor1) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.autor = autor;
        //agregado de punto h
        this.autor1= autor1;
    }
    public void printBook(Libro l){
        System.out.println("LIBRO: "+l.title+", $"+l.price+", "+l.stock+" unidades, "+ l.autor.name+" "+l.autor.surname);
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }
    public void getAutorFromBook(Libro l){
        System.out.println("Datos del Autor desde el libro "+l.title+": "+l.autor.name+", "+l.autor.surname+", "+l.autor.eMail+", "+l.autor.gender+".");
    }
    public void getPriceOfBook(Libro l){
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        System.out.println("El libro, {"+l.title+"} de los autores: {" + l.autor.name+"} " + " y {" + l.autor1.name+ "} se vende a {"+l.price+"} pesos");
    }
}
