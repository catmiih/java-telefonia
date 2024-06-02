public abstract class LinhaTelefonica implements Consumo {
    private int qtdMinutosGastos;
    private String numero;
    private Cliente cliente;

    public LinhaTelefonica(int qtdMinutosGastos, String numero, Cliente cliente) {
        if (qtdMinutosGastos < 0) {
            throw new IllegalArgumentException("Quantidade de minutos gastos não pode ser negativa");
        }
        this.qtdMinutosGastos = qtdMinutosGastos;
        this.numero = numero;
        this.cliente = cliente;
    }

    // Getters e Setters
    public int getQtdMinutosGastos() {
        return qtdMinutosGastos;
    }

    public void setQtdMinutosGastos(int qtdMinutosGastos) {
        if (qtdMinutosGastos < 0) {
            throw new IllegalArgumentException("Quantidade de minutos gastos não pode ser negativa");
        }
        this.qtdMinutosGastos = qtdMinutosGastos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public abstract float calcular(int minutosExcedentes);

    @Override
    public String toString() {
        return "LinhaTelefonica [numero=" + numero + ", qtdMinutosGastos=" + qtdMinutosGastos + ", cliente=" + cliente.getNome() + "]";
    }
}
