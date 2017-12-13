package it.italiancoders.model;

import lombok.Builder;

import java.util.List;

@Builder(builderMethodName = "newBuilder")
public class AnimalLombok {

    public enum Sex{
        MALE,
        FEMALE
    }


    /*
        pedigreeCode campo obbligatori e non modifica
     */
    private final String id;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPedigreeName() {
        return pedigreeName;
    }

    public void setPedigreeName(String pedigreeName) {
        this.pedigreeName = pedigreeName;
    }

    public String getId() {
        return id;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public Boolean getVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Boolean getChampion() {
        return isChampion;
    }

    public void setChampion(Boolean champion) {
        isChampion = champion;
    }

    public List<String> getSons() {
        return sons;
    }

    public void setSons(List<String> sons) {
        this.sons = sons;
    }

    public Animal.Sex getSex() {
        return sex;
    }

    public void setSex(Animal.Sex sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }



    public AnimalLombok(String name, String pedigreeName, String id, String owner, String race, String residence, Boolean isVaccinated, Boolean isChampion, List<String> sons, Animal.Sex sex, Double weight, Double height) {
        this.name = name;
        this.pedigreeName = pedigreeName;
        this.id = id;
        this.owner = owner;
        this.race = race;
        this.residence = residence;
        this.isVaccinated = isVaccinated;
        this.isChampion = isChampion;
        this.sons = sons;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
    }

    public AnimalLombok(String id,String name,  String pedigreeName) {
        this.name = name;
        this.pedigreeName = pedigreeName;
        this.id = id;
    }

    public AnimalLombok(String id, String owner, String race, String residence) {
        this.id = id;
        this.owner = owner;
        this.race = race;
        this.residence = residence;
    }

    public AnimalLombok(String id){
        this.id = id;
    }


}
