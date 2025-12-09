package br.com.scrrenmatch.models.principal;

import br.com.scrrenmatch.models.calculos.CalculadoraDeTempo;
import br.com.scrrenmatch.models.calculos.FilmeRecomendacao;
import br.com.scrrenmatch.models.modelos.Episodio;
import br.com.scrrenmatch.models.modelos.Filme;
import br.com.scrrenmatch.models.modelos.Serie;
import br.com.scrrenmatch.models.modelos.Titulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FilmeRecomendacao filtro = new FilmeRecomendacao();

        Filme barbie1 = new Filme("Barbie", 2023);
        barbie1.exibeFichaTecnica();

        barbie1.setDuracaoEmMinutos(114);
        System.out.println("Duração em minutos: " + barbie1.getDuracaoEmMinutos());

        barbie1.avalia(8);
        barbie1.avalia(5);
        barbie1.avalia(10);

        System.out.println("Total de avaliações " + barbie1.getTotalDeAvaliacoes());
        System.out.println("Avaliação atual: " + String.format("%.1f", barbie1.pegaMedia()));
        System.out.println(filtro.filtraRecomendacao(barbie1));

        System.out.println("\n----------------------------------------------------\n");

        Serie bridgerton2 = new Serie("Bridgerton", 2020);
        bridgerton2.exibeFichaTecnica();

        bridgerton2.setTemporadas(10);
        bridgerton2.setEpisodiosPorTemporada(10);
        bridgerton2.setMinutosPorEpisodio(50);
        System.out.println("Duração da série em minutos: " + bridgerton2.getDuracaoEmMinutos());

        bridgerton2.setTotalVisuzalizacoes(91_000_000.0);
        System.out.println("Total de visualizações da Série: " + String.format("%.1f", bridgerton2.getTotalVisuzalizacoes()));

        System.out.println(filtro.filtraRecomendacao(bridgerton2));

        System.out.println("\n----------------------------------------------------\n");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluiCalculadoraDeMaratona(barbie1);
        calculadora.incluiCalculadoraDeMaratona(bridgerton2);
        calculadora.getTempoTotalMaratona();

        System.out.println("\n----------------------------------------------------\n");

        Episodio episodioBridgerton3 = new Episodio();

        episodioBridgerton3.setNomeEpisodio("A Arte de Desfalecer");
        episodioBridgerton3.setNumeroEpisodio(3);
        episodioBridgerton3.setSerieEpisodio(bridgerton2);


        System.out.println("O nome do episódio nº" + episodioBridgerton3.getNumeroEpisodio() +
                " da Serie " + episodioBridgerton3.getSerieEpisodio().getNome() +
                " é: " + episodioBridgerton3.getNomeEpisodio());


        System.out.println("\n----------------------------------------------------\n");

        ArrayList<Titulo> listaParaMaratonar = new ArrayList<>();
        listaParaMaratonar.add(barbie1);
        listaParaMaratonar.add(bridgerton2);

        System.out.println("Tamanho da sua lista para maratonar: " + listaParaMaratonar.size());
        System.out.println("Primeiro filme adicionado: " + listaParaMaratonar.getFirst().getNome());

        System.out.println("\n----------------------------------------------------\n");

        System.out.println("\n Lista de Filmes ");
        for (Titulo item : listaParaMaratonar) {
            if (item instanceof Filme) {
                System.out.println(item.toString());
            }
        }

        System.out.println("\n----------------------------------------------------\n");

        System.out.println("\n Lista de Séries");
        for (Titulo item : listaParaMaratonar) {
            if (item instanceof Serie) {
                System.out.println(item.toString());
            }
        }
    }
}
