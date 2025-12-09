package br.com.scrrenmatch.models.modelos;

import br.com.scrrenmatch.models.calculos.Classificavel;
import br.com.scrrenmatch.models.calculos.FilmeRecomendacao;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private double totalVisuzalizacoes;

    public Serie(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public double getTotalVisuzalizacoes() {
        return totalVisuzalizacoes;
    }

    public void setTotalVisuzalizacoes(double totalVisuzalizacoes) {
        this.totalVisuzalizacoes = totalVisuzalizacoes;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        if (totalVisuzalizacoes <= 10.000) {
            return 2;

        } else if (totalVisuzalizacoes <= 99.999) {
            return 4;

        } else if (totalVisuzalizacoes <= 1_000_000.0) {
            return 7;

        } else if (totalVisuzalizacoes >= 50_000_000.0) {
            return 10;

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        FilmeRecomendacao filtro = new FilmeRecomendacao();
        return "Serie: " + getNome() + "(" + getAnoDeLancamento() + ")" +
                "\nDuração: " + getDuracaoEmMinutos() +
                "\n" + filtro.filtraRecomendacao(this);
    }
}