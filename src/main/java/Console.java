import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class Console implements Iterable<Jogo>{

    private String nome;
    private List<Jogo> jogos = new ArrayList<>();

    public Console(String nome, Jogo... jogos) {
        this.nome = nome;
        this.jogos = Arrays.asList(jogos);
    }

    @Override
    public Iterator<Jogo> iterator() {
        return jogos.iterator();
    }
}
