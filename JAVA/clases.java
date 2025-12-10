
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;


    // Constructor COMPLETAR
    public Coche (String marca , String modelo, int velocidad){
        this.marca = marca ;
        this.modelo = modelo ;
        this.velocidad = velocidad;
    }
    
    // Método acelerar (suma +10) COMPLETAR
   public static void acelerar(){
    System.out.println("El coche va a acelerar...");
    velocidad =+ 10;
    System.out.println("El" + marca + modelo + "va ahora a " +  velocidad + " km/h");
   }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
   
   public static int frenar(){
    velocidad=-10;
    if (velocidad < 0){
        System.out.println("La velocidad no puede ser menor que 0");
        return velocidad;
    }else{
        System.out.println("La velocidad ha reducido en 10, " + "y ahora va a " +  velocidad +  "km/h");
    }
   }

    // Método mostrarDatos COMPLETAR
    public static void mostrarDatos(){
        System.out.println("\n Marca:" + marca "\n Modelo:" + modelo + "\n Velocidad:" + velocidad);
    }

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR
    public Alumno (String nombre, ArrayList<Integer> notas){
        this.nombre = nombre;
        this.ArrayList<Integer> notas = notas;

    }
   

    // Método añadirNota COMPLETAR

   public static void añadirNota(){
    int nota1 = notas.add(//nota);
    int nota2 = notas.add();
    System.out.println("Nota añadida correctamente");

   }

    // Método calcularMedia COMPLETAR
    public static void calcularMedia(){
        int notaMedia = (nota1 + nota2)/2;
        System.out.println("Nota media: " + notaMedia);

    }

    // Método mostrarInfo COMPLETAR
    public static void mostarInfo(){
        System.out.println("Nombre: " + nombre + "\nNota 1: " + nota1 + "\Nota 2: " + nota2 + "\nNota Media: " + notaMedia);
    } 

}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR
    private String titular;
    private double saldo;
    
    
    static double saldoCajero = 0; 
    // constructor COMPLETAR
    public CuentaBancaria (String titular, double saldo){
        this.titular= titular;
        this.saldo= saldo;
    }

    // método ingresar COMPLETAR
   public static double ingresar(double saldoIngresar){
    
    if(saldo < 0){
        System.out.println("No tienes saldo para ingresar");
        return saldo;
    }else{
        saldoCajero =+ saldoIngresar;
        System.out.println("Has ingresado " + saldoIngresar + ", ahora tienes en el cajero " + saldoCajero);
    }
    return saldoCajero;
   }

    // método retirar COMPLETAR

    public static double retirar(double dineroRetiro){
        dineroRetiro = 0;
        if(dineroRetiro > saldoCajero){
            System.out.println("No tienes tanto dinero en el cajero");
            return dineroRetiro;
        }else{
            saldo = saldo + dineroRetiro;
            System.out.println("Dinero retirado: "+ dineroRetiro + "y ahora tienes: " + saldo + " y te queda en el cajero: " + saldoCajero);
        }
        return saldo;
    }

   

    // método mostrarSaldo COMPLETAR

    public static void mostrarSaldo(){
        System.out.println("Saldo: " + saldo)
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
   
   public Libro(String titulo, String autor. String disponible){
    this.titulo = titulo;
    this.autor = autor;
    this.disponible = disponible;
   }

    // método mostrarInfo COMPLETAR

    public static void mostrarInfo(){
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "Disponible: " + disponible);
    }
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

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

        Coche coche = new Coche("Mercedes", "A4", 70);
        coche.acelerar();
        coche.frenar();
        cohe.acelerar();
        coche.frenar();
        coche.frenar();
        coche.mostrarDatos();



        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.



        Alumno alumno = new Alumno ("Jaime");

        alumno.añadirNota(5);
        alumno.añadirNota(10);
        alumno.notaMedia();
        alumno.mostarInfo();



        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        CuentaBancaria cuenta = new CuentaBancaria ("Dani", 1000)

        cuenta.ingresar(500);
        cuenta.retirar(5000)
        cuenta.retirar(250);
        cuenta.mostrarSaldo();


        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}
