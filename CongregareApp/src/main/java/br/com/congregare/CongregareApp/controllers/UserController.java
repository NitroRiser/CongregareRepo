package br.com.congregare.CongregareApp.controllers;

import br.com.congregare.CongregareApp.model.User;
import br.com.congregare.CongregareApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = userService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = userService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/cpf={cpf}")
    public ResponseEntity<User> findByCpf(@PathVariable String cpf){
        User obj = userService.findByCpf(cpf);
        return ResponseEntity.ok().body(obj);
    }
}
