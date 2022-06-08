import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

/*
 ** created by: jorge.lessa
 */
class CensoTest {

    @Test
    void deveRetornarTotalDeJogosDoConsole()
    {
        Jogo j1 = new Jogo("FIFA 22", 199.99, new Date(2022, 01, 01));
        Jogo j2 = new Jogo("FIFA 21", 59.99, new Date(2021, 01, 01));
        Jogo j3 = new Jogo("The Last Of Us Part II", 299.99, new Date(2020, 06, 04));
        Jogo j4 = new Jogo("NBA2K22", 239.99, new Date(2022, 01, 01));
        Console console = new Console("PS4", j1, j2, j3, j4);
        assertEquals(4, Censo.getTotalJogosConsole(console));
    }

    @Test
    void deveRetornarTotalDeJogosDoConsolePorAnoDeLancamentoDoJogo()
    {
        Jogo j1 = new Jogo("FIFA 22", 199.99, new Date(2022, 01, 01));
        Jogo j2 = new Jogo("FIFA 21", 59.99, new Date(2021, 01, 01));
        Jogo j3 = new Jogo("The Last Of Us Part II", 299.99, new Date(2020, 06, 04));
        Jogo j4 = new Jogo("NBA2K22", 239.99, new Date(2022, 01, 01));
        Console console = new Console("PS4", j1, j2, j3, j4);
        assertEquals(2, Censo.getTotalJogosConsolePorAnoLancamento(console, 2022));
    }


}