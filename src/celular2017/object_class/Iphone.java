package celular2017.object_class;

import celular2017.interfaces.AparelhoTelefonico;
import celular2017.interfaces.NavegarInternet;
import celular2017.interfaces.ReproduzirMusica;

public class Iphone implements ReproduzirMusica, AparelhoTelefonico, NavegarInternet {
    @Override
    public void ligar(String contato) {
        System.out.println("Ligando: " + contato);
    }

    @Override
    public void atender(String contato) {
        System.out.println("Telefone tocando: " + contato);
    }

    @Override
    public void iniciarCorreiodeVoz(String contato) {
        System.out.println("Deixe sua mensagem: " + contato);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("URL: " + url);
    }

    @Override
    public void adcionarNovaAba(int aba) {
        System.out.println(aba);
    }

    @Override
    public void atualizarPagina(String update) {
        System.out.println("Updated url: " + update);
    }

    @Override
    public void trocar(String nome) {
        System.out.println("Trocar musica: " + nome);
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Tocando: " + nome);
    }
}
