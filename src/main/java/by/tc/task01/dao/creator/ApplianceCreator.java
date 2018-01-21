package by.tc.task01.dao.creator;

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
            appliance = new OvenCreator().create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Laptop")) {
            appliance = new LaptopCreator().create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Refrigerator")) {
            appliance = new RefrigeratorCreator().create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("Speakers")) {
            appliance = new SpeakersCreator().create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("TabletPC")) {
            appliance = new TabletPCCreator().create(mapFromDB);
        }
        if (criteria.getApplianceType().equals("VacuumCleaner")) {
            appliance = new VacuumCleanerCreator().create(mapFromDB);
        }
        return appliance;
    }
}
