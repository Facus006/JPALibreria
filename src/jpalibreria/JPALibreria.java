package jpalibreria;


import Servicio.ServicioEditorial;



public class JPALibreria {

    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       // ControladoraPersistencia JPA = new ControladoraPersistencia();
       //Controladora Con = new Controladora();
       // Autor Autor = new Autor(2, "CARLONCHO", true);
       // Editorial Editorial = new Editorial(1, "Mundo Libro", true);
        //Autor Autor = new Autor(10);
        //Editorial Editorial = new Editorial(9);
       // Libro Libro = new Libro(2003l, "Plantas vs Zombies 3", 2000, 5, 1, 4, true, Autor, Editorial);
        // Con.CrearAutor(Autor);
       //Con.crearEditorial(Editorial);
      //  Con.crearLibro(Libro);
      // Con.EliminarLibro(2003l);
      //Con.CrearAutor(Autor);
      //Con.crearEditorial(Editorial);
     //Con.EliminarEditorial(7);
       // System.out.println(Con.listadeAutor());
     //  ServicioLibro SL = new ServicioLibro();
      // System.out.println(SL.buscarLibroPorTitulo("Plantas vs Zombies 2"));
       // System.out.println(SL.buscarLibrosPorAutor("CARLONCHO"));
        //System.out.println(SL.buscarLibrosPoreEditorial("Mundo Libron"));
        
        ServicioEditorial Menu = new ServicioEditorial();
        Menu.menu();
        
    }
    
}
