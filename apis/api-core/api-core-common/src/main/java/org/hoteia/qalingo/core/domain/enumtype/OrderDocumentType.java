/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.domain.enumtype;

/**
 * 
 */
public enum OrderDocumentType {

	/**
	 * 
	 */
    ORDER_CONFIRMATION("ORDER_CONFIRMATION"),
	
	/**
	 * 
	 */
    SHIPPING_CONFIRMATION("SHIPPING_CONFIRMATION"),
	
    /**
     * 
     */
    INVOICE("INVOICE");
    	
	private String propertyKey = "";

	/**
	 * Constructor.
	 * 
	 * @param propertyKey the property key.
	 */
	OrderDocumentType(final String propertyKey) {
		this.propertyKey = propertyKey;
	}

	/**
	 * Get the localization property key.
	 * 
	 * @return the localized property key
	 */
	public String getPropertyKey() {
		return this.propertyKey;
	}
}
