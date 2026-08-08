package projetoLPII;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuizTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Testador");
    }

    // ---------- Pergunta Fácil 1 (resposta correta: 5) ----------

    @Test
    public void resposta1_correta_deveGanhar10Pontos() {
        String resultado = Quiz.resposta1("5", player);
        assertEquals(10, player.getPontos());
        assertTrue(resultado.contains("Resposta correta"));
    }

    @Test
    public void resposta1_errada_devePerder10Pontos() {
        Quiz.resposta1("1", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void resposta1_invalida_devePerder10Pontos() {
        Quiz.resposta1("abc", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void resposta1_dica_naoDeveAlterarPontosAindaEDeveMostrarDica() {
        String resultado = Quiz.resposta1("dica", player);
        assertEquals(0, player.getPontos());
        assertTrue(resultado.contains("alternativas 2 e 4"));
    }

    @Test
    public void dicaResposta1_correta_deveGanhar5Pontos() {
        Quiz.dicaResposta1("5", player);
        assertEquals(5, player.getPontos());
    }

    @Test
    public void dicaResposta1_errada_devePerder10Pontos() {
        Quiz.dicaResposta1("1", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void dicaResposta1_invalida_devePerder10Pontos() {
        Quiz.dicaResposta1("xyz", player);
        assertEquals(-10, player.getPontos());
    }

    // ---------- Pergunta Fácil 2 (resposta correta: 1) ----------

    @Test
    public void resposta2_correta_deveGanhar10Pontos() {
        Quiz.resposta2("1", player);
        assertEquals(10, player.getPontos());
    }

    @Test
    public void resposta2_errada_devePerder10Pontos() {
        Quiz.resposta2("5", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void dicaResposta2_correta_deveGanhar5Pontos() {
        Quiz.dicaResposta2("1", player);
        assertEquals(5, player.getPontos());
    }

    // ---------- Pergunta Fácil 3 (resposta correta: 2) ----------

    @Test
    public void resposta3_correta_deveGanhar10Pontos() {
        Quiz.resposta3("2", player);
        assertEquals(10, player.getPontos());
    }

    @Test
    public void resposta3_errada_devePerder10Pontos() {
        Quiz.resposta3("1", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void dicaResposta3_correta_deveGanhar5Pontos() {
        Quiz.dicaResposta3("2", player);
        assertEquals(5, player.getPontos());
    }

    // ---------- Pergunta Média 1 (resposta correta: 2) ----------

    @Test
    public void respostaMedia1_correta_deveGanhar20Pontos() {
        Quiz.respostaMedia1("2", player);
        assertEquals(20, player.getPontos());
    }

    @Test
    public void respostaMedia1_errada_devePerder10Pontos() {
        Quiz.respostaMedia1("1", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void dicaRespostaMedia1_correta_deveGanhar10Pontos() {
        // corrigido: antes somava 5, agora soma 10 (metade de 20)
        String resultado = Quiz.dicaRespostaMedia1("2", player);
        assertEquals(10, player.getPontos());
        assertTrue(resultado.contains("ganhou 10 pontos"));
    }

    @Test
    public void dicaRespostaMedia1_errada_devePerder10Pontos() {
        Quiz.dicaRespostaMedia1("1", player);
        assertEquals(-10, player.getPontos());
    }

    // ---------- Pergunta Média 2 (resposta correta: 4) ----------

    @Test
    public void respostaMedia2_correta_deveGanhar20Pontos() {
        Quiz.respostaMedia2("4", player);
        assertEquals(20, player.getPontos());
    }

    @Test
    public void respostaMedia2_errada_devePerder10Pontos() {
        Quiz.respostaMedia2("1", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void dicaRespostaMedia2_correta_deveGanhar10Pontos() {
        // corrigido: antes somava 5, agora soma 10 (metade de 20)
        String resultado = Quiz.dicaRespostaMedia2("4", player);
        assertEquals(10, player.getPontos());
        assertTrue(resultado.contains("ganhou 10 pontos"));
    }

    // ---------- Pergunta Difícil 1 (resposta correta: 1) ----------

    @Test
    public void respostaDificil1_correta_deveGanhar40Pontos() {
        // corrigido: antes somava 5 e mensagem dizia "10 pontos"
        String resultado = Quiz.respostaDificil1("1", player);
        assertEquals(40, player.getPontos());
        assertTrue(resultado.contains("ganhou 40 pontos"));
    }

    @Test
    public void respostaDificil1_errada_devePerder10Pontos() {
        Quiz.respostaDificil1("2", player);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void respostaDificil1_dica_naoDeveAlterarPontosAindaEDeveMostrarDica() {
        String resultado = Quiz.respostaDificil1("dica", player);
        assertEquals(0, player.getPontos());
        assertTrue(resultado.contains("alternativas 2 e 5"));
    }

    @Test
    public void dicaRespostaDificil1_correta_deveGanhar20Pontos() {
        // corrigido: antes somava 5 e mensagem dizia "10 pontos"
        String resultado = Quiz.dicaRespostaDificil1("1", player);
        assertEquals(20, player.getPontos());
        assertTrue(resultado.contains("ganhou 20 pontos"));
    }

    @Test
    public void dicaRespostaDificil1_errada_devePerder10Pontos() {
        Quiz.dicaRespostaDificil1("2", player);
        assertEquals(-10, player.getPontos());
    }

    // ---------- Textos finais ----------

    @Test
    public void resultadoFinal_deveConterNickEPontuacao() {
        player.aumentarPontos(30);
        String resultado = Quiz.resultadoFinal(player);
        assertTrue(resultado.contains("Testador"));
        assertTrue(resultado.contains("30"));
    }

    @Test
    public void recorde_deveConterValorPassado() {
        String resultado = Quiz.recorde(player, 100);
        assertTrue(resultado.contains("100"));
    }

    // ---------- Fluxo completo (integra várias perguntas) ----------

    @Test
    public void fluxoCompleto_todasCorretasSemDica_deveSomar100Pontos() {
        // Fácil (10+10+10) + Média (20+20) + Difícil (40) = 110... mas testamos parte a parte
        Quiz.resposta1("5", player);        // +10
        Quiz.resposta2("1", player);        // +10
        Quiz.resposta3("2", player);        // +10
        Quiz.respostaMedia1("2", player);   // +20
        Quiz.respostaMedia2("4", player);   // +20
        Quiz.respostaDificil1("1", player); // +40
        assertEquals(110, player.getPontos());
    }
}