public class Fixa extends LinhaTelefonica {
    public static final int FRANQUIA = 30;

    public Fixa(int qtdMinutosGastos, String numero, Cliente cliente) {
        super(qtdMinutosGastos, numero,cliente);
    }

    @Override
    public float calcular(int minutosExcedentes) {
        float valorMinutoExcedente = 0.05f;
        if (minutosExcedentes <= 0) {
            return 0;
        }
        return (minutosExcedentes * valorMinutoExcedente);
    }

    @Override
    public String toString() {
        return "Fixa [numero=" + getNumero() + ", qtdMinutosGastos=" + getQtdMinutosGastos() + ", cliente=" + getCliente().getNome() + "]";
    }
}
