package projetoLPII;

public class Player { 		// Classe que guarda o nick e os pontos do jogador
	private String nickname;
	private int pontos = 0;

	public Player(String nickname) {
		this.nickname = nickname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getPontos() {
		return pontos;
	}
	public void aumentarPontos(int pontos) {
		this.pontos = this.pontos + pontos;
	}
	public void diminuirPontos(int pontos) {
		this.pontos = this.pontos - pontos;
	}
}