import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        // Adicionar livros e usuários de exemplo (inicialmente)
        biblioteca.adicionarLivro(new Livro("O Hobbit", "J.R.R. Tolkien"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarUsuario(new Usuario("Alice"));
        biblioteca.adicionarUsuario(new Usuario("Luiz"));

        // Menu interativo
        while (true) {
            System.out.println("1 - Alugar livro");
            System.out.println("2 - Devolver livro");
            System.out.println("3 - Cadastrar novo usuário");
            System.out.println("4 - Cadastrar novo livro");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha após o número

            if (opcao == 1) {
                // Alugar livro
                System.out.println("Digite o nome do usuário: ");
                String nomeUsuario = sc.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    System.out.println("Digite o nome do livro: ");
                    String tituloLivro = sc.nextLine();
                    Livro livro = biblioteca.buscarLivro(tituloLivro);

                    if (livro != null) {
                        usuario.alugarLivro(livro);
                    } else {
                        System.out.println("Livro indisponível!");
                    }
                } else {
                    System.out.println("Usuário não encontrado!");
                }

            } else if (opcao == 2) {
                // Devolver livro
                System.out.println("Digite o nome do usuário: ");
                String nomeUsuario = sc.nextLine();
                Usuario usuario = biblioteca.buscarUsuario(nomeUsuario);

                if (usuario != null) {
                    usuario.devolverLivro();
                } else {
                    System.out.println("Usuário não encontrado!");
                }

            } else if (opcao == 3) {
                // Cadastrar novo usuário
                System.out.println("Digite o nome do novo usuário: ");
                String nomeUsuario = sc.nextLine();
                Usuario novoUsuario = new Usuario(nomeUsuario);  // Criando um novo usuário
                biblioteca.adicionarUsuario(novoUsuario);  // Adicionando ao sistema
                System.out.println("Usuário " + nomeUsuario + " cadastrado com sucesso!");

            } else if (opcao == 4) {
                // Cadastrar novo livro
                System.out.println("Digite o título do livro: ");
                String tituloLivro = sc.nextLine();
                System.out.println("Digite o autor do livro: ");
                String autorLivro = sc.nextLine();
                Livro novoLivro = new Livro(tituloLivro, autorLivro);  // Criando um novo livro
                biblioteca.adicionarLivro(novoLivro);  // Adicionando o livro à biblioteca
                System.out.println("Livro \"" + tituloLivro + "\" cadastrado com sucesso!");

            } else if (opcao == 5) {
                // Sair
                System.out.println("Saindo...");
                break;  // Encerra o loop e o programa

            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();  // Fechar o scanner após o uso
    }
}
