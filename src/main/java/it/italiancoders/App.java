package it.italiancoders;

import it.italiancoders.model.Animal;
import it.italiancoders.model.AnimalBuilder;
import it.italiancoders.model.AnimalLombok;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //instance di oggetto pluto commettendo un errore nel passare i parametri
        //odio i costruttori
        Animal pluto = new Animal("0000001","pluto", "123",
                "labrador", "Marco Rossi", "Via x", true, false,
                null, Animal.Sex.MALE, 40.5, 30.0);

        Animal pluto2 = AnimalBuilder.newBuilder("0000001")
                .name("0000001")
                .pedigreeName("PlutoSecondo")
                .owner("Marco Rossi")
                .race("labrador")
                .residence("Via x")
                .isVaccinated(true)
                .isChampion(false)
                .sons(null)
                .sex(Animal.Sex.MALE)
                .weight(40.5)
                .height(30.0)
                .build();


        AnimalBuilder animalBuilder = AnimalBuilder.newBuilder("0000001")
                .name("0000001")
                .pedigreeName("PlutoSecondo")
                .owner("Marco Rossi")
                .race("labrador")
                .residence("Via x")
                .isVaccinated(true)
                .isChampion(false)
                .sons(null)
                .sex(Animal.Sex.MALE)
                .weight(40.5)
                .height(30.0);

        Animal animal3A = animalBuilder.build();
        Animal animal3B = animalBuilder.sex(Animal.Sex.FEMALE).build();

        AnimalLombok plutoLombok = AnimalLombok.newBuilder()
                .id("0000001")
                .name("0000001")
                .pedigreeName("PlutoSecondo")
                .owner("Marco Rossi")
                .race("labrador")
                .residence("Via x")
                .isVaccinated(true)
                .isChampion(false)
                .sons(null)
                .sex(Animal.Sex.MALE)
                .weight(40.5)
                .height(30.0)
                .build();

    }
}
