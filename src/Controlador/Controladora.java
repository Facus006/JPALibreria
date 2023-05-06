package Controlador;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;


public class Controladora {

    ControladoraPersistencia JPA = new ControladoraPersistencia();
    ////////////////////////////Libros//////////////////////////////////////////
    public void crearLibro(Libro libro) throws Exception {
        JPA.CrearLibro(libro);
    }

    public void EliminarLibro(Long id) throws NonexistentEntityException {
        JPA.eliminarLibro(id);
    }
    
    public Libro buscarLibro(long id){
       return JPA.buscarLibro(id);
    }
    
     public ArrayList<Libro> listadeLibros(){
         return JPA.listadeLibros();
     }
    //////////////////////////////Editorial/////////////////////////////////////
    public void crearEditorial(Editorial editorial) throws Exception {
        JPA.CrearEditorial(editorial);
    }
    
    public void EliminarEditorial(Integer id) throws NonexistentEntityException{
        JPA.EliminarEditorial(id);
    }

    public Editorial buscarEditorial(Integer id){
        return JPA.buscarEditorial(id);
    }
    
    public ArrayList<Editorial> listadeEditorial(){
        return JPA.listadeEditorial();
    }
    //////////////////////////////Autor/////////////////////////////////////////
    public void CrearAutor(Autor autor) {
        JPA.CrearAutor(autor);
    }
    
    public void EliminarAutor(Integer id) throws NonexistentEntityException{
        JPA.EliminarAutor(id);
    }
    
    public Autor buscarAutor(Integer id){
        return JPA.buscarAutor(id);
    }
    
     public ArrayList<Autor> listadeAutor(){
         return JPA.listadeAutor();
     }
    
    


}
