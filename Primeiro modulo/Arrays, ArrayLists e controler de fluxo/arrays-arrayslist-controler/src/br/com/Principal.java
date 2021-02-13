package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
      System.out.println("Minhas Tarefas");
      System.out.println("--------------------");
      /* ArrayTarefas tarefas = new ArrayTarefas(4); */
      ListaTarefas tarefas = new ListaTarefas();

      tarefas.adicionarTarefa("Estudar Java");
      tarefas.adicionarTarefa("Estudar MongoDB");
      tarefas.adicionarTarefa("Estudar Node.js");
      tarefas.adicionarTarefa("Estudar Spring não é fácil!");

      tarefas.exibirTarefas();

      tarefas.remover(1);

      System.out.println("Minhas Tarefas após remover");
      System.out.println("--------------------");
      tarefas.exibirTarefas();

      tarefas.buscar("Estudar Node.js").exibirTarefa();
    }
}
