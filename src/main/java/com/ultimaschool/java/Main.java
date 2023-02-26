package com.ultimaschool.java;

import com.ultimaschool.java.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente clienteF = new Cliente("Joana", "Maria", "Rocha","123.456.789-00",
                "10/01/1993", 'F', "joana@mail.com", "Av Brasil",
                "(83) 9999-9999");
        System.out.println(clienteF.toString());

        Cliente clienteM = new Cliente("Rogério", "", "Azevedo","999.888.777-55",
                "10/01/1983", 'M', "rogerio@mail.com", "Av Brasil",
                "(83) 8888-8888");

        System.out.println(clienteM.toString());
    }
}