package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class SpeakersCreator implements Command {

    private static SpeakersCreator instance = new SpeakersCreator();

    public static SpeakersCreator getInstance() {
        return instance;
    }

    @Override
    public Appliance execute(Map<String, Object> mapFromDB) {
        Speakers speakers = new Speakers();

        speakers.setNumberOfSpeakers(Double.parseDouble(String.valueOf(mapFromDB.get("NUMBER_OF_SPEAKERS"))));
        speakers.setCordLength(Double.parseDouble(String.valueOf(mapFromDB.get("CORD_LENGTH"))));
        speakers.setPowerConsumption(Double.parseDouble(String.valueOf(mapFromDB.get("POWER_CONSUMPTION"))));
        speakers.setFrequencyRange(String.valueOf(mapFromDB.get("FREQUENCY_RANGE")));

        return speakers;
    }
}
