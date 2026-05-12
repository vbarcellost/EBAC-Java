public class Main {

    public static void main(String[] args) {

        Class<Usuario> classe = Usuario.class;

        if (classe.isAnnotationPresent(Tabela.class)) {

            Tabela tabela = classe.getAnnotation(Tabela.class);

            ObjetoTabela objeto = new ObjetoTabela(tabela.value());
            
            System.out.println("Nome da tabela: " + tabela.value());
        }
    }
}
