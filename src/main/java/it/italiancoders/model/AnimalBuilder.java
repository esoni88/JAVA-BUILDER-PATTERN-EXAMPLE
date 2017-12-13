package it.italiancoders.model;

import java.util.List;

public final class AnimalBuilder {

    private String id;
    private String name;
    private String pedigreeName;
    private String owner;
    private String race;
    private String residence;
    private Boolean isVaccinated;
    private Boolean isChampion;
    private List<String> sons;
    private Animal.Sex sex;
    private Double weight;
    private Double height;

    private AnimalBuilder(String id) {
        this.id = id;
    }

    public static AnimalBuilder newBuilder(String id) {
        return new AnimalBuilder(id);
    }

    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder pedigreeName(String pedigreeName) {
        this.pedigreeName = pedigreeName;
        return this;
    }

    public AnimalBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    public AnimalBuilder race(String race) {
        this.race = race;
        return this;
    }

    public AnimalBuilder residence(String residence) {
        this.residence = residence;
        return this;
    }

    public AnimalBuilder isVaccinated(Boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
        return this;
    }

    public AnimalBuilder isChampion(Boolean isChampion) {
        this.isChampion = isChampion;
        return this;
    }

    public AnimalBuilder sons(List<String> sons) {
        this.sons = sons;
        return this;
    }

    public AnimalBuilder sex(Animal.Sex sex) {
        this.sex = sex;
        return this;
    }

    public AnimalBuilder weight(Double weight) {
        this.weight = weight;
        return this;
    }

    public AnimalBuilder height(Double height) {
        this.height = height;
        return this;
    }

    public Animal build() {
        if(weight>200){
            throw new IllegalArgumentException("Animale troppo pesante");

        }
        if(!isVaccinated){
            throw new IllegalArgumentException("Animale non vaccinato");

        }
        return new Animal(name, pedigreeName, id, owner, race, residence, isVaccinated, isChampion, sons, sex, weight, height);
    }
}
