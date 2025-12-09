package br.com.scrrenmatch.models.modelos;

public class Episodio {

    private int numeroEpisodio;
    private String nomeEpisodio;
    private Serie serieEpisodio;

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public Serie getSerieEpisodio() {
        return serieEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public void setSerieEpisodio(Serie serieEpisodio) {
        this.serieEpisodio = serieEpisodio;
    }


    @Override
    public String toString () {
        return "Nome do Episodio: " + nomeEpisodio +
                "\nnº" + numeroEpisodio +
                "\nSérie: " + serieEpisodio;
    }
}
