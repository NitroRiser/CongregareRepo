package br.com.congregare.CongregareApp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String cpf;
    private String rg;
    private String phone;
    private String email;
    private String motherName;
    private String fatherName;

    public User(String name, Integer age, String cpf, String rg, String phone, String email, String motherName, String fatherName) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.email = email;
        this.motherName = motherName;
        this.fatherName = fatherName;
    }
}
