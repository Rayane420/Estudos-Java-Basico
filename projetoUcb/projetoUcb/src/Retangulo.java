
//deve ser filha de "FiguraGeometrica"
public class Retangulo extends FiguraGeometrica{

    //deve ter os atributos "base" e "altura" para guardar a base e a altura do retângulo
    //Os atributos da classe devem ser declarados como "private"
    private double base;
    private double altura;


    //deve ter um método "getArea",
    // que sobrepõe o método definido na classe "FiguraGeometrica", e que retorna a área do retângulo.
    @Override
    public double getArea(double areaFigura) {
        return 0;
    }

    //deve ter um método "getDescricao", que sobrepõe o método definido na classe "FiguraGeometrica",
    // e que retorna um texto que mostra os valores da base e da altura do retângulo.
    @Override
    public String getDescricao(String descricao) {
        return null;
    }

    //métodos get/set declarados como "public" para acessar os atributos.
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
