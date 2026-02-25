package Exercicio20;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    public HashMap<String, String> agenda = new HashMap<String, String>();

    public void showAgenda(){
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
	}

    public String adicionaCont(String nome, String numero){
    	if(agenda.containsKey(nome)){	
    		return "Erro: Nome de contato já adicionado.";
    	}
    	if(agenda.containsValue(numero)){	
    		return "Erro: Número já adicionado.";
    	}
    	
        agenda.put(nome, numero);
        return "Contato adicionado!";
    }

    public Agenda(String nome, String numero){
        agenda.put(nome, numero);
    }

    public String buscarNumero(String nome){
        return agenda.get(nome);
    }
}