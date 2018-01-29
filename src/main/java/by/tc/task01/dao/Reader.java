package by.tc.task01.dao;

import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.criteria.Criteria;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дима on 29.10.2017.
 */
public class Reader {

    private final File file = new File(".\\src\\main\\resources\\appliances_db.txt");
    private FileReader fr;
    private final LineParser lineParser = new LineParser();
    private final Comparator comparator = new Comparator();
    private Map<String, Object> mapFromDB = new HashMap<>();
    private String str;
    private boolean match;

    public Map<String, Object> readFile(Criteria criteria) throws DAOException {
        mapFromDB.clear();
        str = "";
        match = false;

        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while (str != null | match) {
                str = br.readLine();
                if (str != null && str.contains(criteria.getApplianceType())) {
                    mapFromDB = lineParser.parseLine(str, criteria);
                }
                if (comparator.compareTwoMaps(criteria,mapFromDB)) {
                    match = true;
                    return mapFromDB;
                } else {
                    continue;
                }
            }
        } catch (FileNotFoundException e) {
            throw new DAOException("Файл не найден");
        } catch (IOException e) {
            throw new DAOException("Ошибка при работе с файлом");
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new DAOException("Ошибка при закрытии файла");
            }
        }
        return null;
    }
}
