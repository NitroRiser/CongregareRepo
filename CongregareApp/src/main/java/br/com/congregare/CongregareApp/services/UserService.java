package br.com.congregare.CongregareApp.services;

import br.com.congregare.CongregareApp.model.User;
import br.com.congregare.CongregareApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(IllegalArgumentException::new);
    }

    public User findByCpf(String cpf){
        return userRepository.findByCpf(cpf);
    }
}
