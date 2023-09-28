class Biblioteca {
    private String nombre;
    private Libros[] libros; //Array de cantidad de libros
    private int contadorLibros; //Contador de libros

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libros[20];
        this.contadorLibros = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(Libros libro) {
        if (contadorLibros < libros.length) {
            libros[contadorLibros] = libro;
            contadorLibros++; //Se incrementa el contador de libros
        } else {
            System.out.println("La biblioteca está llena. No se puede agregar más libros.");
        }
    }
}

class Usuario {
    private String nombre;
    private int telefono;
    private String rut;
    private Biblioteca[] bibliotecas;

    public Usuario(String nombre, int telefono, String rut) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rut = rut;
        this.bibliotecas = new Biblioteca[10];
    }

    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public String getRut() {
        return rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
}

class Bibliotecario extends Usuario {
    public Bibliotecario(String nombre, int telefono, String rut) {
        super(nombre, telefono, rut);
    }
    public void agregarLibroAUsuario(Libros libro, Usuario usuario) {
        usuario.agregarLibro(libro);
    }
    public void eliminarLibroDeUsuario(Libros libro, Usuario usuario) {
        usuario.eliminarLibro(libro);
    }
}

class Libros {
    private String autor;
    private String nombre;
    private String genero;
    private int numeroPaginas;

    public Libros(String autor, String nombre, String genero, int numeroPaginas) {
        this.autor = autor;
        this.nombre = nombre;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }
    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

class LibrosFiccion extends Libros {
    private String sinopsis;
    private int año;

    public LibrosFiccion(String autor, String nombre, String genero, int numeroPaginas, String sinopsis, int año) {
        super(autor, nombre, genero, numeroPaginas);
        this.sinopsis = sinopsis;
        this.año = año;
    }

    public String getSinopsis() {
        return sinopsis;
    }
    public int getAño() {
        return año;
    }
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    public void setAño(int año) {
        this.año = año;
    }
}

class LibrosNoFiccion extends Libros {
    private boolean esBiografico;
    private String biografiado;

    public LibrosNoFiccion(String autor, String nombre, String genero, int numeroPaginas, boolean esBiografico, String biografiado) {
        super(autor, nombre, genero, numeroPaginas);
        if(esBiografico == true) {
            this.biografiado = biografiado;
        } else {
            this.biografiado = "No aplica";
        }
    }

    public boolean esBiografico() {
        return esBiografico;
    }
    public String getBiografiado() {
        return biografiado;
    }
    public void setBiografiado(String biografiado) {
        this.biografiado = biografiado;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
