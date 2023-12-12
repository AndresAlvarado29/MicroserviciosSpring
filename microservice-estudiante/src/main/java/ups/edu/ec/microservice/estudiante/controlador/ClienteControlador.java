package ups.edu.ec.microservice.estudiante.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ups.edu.ec.microservice.estudiante.modelo.Cliente;
import ups.edu.ec.microservice.estudiante.servicio.ClienteServicio;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/microservice/cliente")
public class ClienteControlador {
    @Autowired // es similar al inject
    public ClienteServicio clienteServicio;

    // Para consumir el Guardar Clientes desde Postman o FronEnd
    @PostMapping("/guardar")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        Cliente t= clienteServicio.create(cliente);

        try {
            return ResponseEntity.created(new URI("/microservicio/cliente/guardar"+t.getCedula())).body(t);
        }
        catch (Exception ex)
        {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    //Para Consumir la lista de Clientes
    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> listAll(){
        return ResponseEntity.ok(clienteServicio.listClientes());
    }
}
