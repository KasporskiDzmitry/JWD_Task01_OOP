package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class LaptopCreator implements Command {
    private static LaptopCreator instance = new LaptopCreator();

    public static LaptopCreator getInstance() {
        return instance;
    }

    @Override
    public Appliance execute (Map<String, Object> mapFromDB) {
        Laptop laptop = new Laptop();

        laptop.setOs(String.valueOf(mapFromDB.get("OS")));
        laptop.setMemoryRom(Double.parseDouble(String.valueOf(mapFromDB.get("MEMORY_ROM"))));
        laptop.setDisplayInchs(Double.parseDouble(String.valueOf(mapFromDB.get("DISPLAY_INCHS"))));
        laptop.setCpu(Double.parseDouble(String.valueOf(mapFromDB.get("CPU"))));
        laptop.setBatteryCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("BATTERY_CAPACITY"))));

        return laptop;
    }
}
