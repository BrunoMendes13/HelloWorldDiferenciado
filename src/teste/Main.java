package teste;
import java.util.Scanner;
public class Main {
//O programa poderia ser muito mais simples, mas quis dar uma brincada com um pouquinho de encapsulamento! É apenas uma brincadeira para teste haha!
	public static void main(String[] args) {
		System.out.println("Escolha ''Hello World'' por livre e espontanea vontade! \nEscolha uma mensagem: ");
        System.out.println("\n1.Hello World \n2.Hello World \n3.Hello World");
        String msg = "Hello World";
        Scanner teclado = new Scanner (System.in);
        int opc = teclado.nextInt();
        Bemvindo bemvinda = new Bemvindo();
        switch (opc)
        {
        case 1: bemvinda.setMensagem(msg); bemvinda.exibirMensagem(); break;
        case 2: bemvinda.setMensagem(msg); bemvinda.exibirMensagem(); break;
        case 3: bemvinda.setMensagem(msg); bemvinda.exibirMensagem(); break;
        default: System.out.println("Eu falei para escolher o Hello World, só porque você é marrento tenho uma mensagem para você: \n''Hello World''");
        }

}
}