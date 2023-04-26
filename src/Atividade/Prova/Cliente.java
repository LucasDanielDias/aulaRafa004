package Atividade.Prova;

public class Cliente {
    public String Nome;

    public Cliente(String nome) {
        Nome = nome;
    }//Estou gerando construtores pois assim para mim fica mais facil gerenciar os atributos na classe main.

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }//criação dos atributos e seus get e sets
}
