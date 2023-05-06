
package Controlador;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.AutorJpaController;
import Persistencia.EditorialJpaController;
import Persistencia.LibroJpaController;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;


public class ControladoraPersistencia {

    AutorJpaController autorJpa = new AutorJpaController();
    EditorialJpaController editorialJpa = new EditorialJpaController();
    LibroJpaController libroJpa = new LibroJpaController();
     ///////////////////////////Libros//////////////////////////////////////////
    public void CrearLibro(Libro libro) throws Exception {
       try {
            libroJpa.create(libro);
       } catch(Exception e) {
           throw new Exception("Error al crear el libro: " + e.getMessage());
       }
       
    }
    
    public void eliminarLibro(Long id) throws NonexistentEntityException {
        try {
            libroJpa.destroy(id);
        } catch (Exception e) {
            throw new NonexistentEntityException("Error al eliminar el libro: " + e.getMessage());
        }

    }

    public Libro buscarLibro(long id) {
        try {
            if (id <= 0) {
                throw new IllegalArgumentException("ID de libro inválida");
            }
            return libroJpa.findLibro(id);
        } catch (Exception e) {
            throw new RuntimeException("Error al buscar libro: " + e.getMessage());
        }
    }

    public ArrayList<Libro> listadeLibros() {
        try {
            List<Libro> lista = libroJpa.findLibroEntities();
            ArrayList<Libro> ListaLibros = new ArrayList<Libro>(lista);
            return ListaLibros;
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lista de libros: " + e.getMessage());
        }
    }
    
    

    /////////////////////////Editorial//////////////////////////////////////////
    public void CrearEditorial(Editorial editorial) throws Exception {
        try {
            editorialJpa.create(editorial);
        } catch (Exception e) {
            throw new Exception("Error al crear el Editorial: " + e.getMessage());
        }
        
        
    }

    public void EliminarEditorial(Integer id) throws NonexistentEntityException{
        try {
             editorialJpa.destroy(id);
        } catch (Exception e) {
             throw new NonexistentEntityException("Error al eliminar la Editorial: " + e.getMessage());
        }
        
       
    }
    
    public Editorial buscarEditorial(Integer id) {
    try {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID de editorial inválida");
        }
        return editorialJpa.findEditorial(id);
    } catch (Exception e) {
        throw new RuntimeException("Error al buscar editorial: " + e.getMessage());
    }
}
    
    public ArrayList<Editorial> listadeEditorial() {
    try {
        List<Editorial> lista = editorialJpa.findEditorialEntities();
        ArrayList<Editorial> ListaEditorial = new ArrayList<Editorial> (lista);
        return ListaEditorial;
    } catch (Exception e) {
        throw new RuntimeException("Error al obtener la lista de editoriales: " + e.getMessage());
    }
}

    /////////////////////////////Autor//////////////////////////////////////////
    public void CrearAutor(Autor autor) {
        try {
            autorJpa.create(autor);
        } catch (Exception e) {
            throw new RuntimeException("Error al crear el autor: " + e.getMessage());
        }
    }
    
    public void EliminarAutor(Integer ID) throws NonexistentEntityException{
        try {
            autorJpa.destroy(ID);
        } catch (NonexistentEntityException e) {
            throw new NonexistentEntityException("Error al eliminar el autor: " + e.getMessage());
        }
    }
    
    public Autor buscarAutor(Integer id) {
    try {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ID de autor inválida");
        }
        return autorJpa.findAutor(id);
    } catch (Exception e) {
        throw new RuntimeException("Error al buscar autor: " + e.getMessage());
    }
}
    
    public ArrayList<Autor> listadeAutor() {
        try {
            List<Autor> lista = autorJpa.findAutorEntities();
            ArrayList<Autor> ListaAutor = new ArrayList<Autor>(lista);
            return ListaAutor;
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lista de autores: " + e.getMessage());
        }
    }



    
    
    
    
    
}
