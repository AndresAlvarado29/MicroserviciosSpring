package ups.edu.ec.microservice.estudiante.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import ups.edu.ec.microservice.estudiante.modelo.Cliente;
import ups.edu.ec.microservice.estudiante.servicio.ClienteServicio;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/ms/estudiante")
public class ClienteControlador {
    @Autowired // es similar al inject
    public ClienteServicio clienteServicio;

    // Para consumir el Guardar Clientes desde Postman o FronEnd
    @PostMapping("/crear")
    public ResponseEntity<Object> guardarCliente(@RequestBody Cliente cliente) {
        try {
            clienteServicio.create(cliente);
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            Error error = new Error();
            return ResponseEntity.status(HttpStatus.OK).body(error);
        }
    }

    //Para Consumir la lista de Clientes
    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> listAll(){
        return ResponseEntity.ok(clienteServicio.listClientes());
    }






}
