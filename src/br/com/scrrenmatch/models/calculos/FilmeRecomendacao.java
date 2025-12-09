package br.com.scrrenmatch.models.calculos;

public class FilmeRecomendacao {

    public String filtraRecomendacao(Classificavel classificavel){

        if (classificavel.getClassificacao() == 1) {
            return "| Classificação -> Não temos avaliações sufientes no momento";

        } else if (classificavel.getClassificacao() == 2) {
            return "| Classificação -> Não é muito avaliado no momento";

        } else if (classificavel.getClassificacao() == 4){
            return "| Classificação -> Boa avaliação !";

        } else if (classificavel.getClassificacao() == 7){
            return " | Classificação -> Muito bem avaliado !";

        } else if (classificavel.getClassificacao() == 10){
            return "| Classificação -> Está nos Top10 da plataforma !!!";
        } else {
            return "Nenhuma classificação encontrada.";
        }
    }
}


