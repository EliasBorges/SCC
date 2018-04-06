package br.com.scc.entity;
import java.util.*;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Cobranca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idCobranca;
    
    @NotNull(message = "Informe o numero da parcela")
    private Integer numeroParcela;
    
    @NotNull(message = "Informe a Data da Renegociação")
    @Temporal(TemporalType.DATE)
    private Date dataRenegociacao;
    
    @NotNull(message = "Informe a Data de Vencimento")
    @Temporal(TemporalType.DATE)
    private Date dataVencimento;
    
    @NotNull(message = "Informe o valor dos Juros")
    private Float valorJuros;
    
    @NotNull(message = "Informe o valor da Comissão")
    private Float valorComissao;
    
    @Temporal(TemporalType.DATE)
    private Date dataPagamento;
    
    private Float valorPago;
    
    @ManyToOne
    @JoinColumn(name = "idPessoaJuridicaFuncionario")
    private Funcionario funcionario;
    
    @ManyToOne
    @JoinColumn(name = "idCarta")
    private Carta carta;
    
    public Integer getIdCobranca() {
        return idCobranca;
    }

    public void setIdCobranca(Integer idCobranca) {
        this.idCobranca = idCobranca;
    }

    public Integer getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(Integer numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    public Date getDataRenegociacao() {
        return dataRenegociacao;
    }

    public void setDataRenegociacao(Date dataRenegociacao) {
        this.dataRenegociacao = dataRenegociacao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Float getValorJuros() {
        return valorJuros;
    }

    public void setValorJuros(Float valorJuros) {
        this.valorJuros = valorJuros;
    }
    
    public Float getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(Float valorComissao) {
        this.valorComissao = valorComissao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }
}
