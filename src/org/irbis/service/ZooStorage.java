package org.irbis.service;

import org.irbis.entity.Animal;

import java.util.List;

public class ZooStorage {

    private Animal[] animals;

    private LineParser lineParser;

    public ZooStorage(LineParser lineParser) {
        this.lineParser = lineParser;
    }

    public void fillInfoFromOrder(String orderFilePath) {
        List<String> lines = FileReader.readAllLines(orderFilePath);
        animals = new Animal[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            animals[i] = lineParser.parseAnimal(line);
        }
    }

    public Animal[] getAnimalsFromCountry(String country) {
        // write your code here
        return null;
    }

}
