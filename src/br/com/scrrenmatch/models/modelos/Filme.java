package br.com.scrrenmatch.models.modelos;
import br.com.scrrenmatch.models.calculos.Classificavel;
import br.com.scrrenmatch.models.calculos.FilmeRecomendacao;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    @Override
    public int getClassificacao(){
        double notaAvaliacao = (int) pegaMedia();
        if (notaAvaliacao <= 2) {
            return 2;

        } else if (notaAvaliacao <= 4) {
            return 4;

        } else if (notaAvaliacao <= 7) {
            return 7;

        } else if (notaAvaliacao <= 10) {
            return 10;

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        FilmeRecomendacao filtro = new FilmeRecomendacao();
        return "Filme: " + getNome() + "(" + getAnoDeLancamento() + ")" +
                "\nDuração: " + getDuracaoEmMinutos() +
                "\n" + filtro.filtraRecomendacao(this);
    }
}