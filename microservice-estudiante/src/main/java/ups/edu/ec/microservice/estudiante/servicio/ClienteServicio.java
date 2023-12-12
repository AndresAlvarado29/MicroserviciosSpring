package ups.edu.ec.microservice.estudiante.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.microservice.estudiante.modelo.Cliente;
import ups.edu.ec.microservice.estudiante.repositorio.ClienteRepositorio;

import java.util.List;

@Service
    public class ClienteServicio {

        @Autowired
        private ClienteRepositorio clienteRepositorio;
        // Guardar mis Clientes
        public Cliente create(Cliente cliente){
            return clienteRepositorio.save(cliente);
        }

        // Listar mis Clientes
        public List<Cliente> listClientes(){
            return clienteRepositorio.findAll();
        }
    }

