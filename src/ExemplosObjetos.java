public class ExemplosObjetos {
 
      public static void main(String[] args) {
        // Instanciando o objeto pessoa passando dados como argumento
        Pessoa pessoa1 = new Pessoa("João", 25, "Rua 1, nº 123");
        
        // Acessando as propriedades da Pessoa
        System.out.println(pessoa1.getNome()); // João
        System.out.println(pessoa1.getIdade()); // 25
        System.out.println(pessoa1.getEndereco()); // Rua 1, nº 123
        
        // Alterando as propriedades da Pessoa
        pessoa1.setNome("Maria");
        pessoa1.setIdade(30);
        pessoa1.setEndereco("Rua 2, nº 456");
        
        // Chamando o método para imprimir os dados da Pessoa
        pessoa1.imprimirDados(); // Nome: Maria, Idade: 30, Endereço: Rua 2, nº 456
    }
}