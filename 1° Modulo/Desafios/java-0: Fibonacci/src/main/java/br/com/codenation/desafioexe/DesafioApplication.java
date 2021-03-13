package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
  public static List<Integer> fibonacci() {
	ArrayList<Integer> fibonacci = new ArrayList<>();
	int maxFibonacci = 350;
    for (int index = 0; index <= maxFibonacci; index++) {
	  if (index < 3) {
	    fibonacci.add(index == 2 ? index - 1 : index);
	  } else {
	    fibonacci.add(fibonacci.get(index - 1) + fibonacci.get(index - 2));
	    if (fibonacci.get(index) > 350) break;
	  }
    }
    return fibonacci;
  }

  public static Boolean isFibonacci(Integer a) {
    for (int number : fibonacci()) {
	  if (a.equals(number)) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(fibonacci());
    System.out.println(isFibonacci(8));
  }
}
