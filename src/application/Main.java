package application;

import model.entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone7 = new Iphone();

        iphone7.adicionarNovaAba();
        iphone7.atualizarPagina();
        iphone7.exibirPagina();
        iphone7.atender();
        iphone7.ligar();
        iphone7.iniciarCorreioVoz();
        iphone7.selecionarMusica();
        iphone7.tocar();
        iphone7.pausar();

    }
}
