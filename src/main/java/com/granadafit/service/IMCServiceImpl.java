package com.granadafit.service;

import com.granadafit.exception.DatoIncorrectoIMC;
import org.springframework.stereotype.Service;

@Service
public class IMCServiceImpl implements IIMCService {

    @Override
    public double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 1) {
            throw new DatoIncorrectoIMC("El peso y la altura deben ser valores lógicos.");
        }
        return peso / (altura * altura);
    }

    @Override
    public String clasificarResultado(double imc) {
        if (imc < 18.5) return "Bajo peso";
        if (imc < 25) return "Peso normal";
        if (imc < 30) return "Sobrepeso";
        return "Obesidad";
    }
}