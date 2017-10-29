package by.tc.task01.dao.creators;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class ApplianceCreator{

    private Appliance appliance;

    public <E> Appliance createApp(Criteria<E> criteria, Map<String, Object> mapFromDB) {
        if (criteria.getApplianceType().equals("Oven")) {
            OvenCreator ovenCreator = new OvenCreator();
            appliance = ovenCreator.create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Laptop")) {
            LaptopCreator laptopCreator = new LaptopCreator();
            appliance = laptopCreator.create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Refrigerator")) {
            RefrigeratorCreator refrigeratorCreator = new RefrigeratorCreator();
            appliance = refrigeratorCreator.create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Speakers")) {
            SpeakersCreator speakersCreator = new SpeakersCreator();
            appliance = speakersCreator.create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("TabletPC")) {
            TabletPCCreator tabletPCCreator = new TabletPCCreator();
            appliance = tabletPCCreator.create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("VacuumCleaner")) {
            VacuumCleanerCreator vacuumCleanerCreator = new VacuumCleanerCreator();
            appliance = vacuumCleanerCreator.create(mapFromDB);
        }
        return appliance;
    }
}
