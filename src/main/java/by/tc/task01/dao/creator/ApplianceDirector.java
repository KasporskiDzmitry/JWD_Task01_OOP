package by.tc.task01.dao.creator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дима on 17.10.2017.
 */
public class ApplianceDirector {

    private Map<String, Command> commands = new HashMap<>();

    public ApplianceDirector(){
        commands.put("Oven", OvenCreator.getInstance());
        commands.put("Laptop", LaptopCreator.getInstance());
        commands.put("Refrigerator", RefrigeratorCreator.getInstance());
        commands.put("Speakers", SpeakersCreator.getInstance());
        commands.put("TabletPC", TabletPCCreator.getInstance());
        commands.put("VacuumCleaner", VacuumCleanerCreator.getInstance());
    }


    public Command getCommand(String applianceType) {
        Command command;
        command = commands.get(applianceType);
        return command;
    }
}
