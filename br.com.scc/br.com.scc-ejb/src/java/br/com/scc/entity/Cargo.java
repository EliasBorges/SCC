package br.com.scc.entity;

import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Short idCargo;
    
    @NotNull(message = "Informe o nome do cargo")
    @Size(max = 80, message = "Nome do cargo deve ter até 80 caracteres")
    private String nomeCargo;
    
    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionario;

    public Short getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Short idCargo) {
        this.idCargo = idCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public List<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
}
