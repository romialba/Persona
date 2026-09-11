// Definicion de la clase
public class Persona {
    // Atributos (Encapsulamiento)
    private String nombre; private int edad;
// Constructor 
public Persona (String nombre, int edad) { 
    this.nombre = nombre;
    this.edad = edad;
}
//Metodo
public void saludar (){ 
    System.out.println ("Hola, mi nombre es " + nombre + " y tengo "+ edad + " años.");
 }
 //Punto de entrada del programa
 public static void main (String [] args) {
    Persona usuario = new Persona ("Fernanda", 17);
    usuario.saludar();
 }
}