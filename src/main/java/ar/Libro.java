package ar.edu.bliblioteca.modelo;

public class Libro { 

    private String isbn;
    private String titulo;
    private boolean disponible;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.disponible = true;
    }

}