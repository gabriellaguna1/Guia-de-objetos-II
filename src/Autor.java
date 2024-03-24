//nombre, apellido,
//        //email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
//        //único autor. Ejecute las siguientes instrucciones:
//        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
public class Autor {
    String name;
    String surname;
    String eMail;
    String gender;

    public Autor() {
    }

    public Autor(String name, String surname, String eMail, String gender) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.gender = gender;
    }
    public void printAutor(Autor a){
        System.out.println("AUTOR: "+ a.name+", "+a.surname+", "+a.eMail+", "+a.gender);
    }

}
