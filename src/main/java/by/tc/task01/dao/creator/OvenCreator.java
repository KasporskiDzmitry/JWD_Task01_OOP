package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class OvenCreator extends ApplianceCreator implements Creator {

    private Oven oven;


    public Appliance create(Map<String, Object> mapFromDB) {
        oven = new Oven();

        oven.setWeight(Double.parseDouble(String.valueOf(mapFromDB.get("WEIGHT"))));
        oven.setWidth(Double.parseDouble(String.valueOf(mapFromDB.get("WIDTH"))));
        oven.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        oven.setHeight(Double.parseDouble(String.valueOf(mapFromDB.get("HEIGHT"))));
        oven.setDepth(Double.parseDouble(String.valueOf(mapFromDB.get("DEPTH"))));
        oven.setCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("CAPACITY"))));

        return oven;
    }
}
