import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Factura {
    String ID;
    Float montoTotal;
    private String date;
    private Cliente client;
    private ArrayList<ItemVenta> product;

    public Factura() {
    }

    public Factura(Float montoTotal, String date, Cliente client, ArrayList<ItemVenta> product) {
        this.ID = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.montoTotal = montoTotal;
        this.date=date;
        this.client = client;
        this.product=product;

    }

    public ArrayList<ItemVenta> getItems(){
        return product;
    }
    public Float finalPrice(Factura f){

        return f.montoTotal-f.montoTotal*(f.client.descuento/100);
    }
    public void mostrarArreglo(Factura f){
        System.out.println("ITEMS DE LA FACTURA: ");
        for(ItemVenta i: product){
            System.out.println("id: "+i.showItems());
        }
    }

    //Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?,
    //        //email=?, descuento=?]]
    public void getFactura(Factura f){
        System.out.println("FACTURA: {ID: "+f.ID+"} {Fecha: "+f.date+"} {Monto: "+f.montoTotal+"} {Monto con descuento: "+f.finalPrice(f)+"} {ID Cliente: "+f.client.ID+"} {Nombre: "+f.client.name+"} {Email: "+f.client.eMail+"} {%Desc: "+f.client.descuento+"}" +", items=");
    }
}
