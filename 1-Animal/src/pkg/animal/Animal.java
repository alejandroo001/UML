package pkg.animal;

/**
 *
 * @author Rolaescobar
 */
public class Animal {

    private String ojos;
    private String boca;
    private String extremidades;
     private String raza;
    private int edad;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal(String ojos, String boca,String raza) {
        this.ojos = ojos;
        this.boca = boca;
        this.raza=raza;
    }

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

}
