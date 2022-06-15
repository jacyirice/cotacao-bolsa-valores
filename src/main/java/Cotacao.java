import java.time.LocalDate;

public class Cotacao {
    private String codEmpresa;
    private String moeda = "R$";
    private double preco;
    private LocalDate data = LocalDate.now();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cotacao{");
        sb.append("codEmpresa='").append(codEmpresa).append('\'');
        sb.append(", moeda='").append(moeda).append('\'');
        sb.append(", preco=").append(preco);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

    public Cotacao() {
        this.codEmpresa = "";
    }

    public Cotacao(String codEmpresa, double preco) {
        this.codEmpresa = codEmpresa;
        this.preco = preco;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
