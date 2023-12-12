package ups.edu.ec.microservice.profesor.servicio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.microservice.profesor.modelo.Profesor;
import ups.edu.ec.microservice.profesor.repositorio.ProfesorRepositorio;

import java.util.List;

@Service
    public class ProfesorServicio {

        @Autowired
        private ProfesorRepositorio profesorRepositorio;
        // Guardar mis Clientes
        public Profesor create(Profesor profesor){
            return profesorRepositorio.save(profesor);
        }

        // Listar mis Clientes
        public List<Profesor> listClientes(){
            return profesorRepositorio.findAll();
        }

    @PersistenceContext
    private EntityManager em;


    public Profesor read(String cedula) {
        Profesor c = em.find(Profesor.class, cedula);
        return c;
    }
}

