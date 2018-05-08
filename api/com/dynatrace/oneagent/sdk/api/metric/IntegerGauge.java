package com.dynatrace.oneagent.sdk.api.metric;

public interface IntegerGauge extends Metric {

	/**
	 * Sets the current value
	 * 
	 * @param currentValue
	 *            the current value
	 * @param dimension
	 *            optional dimension. e. g. name of the concerned resource (disk
	 *            name, page name, ...). Parameter is optional - set to null if 
	 *            no dimension should be reported.
	 */
	void setValue(long currentValue, String dimension);

}
