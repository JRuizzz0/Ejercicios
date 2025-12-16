
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//


class Coche {
    private static String marca;
    private static String modelo;
    private static int velocidad;
    private static int velocidadActual;

    // Constructor COMPLETAR
    public Coche (String marca , String modelo, int velocidad){
        this.marca = marca ;
        this.modelo = modelo ;
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR
    public static void acelerar(){
        System.out.println("El coche va a acelerar...");
        velocidadActual = velocidad + 10;
        System.out.println("El " + marca + " " +  modelo + " va ahora a " +  velocidadActual + " km/h");
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR

    public static int frenar(){
        velocidadActual= velocidadActual - 10;
        if (velocidad < 0){
            System.out.println("La velocidad no puede ser menor que 0");
            return velocidad;
        }else{
            System.out.println("La velocidad ha reducido en 10, " + "y ahora va a " +  velocidadActual +  "km/h");
        }
        return velocidadActual;
    }

    // Método mostrarDatos COMPLETAR
    public static void mostrarDatos(){
        System.out.println("\n Marca:" + marca +  "\n Modelo:" + modelo + "\n Velocidad:" + velocidadActual);
    }

}




// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


package programacion;

import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Double> notas;
    private double notaMedia;


    // Constructor COMPLETAR

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        this.notaMedia = 0;

    }


    // Método añadirNota COMPLETAR

    public void añadirNota(double nota) {

            notas.add(nota);
            System.out.println("Nota añadida correctamente " + nota);



    }

    // Método calcularMedia COMPLETAR
    public void calcularMedia(){
        if (notas.isEmpty()) {
            this.notaMedia = 0.0;
            return;
        }
        double suma = 0.0;
        for(double nota: notas){
            suma += nota; 
        }
        this.notaMedia = suma / notas.size();
        System.out.println("Nota media: " + notaMedia);
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nNotas: " + notas + "\nNota media: " + notaMedia);
    }

}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


package programacion;

import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Double> notas;
    private double notaMedia;


    // Constructor COMPLETAR

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
        this.notaMedia = 0;

    }


    // Método añadirNota COMPLETAR

    public void añadirNota(double nota) {

            notas.add(nota);
            System.out.println("Nota añadida correctamente " + nota);



    }

    // Método calcularMedia COMPLETAR
    public void calcularMedia(){
        if (notas.isEmpty()) {
            this.notaMedia = 0.0;
            return;
        }
        double suma = 0.0;
        for(double nota: notas){
            suma += nota;
        }
        this.notaMedia = suma / notas.size();
        System.out.println("Nota media: " + notaMedia);
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nNotas: " + notas + "\nNota media: " + notaMedia);
    }

}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//



class Libro {

    // atributos COMPLETAR
    private String titulo;
    private String autor;
    private String disponible;


    // constructor COMPLETAR

    public Libro(String titulo, String autor, String disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // método mostrarInfo COMPLETAR

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "Disponible: " + disponible);
    }

}





import java.util.ArrayList;


class Biblioteca {

    // lista de libros COMPLETAR

    private ArrayList<Libros> libros;

    Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    // añadirLibro COMPLETAR

    public void añadirLibro(Libros libro) {
        libros.add(libro);
        System.out.println("Libro añadido correctamente: " + libro);


    }

    // prestarLibro COMPLETAR

    public void prestarLibro(Libros libro) {
        for (int i = 0; i < libros.size(); i++) {
            Libros l = libros.get(i);
            libros.remove(libro);
            System.out.println("Libro prestado correctamente: " + l);

        }

    }
        // devolverLibro COMPLETAR

    public void devolverLibro (Libros libro){
            libros.add(libro);
            System.out.println("Libro devuelto correctamente");



        }

    }





// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
    private String nombre;
    private double precio;
   

    // constructor COMPLETAR
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    

    // getters opcionales COMPLETAR
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }


class Carrito {

    // lista de productos COMPLETAR
    
    private ArrayList <Producto> productos;

    // añadirProducto COMPLETAR

    public Carrito(){
        this.productos=new ArrayList()<>;
    }
    

    public static void añadirProducto(Producto producto){
    
    

    productos.add(producto);

    System.out.println("Producto añadido correctamente");
    }

    // calcularTotal COMPLETAR

    public static void calcularTotal(Producto producto){
        int total =+ producto.getPrecio;
        System.out.println(total)
    }
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//


public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        public class MainCoche {

    public static void main(String[] args) {

    Coche coche1 = new Coche("BMW", "M8" , 100);

    coche1.acelerar();
    coche1.frenar();
    coche1.frenar();
    coche1.acelerar();
    coche1.frenar();

    coche1.mostrarDatos();

    }
}




        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.



        public class MainAlumno {

        public static void main(String[] args) {
        Alumno alumno = new Alumno ("Jaime");

        alumno.añadirNota(10);
        alumno.añadirNota(5);

        alumno.calcularMedia();
        alumno.mostrarInfo();




        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

    

public class MainBanco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Jaime", 1000);

        cuenta.ingresar(500);
        cuenta.retirar(5000);
        cuenta.retirar(250);
        cuenta.mostrarSaldo();
    }
}



        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.



        package programacion;

public class MainBiblioteca {

    public static void main(String[] args) {


    Biblioteca biblioteca = new Biblioteca();

   Libros libro1 = new Libros("LAlaland" , "KJ", "Si");
   Libros libro2 = new Libros("Harry" , "JK", "Si");
   Libros libro3 = new Libros("Vinland", "Thorfeen", "Si");

    biblioteca.añadirLibro(libro1);
    biblioteca.añadirLibro(libro2);
    biblioteca.añadirLibro(libro3);

    biblioteca.prestarLibro(libro1);

    biblioteca.devolverLibro(libro1);

    libro1.mostrarInfo();
    libro2.mostrarInfo();
    libro3.mostrarInfo();

    }
}

  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

        Producto producto1 = new Producto("Leche", 2);
        Producto producto1 = new Producto("Yogurt", 1.5);
        Producto producto1 = new Producto("Jamon", 5);

        Carrito carrito = new Carrito();

        carrito.añadirProducto(producto1);
        carrito.añadirProducto(producto2);
        carrito.añadirProducto(producto3);

        carrito.calcularTotal(producto1, producto2, producto3);



    }
}
