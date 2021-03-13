package com.challenge.desafio;

import com.challenge.annotation.Somar;
import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculadorDeClasses implements Calculavel {

    @Override
    public BigDecimal somar(Object object) throws IllegalAccessException {
       return calcularClasses(object, Somar.class);
    }

    @Override
    public BigDecimal subtrair(Object object) throws IllegalAccessException {
        return calcularClasses(object, Subtrair.class);
    }

    @Override
    public BigDecimal totalizar(Object object) throws IllegalAccessException {
        return somar(object).subtract(subtrair(object));
    }

    private BigDecimal calcularClasses(Object object, Class<? extends Annotation> params) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        BigDecimal result = new BigDecimal(0);
            for (Field field : fields) {
                if (field.getType().getName().contains("BigDecimal")) {
                    field.setAccessible(true);
                    if (field.getAnnotation(params) != null) {
                        if (!field.getType().getName().contains("BigDecimal")
                            || field.toString().isEmpty()) {
                            return BigDecimal.ZERO;
                        }
                        result = result.add((BigDecimal) field.get(object));
                        }
                    }
                }
        return result;
    }
}
