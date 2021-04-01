package com.demo.saudacao;

import modulo.com.goodbye.GoodBye;
import modulo.com.helloworld.HelloWorld;

public class SaudacaoDemo {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        GoodBye good = new GoodBye();

        hello.diga();
        good.diga();
    }
}
