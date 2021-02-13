package br.com;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = scan.nextLine();
    System.out.println("Hello " + nome);
  }
}
