package by.tc.task01.dao;

import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дима on 29.10.2017.
 */
public class ReaderDAO{

    private File file = new File(".\\src\\main\\resources\\appliances_db.txt");
    private FileReader fr;
    private ArrayList<String> keys = new ArrayList<>();
    private ArrayList<Object> values = new ArrayList<>();
    private Map<String, Object> mapFromDB = new HashMap<>();
    private String editedStr;
    private String[] editedStrArrayView;
    private String str;
    private int numberOfMatches;
    private boolean match;

    public Map<String, Object> readFile(Criteria criteria) {
        mapFromDB.clear();
        str = "";
        match = false;

        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (str != null | match) {
                str = br.readLine();
                if (str != null && str.contains(criteria.getApplianceType())) {
                    editLine(str, criteria);
                }
                if (compareTwoMaps(criteria,mapFromDB)) {
                    match = true;
                    return mapFromDB;
                } else {
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private void editLine(String str, Criteria criteria) {
        editedStr = str.substring(criteria.getApplianceType().length() + 3, str.length() - 1);
        editedStrArrayView = editedStr.split("=|\\,\\ ");
        for (int i = 0; i < editedStrArrayView.length; i++) {
            if (i % 2 == 0) {
                keys.add(editedStrArrayView[i]);
            } else {
                values.add(editedStrArrayView[i]);
            }
        }
        for (int j = 0; j < keys.size(); j++) {
            mapFromDB.put(keys.get(j), values.get(j));
        }
        keys.clear();
        values.clear();
    }

    private <E> boolean compareTwoMaps(Criteria<E> criteria, Map<String, Object> mapFromDB) {
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
