import java.util.Iterator;

public class Censo {

    public static Integer contarQuartosDisponiveis(Hotel hotel){
        int quantidade = 0;
        for (Quarto quarto: hotel){
            if(!quarto.isOcupado()){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static double rendaDiariaPorQuartoOcupado(Hotel hotel){
        double soma = 0;

        for (Quarto quarto: hotel){
            if(quarto.isOcupado()){
                soma += quarto.getValorDiaria();
            }
        }
        return soma;
    }

}
