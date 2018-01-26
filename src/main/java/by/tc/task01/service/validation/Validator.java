package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteriaByValue;
import by.tc.task01.service.exception.ValidationException;

import java.util.Map;

public class Validator {

	public static <E> boolean criteriaValidator(Criteria<E> criteria) throws ValidationException {
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
                        throw new ValidationException("Неверное значение параметра " + key.toString() + ": " + valueOfKey);
                    }
                }
            }
        }
		return true;
	}

}