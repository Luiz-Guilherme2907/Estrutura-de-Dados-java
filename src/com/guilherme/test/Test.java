package com.guilherme.test;

import com.guilherme.Vetor;

public class Test {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adicionaElementosNoVetorGuardandoPosição("elemento numero 1");
        vetor.adicionaElementosNoVetorGuardandoPosição("elemento numero 2");
        vetor.adicionaElementosNoVetorGuardandoPosição("elemento numero 3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
    }


}