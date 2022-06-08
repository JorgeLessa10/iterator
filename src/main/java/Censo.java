/*
 ** created by: jorge.lessa
 */

import java.util.Calendar;

public class Censo {

    public static Integer getTotalJogosConsole(Console console)
    {
        Integer totalDeJogosDoConsole = 0;
        for (Jogo jogo : console)
        {
            totalDeJogosDoConsole++;
        }
        return totalDeJogosDoConsole;
    }


    public static Integer getTotalJogosConsolePorAnoLancamento(Console console, Integer ano)
    {
        Integer totalDeJogosDoConsolePorAnoDeLancamento = 0;

        for (Jogo jogo : console)
        {
            if (jogo.getDataLancamento().getYear() == ano)
            {
                totalDeJogosDoConsolePorAnoDeLancamento++;
            }
        }
        return totalDeJogosDoConsolePorAnoDeLancamento;
    }
}
