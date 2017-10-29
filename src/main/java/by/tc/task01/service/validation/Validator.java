package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteriaByValue;

import java.util.Map;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
        String valueOfKey;
        char c;

		for (Map.Entry<E, Object> pair : criteria.getCriteria().entrySet()) {
			E key = pair.getKey();
			Object value = pair.getValue();

			//проверка на число
			if (SearchCriteriaByValue.numberCriteria.contains(key.toString())) {
                valueOfKey = value.toString();
                for (int i = 0; i < valueOfKey.length(); i++) {
                    c = valueOfKey.charAt(i);
                    if (!(c >= '0' && c <= '9' || c == '.')) {
                        System.out.println();
                        System.out.println("--------------------------NEW REQUEST--------------------------------");
                        System.out.println("Объект: " + criteria.getApplianceType());
                        System.out.println(key.toString() + " = " + valueOfKey + " [Неверное значение]");
                        return false;
                    }
                }
            }
        }
		return true;
	}

}

//you may add your own new classes