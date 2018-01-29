package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class RefrigeratorCreator implements Command {

    private static RefrigeratorCreator instance = new RefrigeratorCreator();

    public static RefrigeratorCreator getInstance() {
        return instance;
    }

    @Override
    public Appliance execute (Map<String, Object> mapFromDB) {
        Refrigerator refrigerator = new Refrigerator();

        refrigerator.setWeight(Double.parseDouble(String.valueOf(mapFromDB.get("WEIGHT"))));
        refrigerator.setWidth(Double.parseDouble(String.valueOf(mapFromDB.get("WIDTH"))));
        refrigerator.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        refrigerator.setHeight(Double.parseDouble(String.valueOf(mapFromDB.get("HEIGHT"))));
        refrigerator.setOverallCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("OVERALL_CAPACITY"))));
        refrigerator.setFreezerCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("FREEZER_CAPACITY"))));

        return refrigerator;
    }
}
