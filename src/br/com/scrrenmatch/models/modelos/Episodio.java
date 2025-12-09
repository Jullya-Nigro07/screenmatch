package br.com.scrrenmatch.models.modelos;

public record Episodio(String nomeEpisodio, int numeroEpisodio, Serie serieEpisodio) {

    @Override
    public String toString () {
        return "Nome do Episodio: " + nomeEpisodio +
                "\nnº" + numeroEpisodio +
                "\nSérie: " + serieEpisodio;
    }
}