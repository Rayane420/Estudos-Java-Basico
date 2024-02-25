package src.main.java.classeAnonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class MainProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Smartwatch", 1.500));
        produtos.add(new Produto("Notebook", 10.000));
        produtos.add(new Produto("Tablet", 10.000));
        produtos.add(new Produto("Celular", 15.000));

        //Gerando classe anônima do comparator para realizar a comparação entre valores
        Comparator<Produto> compareProduto = new Comparator<Produto>() {
            @Override
            public int compare(Produto produto1, Produto produto2) {
                return produto1.toString().toUpperCase(Locale.ROOT).compareTo(produto2.toString().toUpperCase());
            }
        };

        produtos.sort(compareProduto);

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

    }
}
