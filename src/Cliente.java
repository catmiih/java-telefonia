import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String endereco;
    private List<LinhaTelefonica> linhasTelefonicas;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.linhasTelefonicas = new ArrayList<>();
    }

    public void adicionarLinhaTelefonica(LinhaTelefonica linhaTelefonica) {
        linhasTelefonicas.add(linhaTelefonica);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<LinhaTelefonica> getLinhasTelefonicas() {
        return linhasTelefonicas;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", endereco=" + endereco + ", linhasTelefonicas=" + linhasTelefonicas + "]";
    }
}
