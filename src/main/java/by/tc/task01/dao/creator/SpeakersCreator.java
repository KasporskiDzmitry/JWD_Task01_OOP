package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class SpeakersCreator extends ApplianceCreator implements Creator {

    @Override
    public Appliance create(Map<String, Object> mapFromDB) {
        Speakers speakers = new Speakers();

        speakers.setNumberOfSpeakers(Double.parseDouble(String.valueOf(mapFromDB.get("NUMBER_OF_SPEAKERS"))));
        speakers.setCordLength(Double.parseDouble(String.valueOf(mapFromDB.get("CORD_LENGTH"))));
        speakers.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        speakers.setFrequencyRange(String.valueOf(mapFromDB.get("FREQUENCY_RANGE")));

        return speakers;
    }
}
