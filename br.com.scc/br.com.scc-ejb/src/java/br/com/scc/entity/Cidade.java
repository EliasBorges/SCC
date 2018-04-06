package br.com.scc.entity;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idCidade;
    
    @NotNull(message = "Informe o nome da cidade")
    @Size(max = 80, message = "Nome da cidade deve ter até 80 caracteres")
    private String nomeCidade;
    
    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    
    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecos;

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
