package projetoLPII;
import java.io.*;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayerSocket { // Classe que tem o socket do jogador, recebe as perguntas do servidor
	Socket s;				// E envia as respostas para ele
	
    public static void main(String[] args) {
    	BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
    	String continuar = "Sim";

        try {
            Socket s = new Socket("localhost", 1234);
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

        do {
        	System.out.println("------------------------------------------------------------------");
        	System.out.println("Iniciando o jogo....");
        	System.out.println("As perguntas fáceis valem 10 pontos, as médias 20 pontos e as difícies 40 pontos...");
        	System.out.println("Cada pergunta errada você perde 10 pontos...");
            System.out.println("Digite seu nick para começar...");
            System.out.println("------------------------------------------------------------------");
            String fromUser = stdIn.readLine(); // Guarda o nick
            out.writeUTF(fromUser); // Envia o nick
            
            System.out.println(in.readUTF()); // Recebe a pergunta Facil1
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }
            
            System.out.println(in.readUTF()); // Recebe a pergunta Facil2
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }
            
            System.out.println(in.readUTF()); // Recebe a pergunta Facil3
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }
       
            System.out.println(in.readUTF()); // Recebe a pergunta Media1
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }
           
            System.out.println(in.readUTF()); // Recebe a pergunta Media2
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }

            System.out.println(in.readUTF()); // Recebe a pergunta Dificil1
            fromUser = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(fromUser); // Envia a resposta
            System.out.println(in.readUTF()); // Recebe se acertou ou errou
            if(fromUser.equalsIgnoreCase("dica")) {
            	fromUser = stdIn.readLine();	// Guarda a resposta
            	out.writeUTF(fromUser); // Envia a resposta
            	System.out.println(in.readUTF()); // Recebe se acertou ou errou
            }
          
            System.out.println(in.readUTF()); // Recebe a pontuacao
            System.out.println(in.readUTF()); // Recebe seu recorde
            System.out.println("Deseja jogar novamente? (Sim - para continuar)\n------------------------------------------------------------------"); // Pergunta se quer jogar novamente
            continuar = stdIn.readLine();	// Guarda a resposta
            out.writeUTF(continuar); // Envia a resposta
        } while(continuar.equalsIgnoreCase("Sim"));
        	
        	System.out.println("Finalizando o jogo....");
            in.close();
            out.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}