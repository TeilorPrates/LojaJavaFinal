/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja.view;

import servicos.ClienteServicos;

/**
 *
 * @author 182120011
 */
public class ServicosFactory{

    private static ClienteServicos clienteS = new ClienteServicos();
    

    public static ClienteServicos getClienteServicos() {
        return clienteS;
    }
}

    
