package br.com.tarefas;

public class Tarefa {
  String discricao;
  public Tarefa(String discricao) {
    this.discricao = discricao;
  }

  public void exibirTarefa() {
    System.out.println(this.discricao);
  }

  public int tamanhoTarefa() {
    return this.discricao.length();
  }
}
