package listaPessoas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Executavel {
	public static void main(String[] args) {
		 ListaPessoas listaPessoas = new ListaPessoas();

	        int resposta = JOptionPane.YES_OPTION;

	        while (resposta == JOptionPane.YES_OPTION) {
	            String nome = JOptionPane.showInputDialog(null, "Informe o nome da pessoa:");
	            String dataNascimentoStr = JOptionPane.showInputDialog(null, "Informe a data de nascimento da pessoa (ddmmaaaa):");

	            LocalDate dataNascimento = null;
	            try {
	                // tenta formatar a string sem as barras
	                dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("ddMMyyyy"));
	            } catch (DateTimeParseException e) {
	                // se não conseguir, tenta formatar a string com as barras
	                dataNascimento = LocalDate.parse(dataNascimentoStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	            }

	            // calculando a idade a partir da data de nascimento
	            int idade = Period.between(dataNascimento, LocalDate.now()).getYears();

	            Pessoa pessoa = new Pessoa(nome, idade);
	            listaPessoas.adicionarPessoa(pessoa);

	            resposta = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra pessoa?");
	        }

	        listaPessoas.exibirLista();
	    }
	}
