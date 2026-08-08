package projetoLPII;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp() {
        player = new Player("Testador");
    }

    @Test
    public void deveComecarComZeroPontos() {
        assertEquals(0, player.getPontos());
    }

    @Test
    public void deveGuardarONickCorretamente() {
        assertEquals("Testador", player.getNickname());
    }

    @Test
    public void deveAumentarPontosCorretamente() {
        player.aumentarPontos(10);
        assertEquals(10, player.getPontos());
    }

    @Test
    public void deveDiminuirPontosCorretamente() {
        player.diminuirPontos(10);
        assertEquals(-10, player.getPontos());
    }

    @Test
    public void deveAcumularPontosEmVariasChamadas() {
        player.aumentarPontos(10);
        player.aumentarPontos(20);
        player.diminuirPontos(5);
        assertEquals(25, player.getPontos());
    }

    @Test
    public void setPontosDeveSobrescreverValor() {
        player.aumentarPontos(50);
        player.setPontos(0);
        assertEquals(0, player.getPontos());
    }
}