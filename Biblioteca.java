import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public biblioteca() {
        livro = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUSuarios() {
        return usuarios;
    }

    public void setUsuarios(Arraylist<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livros> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro) {
        livro.add(livro);
        System.out.println("Livro adicionando: " + livro.getTitulo());
    }

    public void adicionarUsuarios(Usuario usuario) {
        usuario.add(usuario);
        System.out,println("Usuário cadastrado: " + usuario.getNome());
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro: livros){
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }

        return null;
    }

    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario: usuarios) {
            if (usuarios.getNome().equals(nome)) {
                return usuarios;
            }
        }
        return null;
    }
}
