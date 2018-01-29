package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дима on 29.01.2018.
 */
public class LineParser {

    private String editedLine;
    private String[] editedLineArrayView;
    private String splitter = "=|\\,\\ ";
    private ArrayList<String> keys = new ArrayList<>();
    private ArrayList<Object> values = new ArrayList<>();
    private Map<String, Object> mapFromDB = new HashMap<>();

    public Map<String, Object> parseLine(String line, Criteria criteria) {

        editedLine = line.substring(criteria.getApplianceType().length() + 3, line.length() - 1);
        editedLineArrayView = editedLine.split(splitter);
        for (int i = 0; i < editedLineArrayView.length; i++) {
            if (i % 2 == 0) {
                keys.add(editedLineArrayView[i]);
            } else {
                values.add(editedLineArrayView[i]);
            }
        }
        for (int j = 0; j < keys.size(); j++) {
            mapFromDB.put(keys.get(j), values.get(j));
        }
        keys.clear();
        values.clear();
        return mapFromDB;
    }
}
