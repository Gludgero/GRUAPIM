package Exercicio26;
import java.util.LinkedList;

public class Historico {
    private LinkedList<String> historico;
    private String urlAtual;

    public String getUrlAtual() {
        return urlAtual;
    }

    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }

    public Historico() {
        this.historico = new LinkedList<>();
    }

    public String visitar(String url) {
        historico.add(url);
        setUrlAtual(url);
        return getUrlAtual();
    }

    public String avancar(){
        int index = historico.indexOf(getUrlAtual());
        if (index < historico.size() - 1) {
            setUrlAtual(historico.get(index + 1));
            return getUrlAtual();
        }
        return null;
    }

    public String voltar() {
        int index = historico.indexOf(getUrlAtual());
        if (index > 0) {
            setUrlAtual(historico.get(index - 1));
            return getUrlAtual();
        }
        return null;
    }
}
