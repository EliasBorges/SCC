package br.com.scc.entity;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idEstado;
    
    @NotNull(message = "Informe o nome do estado")
    @Size(max = 80, message = "Nome do estado deve ter até 80 caracteres")
    private String nomeEstado;
    
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades;

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
}
