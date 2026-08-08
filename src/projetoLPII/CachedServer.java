package projetoLPII;
import java.io.*;
import java.net.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CachedServer { // Classe que instancia um servidor concorrente e multithread 
							// Que aceita jogadores na porta 1234
							// E permite várias conexões simultâneas 
	public static void main(String[] args) {
		try{
			Executor exec = Executors.newCachedThreadPool();
			ServerSocket s = new ServerSocket(1234);
			System.out.println("Server Iniciado...");
		while(true) {
			Socket ns = s.accept();
			exec.execute(new QuizSocket(ns));
			System.out.println("Jogador Conectado na porta 1234...");
		}
		// s.close();
	} catch(Exception e) {
		e.printStackTrace();
	}

}
}