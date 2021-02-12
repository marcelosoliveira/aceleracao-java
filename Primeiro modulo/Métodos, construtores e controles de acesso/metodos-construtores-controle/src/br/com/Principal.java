package br.com;

import br.com.tarefas.Tarefa;

public class Principal {
  public static void main(String[] args) {
    System.out.println("Minhas Tarefas");
    System.out.println("-------------------");
    Tarefa tarefa = new Tarefa("Aprender Java");
    tarefa.exibirTarefa();
    System.out.println("A tarefa tem "
      + tarefa.obterTamanhaTarefa() + " caracteres");
  }
}
