import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);  // Adiciona o livro na lista
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);  // Adiciona o usuário na lista
        System.out.println("Usuário cadastrado: " + usuario.getNome());
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;  // Retorna o livro se encontrado
            }
        }
        return null;  // Retorna null se não encontrado
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                return usuario;  // Retorna o usuário se encontrado
            }
        }
        return null;  // Retorna null se não encontrado
    }
}
