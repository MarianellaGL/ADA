package app;

/**
 * Persona holi
 */
public class Persona {

    public String nombre;
    public char sexo;
    public int edad;
    public String DNI;
    public double altura;
    public double peso;

    public Persona(String nombre, char sexo, int edad, String dni, double altura, double peso) {

        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.DNI = dni;
        generarDni();
        this.altura = altura;
        this.peso = peso;
    }

    public Persona() {
    }

    public Persona(String nombre2, char sexo2, int edad2, double peso2, double altura2){}
    /**
     * El peso de la persona esta por debajo del peso ideal
     */
    public static final int INFRAPESO = -1;

    /**
     * El peso de la persona esta en su peso ideal
     */
    public static final int PESO_IDEAL = 0;

    /**
     * El peso de la persona esta por encima del peso ideal
     */
    public static final int SOBREPESO = 1;
    
    // Métodos privados

    private void generarDni() {
        final int divisor = 23;

        // Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        // Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        // Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        return letras[res];
    }

    // Métodos publicos
    /**
     * Modifica el nombre de la persona
     *
     * param nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la edad de la persona
     *
     * @param edad a cambiar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Modifica el sexo de la persona, comprueba que es correcto
     *
     * @param sexo a cambiar
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * Modifica el peso de la persona
     *
     * @param peso a cambiar
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Modifica la altura de la persona
     *
     * @param altura a cambiar
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el indice de masa corporal
     *
     * @return codigo numerico
     *         <ul>
     *         <li>-1: la persona esta por debajo de su peso ideal</li>
     *         <li>0: la persona esta en su peso ideal</li>
     *         <li>1: la persona esta por encima de su peso ideal</li>
     *         </ul>
     */
    public int calcularIMC() {
        // Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        // Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }

    /**
     * Indica si la persona es mayor de edad
     *
     * @return true si es mayor de edad y false es menor de edad
     */
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    /**
     * Devuelve informacion del objeto
     *
     * @return cadena con toda la informacion
     */
    // @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n" + "Nombre: " + nombre + "\n" + "Sexo: " + sexo + "\n" + "Edad: " + edad
                + " años\n" + "DNI: " + DNI + "\n" + "Peso: " + peso + " kg\n" + "Altura: " + altura + " metros\n";
    }
}