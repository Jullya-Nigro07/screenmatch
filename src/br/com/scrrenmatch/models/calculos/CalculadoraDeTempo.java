package br.com.scrrenmatch.models.calculos;

import br.com.scrrenmatch.models.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotalMaratona() {
        System.out.println("Maratona total dos filmes/series: " + tempoTotal);
        return this.tempoTotal;
    }

    public void incluiCalculadoraDeMaratona(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
