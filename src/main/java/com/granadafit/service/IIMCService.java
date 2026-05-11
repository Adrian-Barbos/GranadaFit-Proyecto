package com.granadafit.service;

public interface IIMCService {
    double calcularIMC(double peso, double altura);
    String clasificarResultado(double imc);
}