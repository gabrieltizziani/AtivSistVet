import org.example.Animal;
import org.example.ServicoAnimal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class TesteServicoAnimal {

    @Test
    public void validarAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNomeAnimal("Espuleta");
        animal.setTipoAnimal("Gato");
        animal.setRacaAnimal("Desconhecida");
        animal.setIdadeAnimal(1);

        Assertions.assertEquals(1, ServicoAnimal.validarAnimal(animal));
    }

    @Test
    public void buscarId(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNomeAnimal("Espuleta");
        animal.setTipoAnimal("Gato");
        animal.setRacaAnimal("Desconhecida");
        ServicoAnimal.cadastarAnimal(animal);

        Assertions.assertEquals("Espuleta", ServicoAnimal.buscarIdAnimal(1).getNomeAnimal());
    }



}
