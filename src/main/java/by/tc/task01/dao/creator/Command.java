package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public interface Command {

    Appliance execute (Map<String, Object> mapFromDB);
}
