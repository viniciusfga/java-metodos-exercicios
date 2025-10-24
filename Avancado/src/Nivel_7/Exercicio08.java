package Nivel_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercicio08 {
    /*
    'Criar um método que leia dados de um arquivo .txt e retorne seu conteúdo como uma lista de strings.'
     */
    public  static List<String> lerArquivo(String caminhoArquivo) {
        try {
            return Files.readAllLines(Path.of(caminhoArquivo));
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return List.of();
        }
    }
    public static void main(String[] args) {

        String caminho = "Avancado/src/Nivel_7/dados.txt";

        List<String> lines = lerArquivo(caminho);

        for (String line : lines) {
            System.out.println(line);
        }

    }
}
