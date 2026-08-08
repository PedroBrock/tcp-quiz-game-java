package projetoLPII;

public class Quiz { // Classe que exibe as perguntas e trata as respostas, e no final exibe a pontuacao do jogador
	
	public static String resultadoFinal(Player player) {
		String resultado = "Jogador " + player.getNickname() + " teve pontuação de " + player.getPontos() + " pontos!!!";
		return resultado;
	}
	public static String recorde(Player player, int recorde) {
		String resultado = "Recorde desse jogador é de " + recorde + " pontos!!!";
		return resultado;
	}
	public static String perguntaFacil1(Player player) {
		String pergunta = "Como fazer comentários em Java? (Pergunta nível fácil)\n"
				+ "[1] /*\n[2] */\n[3] \\\n[4] #\n[5] //\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String resposta1(String fromClient, Player player){
		String enviar;
		if (fromClient.equals("5")) {
			enviar = "Resposta correta, ganhou 10 pontos!\n\n------------------------------------------------------------------";
			player.aumentarPontos(10);
			return enviar;
		}else if(fromClient.equals("1")|fromClient.equals("2")|fromClient.equals("3")|fromClient.equals("4")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 2 e 4 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
}
	public static String dicaResposta1(String fromClient, Player player){
		String enviar;
			if(fromClient.equals("5")) {
			 	enviar = "Resposta correta, ganhou 5 pontos!\n\n------------------------------------------------------------------";
			 	player.aumentarPontos(5);
			 	return enviar;
			}else if(fromClient.equals("1")|fromClient.equals("2")|fromClient.equals("3")|fromClient.equals("4")){
				enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
				} else {
					enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
					player.diminuirPontos(10);
					return enviar;
				}
}
	public static String perguntaFacil2(Player player) {
		String pergunta = "Qual método é usado para saber o tamanho de uma string? (Pergunta nível fácil)\n"
				+ "[1] length()\n[2] getSize()\n[3] len()\n[4] getLength()\n[5] size()\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String resposta2(String fromClient, Player player){
		String enviar;
		if (fromClient.equals("1")) {
			enviar = "Resposta correta, ganhou 10 pontos!\n\n------------------------------------------------------------------";
			player.aumentarPontos(10);
			return enviar;
		}else if(fromClient.equals("5")|fromClient.equals("2")|fromClient.equals("3")|fromClient.equals("4")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 3 e 5 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
	}
	public static String dicaResposta2(String fromClient, Player player){
		String enviar;
			if(fromClient.equals("1")) {
			 	enviar = "Resposta correta, ganhou 5 pontos!\n\n------------------------------------------------------------------";
			 	player.aumentarPontos(5);
			 	return enviar;
			}else if(fromClient.equals("5")|fromClient.equals("2")|fromClient.equals("3")|fromClient.equals("4")){
				enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
				} else {
					enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
					player.diminuirPontos(10);
					return enviar;
				} 
}
	public static String perguntaFacil3(Player player) {
		String pergunta = "Qual método é usado para retornar uma string com caracteres maiúsculos? (Pergunta nível fácil)\n"
				+ "[1] tuc()\n[2] toUpperCase()\n[3] touppercase()\n[4] upperCase()\n[5] uppercase()\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String resposta3(String fromClient, Player player){
		String enviar;
		if (fromClient.equals("2")) {
			enviar = "Resposta correta, ganhou 10 pontos!\n\n------------------------------------------------------------------";
			player.aumentarPontos(10);
			return enviar;
		}else if(fromClient.equals("5")|fromClient.equals("1")|fromClient.equals("3")|fromClient.equals("4")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 1 e 5 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
	}
	public static String dicaResposta3(String fromClient, Player player){
		String enviar;
			if(fromClient.equals("2")) {
			 	enviar = "Resposta correta, ganhou 5 pontos!\n\n------------------------------------------------------------------";
			 	player.aumentarPontos(5);
			 	return enviar;
			}else if(fromClient.equals("1")|fromClient.equals("5")|fromClient.equals("3")|fromClient.equals("4")){
				enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
				} else {
					enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
					player.diminuirPontos(10);
					return enviar;
				} 
}

	public static String perguntaMedia1(Player player) {
		String pergunta = "Qual método é usado para retornar uma string com caracteres maiúsculos? (Pergunta nível fácil)\n"
				+ "[1] Bill Gates\n[2] James Gosling\n[3] Steve Jobs\n[4] Elon Musk\n[5] Jeff Bezos\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String respostaMedia1(String fromClient, Player player){
		String enviar;
		if (fromClient.equals("2")) {
			enviar = "Resposta correta, ganhou 20 pontos!\n\n------------------------------------------------------------------";
			player.aumentarPontos(20);
			return enviar;
		}else if(fromClient.equals("5")|fromClient.equals("1")|fromClient.equals("3")|fromClient.equals("4")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 1 e 4 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
	}
	public static String dicaRespostaMedia1(String fromClient, Player player){
	    String enviar;
	        if(fromClient.equals("2")) {
	            enviar = "Resposta correta, ganhou 10 pontos!\n\n------------------------------------------------------------------";
	            player.aumentarPontos(10); 
	            return enviar;
	        }else if(fromClient.equals("1")|fromClient.equals("5")|fromClient.equals("3")|fromClient.equals("4")){
	            enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
	            player.diminuirPontos(10);
	            return enviar;
	            } else {
	                enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
	                player.diminuirPontos(10);
	                return enviar;
	            } 
}
	public static String perguntaMedia2(Player player) {
		String pergunta = "Qual empresa é dona do Java? (Pergunta nível Média)\n"
				+ "[1] Meta\n[2] Sun\n[3] Amazon\n[4] Oracle Corporation\n[5] Time Warner\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String respostaMedia2(String fromClient, Player player){
		String enviar;
		if (fromClient.equals("4")) {
			enviar = "Resposta correta, ganhou 20 pontos!\n\n------------------------------------------------------------------";
			player.aumentarPontos(20);
			return enviar;
		}else if(fromClient.equals("5")|fromClient.equals("1")|fromClient.equals("3")|fromClient.equals("2")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 3 e 5 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
	}
	public static String dicaRespostaMedia2(String fromClient, Player player){
		String enviar;
			if(fromClient.equals("4")) {
			 	enviar = "Resposta correta, ganhou 10 pontos!\n\n------------------------------------------------------------------";
			 	player.aumentarPontos(10);
			 	return enviar;
			}else if(fromClient.equals("1")|fromClient.equals("5")|fromClient.equals("3")|fromClient.equals("2")){
				enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
				} else {
					enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
					player.diminuirPontos(10);
					return enviar;
				} 
}

	public static String perguntaDificil1(Player player) {
		String pergunta = "java.util.Collections é uma? (Pergunta nível Difícil)\n"
				+ "[1] Classe\n[2] Interface\n[3] Objeto\n[4] Tipo de herança\n[5] Nenhum desses\nDigite sua resposta: \nPara soliticar uma dica digite dica (ganha metade dos pontos)\n------------------------------------------------------------------";
		return pergunta;
	}
	public static String respostaDificil1(String fromClient, Player player){
		String enviar;
		if(fromClient.equals("1")) {
		 	enviar = "Resposta correta, ganhou 40 pontos!\n\n------------------------------------------------------------------";
		 	player.aumentarPontos(40);
		 	return enviar;
		}else if(fromClient.equals("4")|fromClient.equals("5")|fromClient.equals("3")|fromClient.equals("2")){
			enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
			player.diminuirPontos(10);
			return enviar;
			}else if(fromClient.equalsIgnoreCase("dica")) {
				enviar = "As alternativas 2 e 5 estão erradas\nDigite sua resposta: \n\n------------------------------------------------------------------";
				return enviar;
			}else {
				enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
			}
}
	public static String dicaRespostaDificil1(String fromClient, Player player){
		String enviar;
			if(fromClient.equals("1")) {
			 	enviar = "Resposta correta, ganhou 20 pontos!\n\n------------------------------------------------------------------";
			 	player.aumentarPontos(20);
			 	return enviar;
			}else if(fromClient.equals("4")|fromClient.equals("5")|fromClient.equals("3")|fromClient.equals("2")){
				enviar = "Resposta errada, perdeu 10 pontos!\n\n------------------------------------------------------------------";
				player.diminuirPontos(10);
				return enviar;
				} else {
					enviar = "Resposta inválida, perdeu 10 pontos!\n\n------------------------------------------------------------------";
					player.diminuirPontos(10);
					return enviar;
				} 
}
}