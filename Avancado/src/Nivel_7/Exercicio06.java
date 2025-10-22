package Nivel_7;

import java.util.Scanner;

public class Exercicio06 {
    /*
    Criar um método que simule um sistema de login verificando usuário e senha em um banco de dados fictício (array ou lista).
     */
    public static boolean isLogin (String nome, String senha){

        // Banco de dados fictício
        String[] usuarios = {"admin", "vinicius", "aluno"};
        String[] senhas = {"1234", "senha123", "ifgoiano"};

        // Verifica se o nome e a senha correspondem
        for (int i = 0; i < usuarios.length; i++){
            for (int j = 0; j < senhas.length; j++){
                if (usuarios[i].equals(nome) && senhas[j].equals(senha)){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean executando = true;
        int tentativas = 0;

        while(executando){
            if(tentativas == 3){
                System.out.println("Números máximo de tentativas");
                executando = false;
            }
            System.out.println("Digite o nome de usuário: ");
            String nome = sc.nextLine();
            System.out.println("Digite a senha: ");
            String senha = sc.nextLine();
            if(isLogin(nome, senha)){
                System.out.println("Acesso permitido");
                executando = false;
            } else {
                System.out.println("Acesso negado");
            }
            tentativas++;
        }
    }
}
