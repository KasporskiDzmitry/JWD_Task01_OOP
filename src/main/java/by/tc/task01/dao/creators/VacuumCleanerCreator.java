package by.tc.task01.dao.creators;

import by.tc.task01.dao.creators.creatorInterface.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class VacuumCleanerCreator extends ApplianceCreator implements Creator {
    VacuumCleaner vacuumCleaner = new VacuumCleaner();


    @Override
    public Appliance create(Map<String, Object> mapFromDB) {

        vacuumCleaner.setWandType(String.valueOf(mapFromDB.get("WAND_TYPE")));
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble(String.valueOf(mapFromDB.get("MOTOR_SPEED_REGULATION"))));
        vacuumCleaner.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        vacuumCleaner.setFilterType(String.valueOf(mapFromDB.get("FILTER_TYPE")));
        vacuumCleaner.setBagType(String.valueOf(mapFromDB.get("BAG_TYPE")));
        vacuumCleaner.setCleaningWidth(Double.parseDouble(String.valueOf(mapFromDB.get("CLEANING_WIDTH"))));

        return vacuumCleaner;
    }
}
