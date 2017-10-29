package by.tc.task01.dao.creators;

import by.tc.task01.dao.creators.creatorInterface.Creator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class SpeakersCreator extends ApplianceCreator implements Creator {
    Speakers speakers = new Speakers();


    @Override
    public Appliance create(Map<String, Object> mapFromDB) {

        speakers.setNumberOfSpeakers(Double.parseDouble(String.valueOf(mapFromDB.get("NUMBER_OF_SPEAKERS"))));
        speakers.setCordLength(Double.parseDouble(String.valueOf(mapFromDB.get("CORD_LENGTH"))));
        speakers.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        speakers.setFrequencyRange(String.valueOf(mapFromDB.get("FREQUENCY_RANGE")));

        return speakers;
    }
}
