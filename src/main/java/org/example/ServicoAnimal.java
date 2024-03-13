package org.example;

import java.util.ArrayList;
import java.util.List;
//Criar um sistema veterinário que irá ter as seguintes funções:
        //Cadastro de animais  FEITO!!!
        //Busca de animais pela ID FEITO!!
        //Alteração de um animal FEITO!!
        //Exclusão de um animal FEITO!!
        //Listagem de animais cadastrados no sistema  FEITO!!
public class ServicoAnimal {
    static List<Animal> listaAnimal = new ArrayList<>();

    public static int cadastarAnimal(Animal animal) {
        try {
            listaAnimal.add(animal);
            return 1;
        }catch (Exception e){
            return 0;
        }
    }

    public static int validarAnimal(Animal animal) {
        if (animal.getIdAnimal() == 0) {
            return 0;
        }
        if (animal.getNomeAnimal() == null) {
            return 0;
        }
        if (animal.getTipoAnimal() == null) {
            return 0;
        }
        if (animal.getRacaAnimal() == null) {
            return 0;
        }
        return 1;
    }

    public static boolean alterarAnimal(Animal animal) {
        try { //tente
            if (validarAnimal(animal) == 1) {
                for (Animal a : listaAnimal) {
                    if (a.getIdAnimal() == a.getIdAnimal()) {
                        a.setNomeAnimal(animal.getNomeAnimal());
                        a.setTipoAnimal(animal.getTipoAnimal());
                        a.setRacaAnimal(animal.getRacaAnimal());
                        a.setIdadeAnimal(animal.getIdadeAnimal());
                        return true;
                    }
                }
                return false;
            }else { //se não validar o animal ira retornar falso
                return false;
            }

        }catch (Exception e){ //específico do try
            return false;
        }
    }

    public static boolean excluirAnimal(int idAnimal){
        for(int i = 0; i < listaAnimal.size(); i ++){
            if(listaAnimal.get(i).getIdAnimal() == idAnimal){
                listaAnimal.remove(i);
                return true;
            }
        }
        return false;
    }

    public static Animal  buscarIdAnimal (int idAnimal){
        Animal animal = null;
        for (Animal a : listaAnimal){
            if (a.getIdAnimal() == idAnimal){
                animal = a;
                break;
            }
        }
        return animal;
    }



    public  static List<Animal> getListaAnimal(){ //retorna a lista de animal armazenada
        return listaAnimal;
    }

    public static void setListaAnimal(List<Animal> listaAnimal) { // permite modificar a lista animal, ele aceita uma nova lista como parametro
        ServicoAnimal.listaAnimal = listaAnimal;
    }




}
