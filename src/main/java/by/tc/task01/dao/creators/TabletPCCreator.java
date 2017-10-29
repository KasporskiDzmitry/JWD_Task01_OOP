package by.tc.task01.dao.creators;

import by.tc.task01.dao.creators.creatorInterface.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class TabletPCCreator extends ApplianceCreator implements Creator {
    TabletPC tabletPC = new TabletPC();


    @Override
    public Appliance create(Map<String, Object> mapFromDB) {
        tabletPC.setMemoryRom(Double.parseDouble(String.valueOf(mapFromDB.get("MEMORY_ROM"))));
        tabletPC.setFlashMemoryCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("FLASH_MEMORY_CAPACITY"))));
        tabletPC.setDisplayInches(Double.parseDouble(String.valueOf(mapFromDB.get("DISPLAY_INCHES"))));
        tabletPC.setColor(String.valueOf(mapFromDB.get("COLOR")));
        tabletPC.setBatteryCapacity(Double.parseDouble(String.valueOf(mapFromDB.get("BATTERY_CAPACITY"))));

        return tabletPC;
    }
}
