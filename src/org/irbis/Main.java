package org.irbis;

import org.irbis.entity.Animal;
import org.irbis.service.LineParser;
import org.irbis.service.ZooStorage;
import org.irbis.service.ZooStorageValidator;


public class Main {

    public static final String ORDER_FILE_PATH = "информационный_лист.csv";
    public static final String NAKLADNAYA_PATH = "накладная.txt";

    public static void main(String[] args) {
        LineParser lineParser = new LineParser();

        ZooStorage zooStorage = new ZooStorage(lineParser);
        zooStorage.fillInfoFromOrder(ORDER_FILE_PATH);

        String russianCountry = "Russia";

        Animal[] animalsFromRussia = zooStorage.getAnimalsFromCountry(russianCountry);


        ZooStorageValidator zooStorageValidator = ZooStorageValidator.buildValidator(lineParser, NAKLADNAYA_PATH);
        zooStorageValidator.validateAnimalsCountFromCountry(russianCountry, animalsFromRussia.length);
    }
}
