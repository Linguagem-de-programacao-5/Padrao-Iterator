import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveRetornarQuantidadeQuartosDisponiveis(){
        Hotel hotel = new Hotel(
                new Quarto(100,1,true, 200.0),
                new Quarto(101,1, false, 250.0),
                new Quarto(200,2,true, 150.0),
                new Quarto(201,2, false, 220.0),
                new Quarto(300,3,true, 200.0),
                new Quarto(301,3, false, 250.0)
        );

        assertEquals(3, Censo.contarQuartosDisponiveis(hotel));
    }

    @Test
    void deveRetornarRendaDiariaPorQuartoOcupado(){
        Hotel hotel = new Hotel(
                new Quarto(100,1,true, 200.0),
                new Quarto(101,1, false, 250.0),
                new Quarto(200,2,true, 150.0),
                new Quarto(201,2, false, 220.0),
                new Quarto(300,3,true, 200.0),
                new Quarto(301,3, false, 250.0)
        );

        assertEquals(550.0, Censo.rendaDiariaPorQuartoOcupado(hotel));
    }
}