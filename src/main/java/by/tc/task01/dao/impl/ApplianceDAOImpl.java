package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ReaderDAO;
import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {

    ApplianceCreator applianceCreator = new ApplianceCreator();


    ReaderDAO readerDAO = new ReaderDAO();
    Map<String, Object> newMap = new HashMap<>();

    public <E> Appliance find(Criteria<E> criteria) {
        newMap = readerDAO.readFile(criteria);
        if (newMap == null) {
            return null;
        }
        return applianceCreator.createApp(criteria, newMap);
    }


}