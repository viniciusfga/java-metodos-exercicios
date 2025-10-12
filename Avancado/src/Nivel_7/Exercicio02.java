package Nivel_7;

import java.util.List;

public class Exercicio02 {
    /*
    Desenvolver um método que receba uma lista de objetos da classe Produto e retorne o produto mais caro.
     */
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        String getNome() {
            return nome;
        }
        double getPreco() {
            return preco;
        }


    }

    public static Produto produtoMaisCaro(List<Produto> produtos) {
        if (produtos == null || produtos.isEmpty()) {
            return null; // ou lançar exceção
        }

        Produto maisCaro = produtos.get(0);
        for (Produto p : produtos) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    public static void main(String[] args) {
        List<Produto> lista = List.of(
                new Produto("Mouse", 80.0),
                new Produto("Teclado", 150.0),
                new Produto("Monitor", 900.0),
                new Produto("Headset", 200.0)
        );

        Produto caro = produtoMaisCaro(lista);
        System.out.println("Produto mais caro: " + caro.getNome() + " - R$ " + caro.getPreco());
    }
}
