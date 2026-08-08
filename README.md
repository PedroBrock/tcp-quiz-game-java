# 🎮 Quiz TCP Multijogador em Java

Projeto desenvolvido para a disciplina de **Linguagem de Programação II**, implementando um jogo de Quiz em Java com comunicação via **sockets TCP**, suporte a **múltiplas conexões simultâneas** através de um servidor concorrente e multithread.

---

## 📖 Descrição

O jogador se conecta ao servidor via terminal, informa seu nickname e responde a **6 perguntas de múltipla escolha** sobre Java, divididas em três níveis de dificuldade. Ao final de cada rodada, a pontuação e o recorde do jogador são exibidos, e ele pode optar por jogar novamente sem precisar reconectar.

O servidor aceita qualquer número de conexões simultâneas, cada uma rodando em sua própria thread.

---

## 🏗️ Arquitetura

A comunicação segue o modelo **cliente-servidor**:

```
┌─────────────────┐        TCP (porta 1234)        ┌──────────────────────┐
│  PlayerSocket   │ ◄────────────────────────────► │    CachedServer      │
│   (Cliente)     │    perguntas / respostas        │  (Servidor + Threads)│
└─────────────────┘                                 └──────────────────────┘
                                                             │
                                                    ┌────────┴────────┐
                                                    │   QuizSocket    │
                                                    │  (por jogador)  │
                                                    └────────┬────────┘
                                                             │
                                                    ┌────────┴────────┐
                                                    │      Quiz       │
                                                    │  (perguntas e   │
                                                    │   pontuação)    │
                                                    └─────────────────┘
```

---

## 📋 Classes

| Classe | Responsabilidade |
|---|---|
| `CachedServer` | Inicia o servidor na porta 1234 e aceita conexões com `newCachedThreadPool` |
| `QuizSocket` | Roda em thread própria; envia perguntas e processa respostas de cada jogador |
| `PlayerSocket` | Cliente; conecta ao servidor, exibe perguntas e envia respostas via terminal |
| `Quiz` | Contém todas as perguntas, valida respostas e calcula pontuação |
| `Player` | Armazena nickname e pontuação do jogador na sessão |

---

## 🎯 Regras do jogo

| Nível | Perguntas | Acerto | Acerto com dica | Erro |
|---|---|---|---|---|
| Fácil | 3 | +10 pts | +5 pts | -10 pts |
| Médio | 2 | +20 pts | +10 pts | -10 pts |
| Difícil | 1 | +40 pts | +20 pts | -10 pts |

- Cada pergunta tem **5 alternativas**
- O jogador pode digitar **"dica"** antes de responder para eliminar duas alternativas erradas (ganha metade dos pontos se acertar)
- Resposta inválida também resulta em **-10 pontos**
- Ao fim da rodada, são exibidos a **pontuação atual** e o **recorde** do jogador
- O jogador pode optar por **jogar novamente** sem reconectar ao servidor

---

## 🗂️ Estrutura do projeto

```
src/
└── projetoLPII/
    ├── CachedServer.java   # Servidor TCP concorrente
    ├── QuizSocket.java     # Lógica de jogo por conexão (Runnable)
    ├── PlayerSocket.java   # Cliente do quiz
    ├── Quiz.java           # Perguntas, respostas e pontuação
    └── Player.java         # Modelo do jogador
```

---

## 🚀 Como executar

### Pré-requisitos
- Java JDK 8 ou superior

### 1. Compilar

```bash
javac projetoLPII/*.java
```

### 2. Iniciar o servidor

```bash
java projetoLPII.CachedServer
```

Saída esperada:
```
Server Iniciado...
```

### 3. Conectar um jogador (em outro terminal)

```bash
java projetoLPII.PlayerSocket
```

Múltiplos jogadores podem se conectar simultaneamente abrindo novos terminais e repetindo o passo 3.

### Exemplo de sessão

```
------------------------------------------------------------------
Iniciando o jogo....
As perguntas fáceis valem 10 pontos, as médias 20 pontos e as difíceis 40 pontos...
Cada pergunta errada você perde 10 pontos...
Digite seu nick para começar...
------------------------------------------------------------------
> ProPlayer

Como fazer comentários em Java? (Pergunta nível fácil)
[1] /*  [2] */  [3] \  [4] #  [5] //
Para solicitar uma dica digite dica
> 5
Resposta correta, ganhou 10 pontos!
...
Jogador ProPlayer teve pontuação de 70 pontos!!!
Recorde desse jogador é de 70 pontos!!!
Deseja jogar novamente? (Sim - para continuar)
> Não
Finalizando o jogo....
```

---

## 🛠️ Tecnologias

- **Java** (Sockets TCP, I/O Streams, Threads)
- `java.net.Socket` / `java.net.ServerSocket`
- `java.util.concurrent.Executors.newCachedThreadPool()`
- `DataInputStream` / `DataOutputStream`

---

## 📚 Referências

- [Java Socket Programming — Oracle Docs](https://docs.oracle.com/javase/tutorial/networking/sockets/)
- [Java Concurrency — Executors](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executors.html)

---

## 👨‍💻 Disciplina

> Linguagem de Programação II
