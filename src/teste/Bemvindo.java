package teste;

public class Bemvindo {
  private String mensagem;

public String getMensagem() {
	return mensagem;
}

public void setMensagem(String mensagem) {
	this.mensagem = mensagem;
}
public void exibirMensagem()
{
	System.out.println("Bem-Vindo meu querido(a), essa mensagem é para todos os programadores: "+this.getMensagem());
}
  
}
