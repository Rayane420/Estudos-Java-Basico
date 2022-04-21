
//classe declarada como "abstract"
public abstract class FiguraGeometrica {

    //atributo "nome" para guardar o nome da figura geométrica
    //atributo "nome" declarado como "private"
    private String nome;

    //método "getArea", que retorna um valor do tipo "double" correspondente à área da figura geométrica.
    //declarado como abstract
    public abstract double getArea(double areaFigura);

    //método "getDescricao", que retorna um valor do tipo "String"
    //método declarado como "abstract"
    public abstract String getDescricao(String descricao);


    //métodos get/set declarados como "public" para acessar o atributo nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
