public final class Movel extends LinhaTelefonica {
    private boolean planoDeDadosHabilitado;

    public Movel(int qtdMinutosGastos, String numero, boolean planoDeDadosHabilitado, Cliente cliente) {
        super(qtdMinutosGastos, numero, cliente);
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    // Getter e Setter
    public boolean isPlanoDeDadosHabilitado() {
        return planoDeDadosHabilitado;
    }

    public void setPlanoDeDadosHabilitado(boolean planoDeDadosHabilitado) {
        this.planoDeDadosHabilitado = planoDeDadosHabilitado;
    }

    @Override
    public float calcular(int minutosExcedentes) {
        float valorMinuto = 0.20f;
        float custoPlanoDados = 40.00f;
        float custoTotal = getQtdMinutosGastos() * valorMinuto;
        if (planoDeDadosHabilitado) {
            custoTotal += custoPlanoDados;
        }
        return custoTotal;
    }

    @Override
    public String toString() {
        return "Movel [numero=" + getNumero() + ", qtdMinutosGastos=" + getQtdMinutosGastos() + ", cliente=" + getCliente().getNome() + ", planoDeDadosHabilitado=" + planoDeDadosHabilitado + "]";
    }
}
