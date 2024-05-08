package audio.projeto.modelos;

public class Preferidas {
    public void inclui(Audio audio){
        if(audio.media() >=9 ){
            System.out.println("\n" + audio.getNome() + " Está nas paradas de Sucesso\n");
        } else{
            System.out.println("\nAdicione " + audio.getNome() + "na sua lista para ouvir depois\n");
        }
    }
}
