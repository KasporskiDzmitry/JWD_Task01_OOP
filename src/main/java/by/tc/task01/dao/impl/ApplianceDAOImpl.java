package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.Reader;
import by.tc.task01.dao.creator.ApplianceDirector;
import by.tc.task01.dao.creator.Command;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final Reader reader = new Reader();
    private Map<String, Object> newMap = new HashMap<>();
    private final ApplianceDirector applianceDirector = new ApplianceDirector();

    public <E> Appliance find(Criteria<E> criteria) throws DAOException {
        newMap = reader.readFile(criteria);
        if (newMap == null) {
            return null;
        }
        Command command = applianceDirector.getCommand(criteria.getApplianceType());
        return command.execute(newMap);
    }


}