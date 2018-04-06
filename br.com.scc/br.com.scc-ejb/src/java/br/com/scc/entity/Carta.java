package br.com.scc.entity;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idCarta;
    
    @NotNull(message = "Informe o valor da Carta")
    private Float valorCarta;
    
    @NotNull(message = "Informe a descrição")
    @Size(max = 80, message = "Descrição deve ter até 80 caracteres")
    private String descricao;
    
    @NotNull(message = "Informe a Data de Vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @NotNull(message = "Informe a quantidade")
    private Integer quantidade;
    
    @ManyToOne
    @JoinColumn(name = "idPessoaJuridica")
    private PessoaJuridica pessoaJuridica;
    
    @ManyToOne
    @JoinColumn(name = "idStatus")
    private Status status;
    
    @ManyToMany
    @JoinTable(name = "PessoaFisicaCarta",
            joinColumns = @JoinColumn (name = "idPessoaFisica"),
            inverseJoinColumns = @JoinColumn (name = "idCarta"))
    private List<PessoaFisica> pessoasFisicas;


    public Integer getIdCarta() {
        return idCarta;
    }

    public void setIdCarta(Integer idCarta) {
        this.idCarta = idCarta;
    }

    public Float getValorCarta() {
        return valorCarta;
    }

    public void setValorCarta(Float valorCarta) {
        this.valorCarta = valorCarta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
