import java.util.UUID;

// El mismo contiene un id, un nombre, descripción y
//        //precio unitario.
public class ItemVenta {
    private String ID;
    private String name;
    private String description;
    private Float unitPrice;

    public ItemVenta() {
    }

    public ItemVenta(String name, String description, Float unitPrice) {
        this.ID =UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public Float getUnitPrice() {

        return unitPrice;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public void setUnitPrice(Float unitPrice) {

        this.unitPrice = unitPrice;
    }

    public String showItems(){
        return "id: "+ID+", Nombre: "+name+", descripcion: "+description+", Precio unitario: "+unitPrice;
    }

}
