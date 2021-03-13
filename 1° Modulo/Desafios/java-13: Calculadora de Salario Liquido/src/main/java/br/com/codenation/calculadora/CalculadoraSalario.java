package br.com.codenation.calculadora;

public class CalculadoraSalario {

  public long calcularSalarioLiquido(double salarioBase) {
  	double salarioLiquido = 0.00;
	if (salarioBase < 1039.00) {
	  salarioLiquido = 0.00;
	} else if (calcularInss(salarioBase) <= 3000.00) {
  	  salarioLiquido = calcularInss(salarioBase);
	} else if (calcularInss(salarioBase) > 3000.00 && calcularInss(salarioBase) <= 6000.00) {
  	  salarioLiquido = calcularInss(salarioBase) - (calcularInss(salarioBase) * 0.075);
	} else if (calcularInss(salarioBase) > 6000.00) {
	  salarioLiquido = calcularInss(salarioBase) - (calcularInss(salarioBase) * 0.15);
	}
	return Math.round(salarioLiquido);
  }

  private double calcularInss(double salarioBase) {
    double salarioInss;
	if (salarioBase >= 1039.00 && salarioBase <= 1500.00) {
	  salarioInss = salarioBase - (salarioBase * 0.08);
	} else if (salarioBase > 1500.00 && salarioBase <= 4000.00) {
	  salarioInss = salarioBase - (salarioBase * 0.09);
	} else {
	  salarioInss = salarioBase - (salarioBase * 0.11);
	}
	return salarioInss;
  }

}
