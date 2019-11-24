package app;

//El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//Crea sus métodos get, set y toString.
//Tendrá dos métodos especiales:
//Ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa,
// no se hará nada.
//retirar(double cantidad): se retira una cantidad a la cuenta, 
//si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.//

//setter y getter se usa cuando tenes dos atriibutos que están sincronizados entre si (tienen valores relacionados para que se modifiquen ambos)111

public class Cuenta {

    private String titular;//parametro
    private double cantidad;//parametro

    
    // Metodos
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;

    }

    
    //Devuelve el estado del objeto* 
     
    public String toString() {
        return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
    }

    // Constructores
    public Cuenta(String titular) {
        this(titular, 0); // Sobrecarga
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        // Si la cantidad es menor que cero, lo ponemos a cero
        if (cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }
    }


    /**
     * Ingresa dinero en la cuenta, solo si es positivo la cantidad
     *
     */
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    /**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria en
     * cero
     *
     */
    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

}
