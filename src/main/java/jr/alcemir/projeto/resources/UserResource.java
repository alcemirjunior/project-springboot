package jr.alcemir.projeto.resources;

import jr.alcemir.projeto.entities.User;
import jr.alcemir.projeto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){ //para aceitar como parametro o ID eh necessario colocar @PathVariable
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj); //body eh o corpo da resposta
    }

}
