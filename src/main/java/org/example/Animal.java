package org.example;

public class Animal {
    //obrigatório
    private  int idAnimal;
    //obrigatorio
    private String tipoAnimal; //ex: cavalo, cachorro, gato
    // obrigatorio
    private String nomeAnimal;
    //obrigatório
    private String racaAnimal; // ex qual raca do cavalo.....
    private int idadeAnimal;

    public Animal() {
    }

    public Animal(int idAnimal, String tipoAnimal, String nomeAnimal, String racaAnimal, int idadeAnimal) {
        this.idAnimal = idAnimal;
        this.tipoAnimal = tipoAnimal;
        this.nomeAnimal = nomeAnimal;
        this.racaAnimal = racaAnimal;
        this.idadeAnimal = idadeAnimal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }
}
