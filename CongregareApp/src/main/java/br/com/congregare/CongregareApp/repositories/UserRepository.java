package br.com.congregare.CongregareApp.repositories;

import br.com.congregare.CongregareApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByCpf(String cpf);
}
