import java.util.UUID;

public class Cliente {
    //El Cliente
    //        //también posee un nombre, un email y un porcentaje de descuento.
    String ID;
    String name;
    String eMail;
    Float descuento;

    public Cliente() {
    }

    public Cliente(String name, String eMail, Float descuento) {
        this.ID= UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.name = name;
        this.eMail = eMail;
        this.descuento = descuento;
    }
    //Cliente[id=?, nombre=?, email=?, descuento=?]
    public void getClient(Cliente c){
        System.out.println("CLIENTE: {ID:"+c.ID+"}, {NOMBRE:"+c.name+"}, {EMAIL:"+c.eMail+"}, {%DESC: "+c.descuento+"}");
    }

}
