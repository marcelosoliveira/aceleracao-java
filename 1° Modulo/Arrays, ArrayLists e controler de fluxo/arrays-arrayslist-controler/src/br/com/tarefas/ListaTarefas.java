package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
  ArrayList<Tarefa> tarefas = new ArrayList<>();

  public void adicionarTarefa(Tarefa tarefa) {
    if (tarefa != null && tarefa.tamanhoTarefa() <= 20) {
      this.tarefas.add(tarefa);
    } else {
      System.out.println("A tarefa é inválida");
    }
  }

  public void adicionarTarefa(String discricao) {
    Tarefa tarefa = new Tarefa(discricao);
    adicionarTarefa(tarefa);
  }

  public void remover(int posicao) {
    if (posicao < this.tarefas.size()) {
      this.tarefas.remove(posicao);
    } else {
      System.out.println("A tarefa não existe");
    }
  }

  public Tarefa buscar(String discricao) {
    for (Tarefa tarefa : this.tarefas) {
      if(discricao.equals(tarefa.discricao)) {
        return tarefa;
      }
    }
    System.out.println("Tarefa não encontrada!");
    return null;
  }

  public void exibirTarefas() {
    for (Tarefa tarefa : this.tarefas) {
      tarefa.exibirTarefa();
    }
  }
}
