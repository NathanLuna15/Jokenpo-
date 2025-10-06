import java.util.Scanner;
import  java.util.Random;

public class Jokenpo {

    String escolhaDoUsuario;
    String EscolhaDoPC;
    String vitoriaOUderrota;
    int jogada;
    int valorComputador;

    public void ObiterDados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("_____________________________________");
        System.out.println("escolha uma opição");
        System.out.println("(1)Pedra");
        System.out.println("(2)Papel");
        System.out.println("(3)Tesoura");
        System.out.println("_____________________________________");
        System.out.print("digite a sua escolha: ");
        jogada = leitor.nextInt();

        RandomDoComputador();
    }

    public void RandomDoComputador(){
        Random rand = new Random();
        valorComputador = rand.nextInt(3 )+ 1;

        EscolhaDoJogador();
    }

    public void EscolhaDoJogador(){
        if (jogada == 1){
            escolhaDoUsuario = "pedra";
        } else if (jogada == 2) {
            escolhaDoUsuario = "papel";
        }
         else {
             escolhaDoUsuario = "tesoura";
        }

         EscolhaDocomputador();
    }

    public void EscolhaDocomputador(){
        if (valorComputador == 1){
            EscolhaDoPC = "pedra";
        } else if (valorComputador == 2) {
            EscolhaDoPC = "papel";
        }
        else {
            EscolhaDoPC = "tesoura";
        }
        ClasificarDados();
    }

    public void ClasificarDados() {

        if (valorComputador == jogada) {
            vitoriaOUderrota = "EMPATE";

        } else if (valorComputador == 1 && jogada == 2) {
            vitoriaOUderrota = "##VOCÊ VENCEU##";

        } else if (valorComputador == 2 && jogada == 3) {
            vitoriaOUderrota = "##VOCÊ VENCEU##";

        } else if (valorComputador == 3 && jogada == 1) {
            vitoriaOUderrota = "##VOCÊ VENCEU##";

        } else if (valorComputador == 1 && jogada ==3) {
            vitoriaOUderrota = "##VOCÊ PERDEU##";

        } else if (valorComputador == 2 && jogada == 1) {
            vitoriaOUderrota = "##VOCÊ PERDEU##";

        } else  {
            vitoriaOUderrota = "##VOCÊ PERDEU##";
        }
        Exibirdadodos();
    }

    public void Exibirdadodos(){
        System.out.println("você escolheu: " + escolhaDoUsuario);
        System.out.println("o computador escolheu: " + EscolhaDoPC);
        System.out.println(vitoriaOUderrota);
    }
}
