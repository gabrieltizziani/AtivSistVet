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

    @Test
    public void excluirAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNomeAnimal("Espuleta");
        animal.setTipoAnimal("Gato");
        animal.setRacaAnimal("Desconhecida");
        ServicoAnimal.cadastarAnimal(animal);

        Assertions.assertTrue(ServicoAnimal.excluirAnimal(1));
        Assertions.assertEquals(0, ServicoAnimal.getListaAnimal().size());
    }

    @Test
    public void editarAnimal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNomeAnimal("Espuleta");
        animal.setTipoAnimal("Gato");
        animal.setRacaAnimal("Desconhecida");
        if (ServicoAnimal.validarAnimal(animal) == 1){
            if (ServicoAnimal.cadastarAnimal(animal) == 1){
                animal.setIdAnimal(1);
                animal.setNomeAnimal("Espuleta");
                animal.setTipoAnimal("Gato");
                animal.setRacaAnimal("Desconhecida");
                Assertions.assertTrue(ServicoAnimal.alterarAnimal(animal));
            }
        }
    }

    @Test
    public void criarAninal(){
        Animal animal = new Animal();
        animal.setIdAnimal(1);
        animal.setNomeAnimal("Espuleta");
        animal.setTipoAnimal("Gato");
        animal.setRacaAnimal("Desconhecida");
        animal.setIdadeAnimal(2);

        Assertions.assertEquals(1, ServicoAnimal.validarAnimal(animal));
        Assertions.assertEquals(1, ServicoAnimal.cadastarAnimal(animal));

    }



}
