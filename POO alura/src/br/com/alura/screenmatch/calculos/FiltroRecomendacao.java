package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.printf("\nEstá entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.printf("\nMuito bem avaliado no momento!");
        } else{
            System.out.printf("\nColoque na sua lista para ver depois");
        }
    }


}
