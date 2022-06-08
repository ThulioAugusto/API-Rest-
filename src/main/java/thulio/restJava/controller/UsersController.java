package thulio.restJava.controller;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thulio.restJava.repository.UsersRepository;
import thulio.restJava.user.Users;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository repository;
    @GetMapping(path = "/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record ->ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping(path = "/api/usuario/salvar")
    public Users salvar(@RequestBody Users usuario){
        return repository.save(usuario);
    }
}
