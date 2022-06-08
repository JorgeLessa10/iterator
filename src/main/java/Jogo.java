import java.util.Date;

/*
 ** created by: jorge.lessa
 */
public class Jogo {

    private String nome;
    private Double valor;
    private Date dataLancamento;

    public Jogo() {
    }

    public Jogo(String nome, Double valor, Date dataLancamento) {
        this.nome = nome;
        this.valor = valor;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
