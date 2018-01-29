package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

/**
 * Created by Дима on 29.01.2018.
 */
public class Comparator {

    private int numberOfMatches;

    public <E> boolean compareTwoMaps(Criteria<E> criteria, Map<String, Object> mapFromDB) {
        numberOfMatches = 0;
        for (Map.Entry<E, Object> pair : criteria.getCriteria().entrySet()) {
            String keyFromCriteria = String.valueOf(pair.getKey());
            Object valueFromCriteria = pair.getValue();
            if (String.valueOf(valueFromCriteria).equalsIgnoreCase(String.valueOf(mapFromDB.get(keyFromCriteria)))) {
                numberOfMatches++;
            }
        }
        if (numberOfMatches == criteria.getCriteria().size()) {
            return true;
        } else {
            numberOfMatches = 0;
            return false;
        }
    }
}
