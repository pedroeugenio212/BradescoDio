package edu.pedro.dio.trilha_java_basico.desafio_iphone;

public class Main
{

    public static void main(String[] args)
    {
	IPhone meuIPhone = new IPhone();

	meuIPhone.selecionarMusica("Imagine - John Lennon");
	meuIPhone.tocar();
	meuIPhone.pausar();

	meuIPhone.ligar("(11) 99999-9999");
	meuIPhone.atender();
	meuIPhone.iniciarCorreioVoz();

	meuIPhone.exibirPagina("https://www.apple.com");
	meuIPhone.adicionarNovaAba();
	meuIPhone.atualizarPagina();
    }
}
