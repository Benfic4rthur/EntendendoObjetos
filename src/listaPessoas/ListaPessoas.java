package listaPessoas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ListaPessoas {
    private List<Pessoa> pessoas;

    public ListaPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void exibirLista() {
        StringBuilder lista = new StringBuilder();

        for (Pessoa pessoa : pessoas) {
            lista.append("Nome: ").append(pessoa.getNome()).append("\n")
                .append("Idade: ").append(pessoa.getIdade()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString(), "Lista de Pessoas", JOptionPane.INFORMATION_MESSAGE);
    }
}
