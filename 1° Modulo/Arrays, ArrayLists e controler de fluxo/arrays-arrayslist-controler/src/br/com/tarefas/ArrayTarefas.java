package br.com.tarefas;

public class ArrayTarefas {
  Tarefa[] tarefas;
  int contador = 0;

  public ArrayTarefas(int tamanho) {
    this.tarefas = new Tarefa[tamanho] ;
  }

  public void adicionarTarefa(Tarefa tarefa) {
    this.tarefas[this.contador] = tarefa;
    this.contador++;
  }

  public void removerTarefa(int posicao) {
    this.tarefas[posicao] = null;
  }

  public void exibirTarefas() {
      for (Tarefa tarefa : this.tarefas) {
        tarefa.exibirTarefa();
      }
  }
}
