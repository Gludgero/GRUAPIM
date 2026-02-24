package Exercicio18;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    public HashMap<String, String> agenda = new HashMap<String, String>();

    public void showAgenda(){
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
	}

    public void adicionaCont(String nome, String numero){
        agenda.put(nome, numero);
    }

    public Agenda(String nome, String numero){
        agenda.put(nome, numero);
    }

    public String buscarNumero(String nome){
        return agenda.get(nome);
    }
}