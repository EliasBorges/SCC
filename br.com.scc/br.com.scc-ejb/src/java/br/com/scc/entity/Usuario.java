package br.com.scc.entity;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Short idUsuario;
    
    @NotNull(message = "Informe o email")
    @Size(max = 80, message = "Email deve ter até 80 caracteres")
    private String email;
        
    @NotNull(message = "Informe a senha")
    @Size(max = 20, message = "Senha deve ter até 20 caracteres")
    private String senha;
    
    @OneToMany(mappedBy = "usuario")
    private List<Funcionario> funcionarios;

    public Short getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Short idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
