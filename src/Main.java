import celular2017.object_class.Iphone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender("Michel");
        iphone.ligar("Michel");
        iphone.iniciarCorreiodeVoz("Michel");


        iphone.exibirPagina("google.com.br");
        iphone.adcionarNovaAba(3);
        iphone.exibirPagina("google.com.br");

        iphone.trocar("Congratualtions - Post Malone");
        iphone.pausar();
        iphone.selecionarMusica("Sunflower - Post Malone");
    }
}