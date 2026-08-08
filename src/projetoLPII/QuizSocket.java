package projetoLPII;
import java.io.*;
import java.net.*;

public class QuizSocket implements Runnable { // Classe que tem o socket do servidor, envia as perguntas para o jogador
	Socket s;								  // E recebe as respostas dele
	String continuar = "Sim";
	String nick;
	
    public QuizSocket(Socket ns) {
    	s = ns;
   }
    public void run() {
    	try{
    		DataInputStream in = new DataInputStream(s.getInputStream());
    		DataOutputStream out = new DataOutputStream(s.getOutputStream());
    		System.out.println("Aguardando Mensagem...");
    	do {
    		nick = in.readUTF();
    		Player P1 = new Player(nick);
        	
            out.writeUTF(Quiz.perguntaFacil1(P1)); // Envia a pergunta Facil1
        	String fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.resposta1(fromClient, P1)); // Trata a resposta e envia se acertou
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaResposta1(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}
        	
        	out.writeUTF(Quiz.perguntaFacil2(P1)); // Envia a pergunta Facil2
        	fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.resposta2(fromClient, P1)); // Trata a resposta
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaResposta2(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}
        	
        	out.writeUTF(Quiz.perguntaFacil3(P1)); // Envia a pergunta Facil3
        	fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.resposta3(fromClient, P1)); // Trata a resposta
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaResposta3(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}

        	out.writeUTF(Quiz.perguntaMedia1(P1)); // Envia a pergunta Media1
        	fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.respostaMedia1(fromClient, P1)); // Trata a resposta
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaRespostaMedia1(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}
       	
        	out.writeUTF(Quiz.perguntaMedia2(P1)); // Envia a pergunta Media2
        	fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.respostaMedia2(fromClient, P1)); // Trata a resposta
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaRespostaMedia2(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}
        	
        	out.writeUTF(Quiz.perguntaDificil1(P1)); // Envia a pergunta Dificil1
        	fromClient = in.readUTF(); // Recebe a resposta
        	out.writeUTF(Quiz.respostaDificil1(fromClient, P1)); // Trata a resposta
        	if(fromClient.equalsIgnoreCase("dica")) {
        		fromClient = in.readUTF(); // recebe a resposta
        		out.writeUTF(Quiz.dicaRespostaDificil1(fromClient, P1)); // trata a nova resposta e envia se acertou
        	}

        	out.writeUTF(Quiz.resultadoFinal(P1)); // Envia a pontuacao
        	continuar = in.readUTF(); // Recebe a resposta se vai continuar jogando
    	} while(continuar.equalsIgnoreCase("Sim"));
        	
    		System.out.println("Finalizando a conexão com o Jogador " + nick + "...");
        	in.close();
            out.close();
            s.close();
    	
    } catch (Exception e) {
    	e.printStackTrace();
    }
    }
}