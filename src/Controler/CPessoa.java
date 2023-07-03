/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import com.sun.security.ntlm.Client;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 182120011
 */
public class CPessoa {
     ArrayList<Cliente> cliente = new ArrayList<>();
    int idCliente = 1;
    
    /**
     * Autoincrement idPessoa
     * @return 
     */
    public int geraID(){
        return this.idCliente++;
    }

    /**
     * Método addPessoa adiciona Pessoa no ArrayList pessoas
     *
     * @param p
     */
    public void addCliente(Cliente c) {
        this.cliente.add(c);
    }

    /**
     * Método removePessoa remove Pessoa do ArrayList pessoas
     *
     * @param pes
     */
    public void removeCliente(Cliente pes) {
        this.cliente.remove(pes);
    }

    public ArrayList<Cliente> getCliente() {
        return this.cliente;
    }

    /**
     * Método getPessoaCPF retorna uma Pessoa caso encontre 
     * correspondência no CPF do ArrayList pessoas, caso contrário
     * retorna null.
     * @param CPF
     * @return 
     */
    public Cliente getClienteCPF(String CPF) {
        Cliente c = null;
        for (Cliente pes : cliente) {
            if (pes.getCpf().equals(CPF)) {
                c = pes;
                break;
            }
        }//fim foreach
        return c;
    }
    
    public void mockPessoas(){
        Cliente p1 = new Cliente();
        p1.setIdCliente(geraID());
        p1.setCpf("30668518006");
        p1.setNome("Juvenal das Candongas");
        p1.setTelefone("51999889988");
        p1.setEndereco("Rua das Margaridas");
        addCliente(p1);
        Cliente p2 = new Cliente();
        p2.setIdCliente(geraID());
        p2.setCpf("85606196077");
        p2.setNome("Madalena Espirito Santo");
        p2.setTelefone("51988998899");
        p2.setEndereco("Rua sem saída");
        addCliente(p2);
        
    }
        public static void main(String[] args){
        }
}
