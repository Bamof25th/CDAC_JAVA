package com.customer.utils;

import com.customer.handlers.CmsException;

public class PlanValidator {
	public static Plans planAndRegValidator(String plan, double regamt) throws CmsException {

		Plans p = Plans.valueOf(plan.toUpperCase());
		if (p.getPlanRate() != regamt) {
			throw new CmsException("Plan selected according to you reg amt is " + plan);
		}
		return p;
	}
}
