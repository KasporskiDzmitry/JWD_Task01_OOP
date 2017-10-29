package by.tc.task01.dao.creators.creatorInterface;

import by.tc.task01.entity.Appliance;
import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public interface Creator {

    Appliance create(Map<String, Object> mapFromDB);
}
