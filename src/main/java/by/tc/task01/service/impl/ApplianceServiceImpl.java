package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.exception.ValidationException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{


	public <E> Appliance find(Criteria<E> criteria) {

		System.out.println("--------------------------НОВЫЙ ЗАПРОС--------------------------------");

		try {
			Validator.criteriaValidator(criteria);
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		Appliance appliance = null;
		try {
			appliance = applianceDAO.find(criteria);
		} catch (DAOException e) {
			System.out.println(e.getMessage());
		}
		criteria.getCriteria().clear();
		
		return appliance;
	}

}
