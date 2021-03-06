/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_6200.testdb322.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.test_6200.testdb322.*;

/**
 * Service object for domain model class Table2.
 * @see com.test_6200.testdb322.Table2
 */

public interface Table2Service {

	/**
	 * Finds all table2s.
	 * 
	 * @return A list of table2s.
	 */
	public Page<Table2> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Table2> findAll(Pageable pageable);
	
	/**
	 * Finds table2 by id.
	 * 
	 * @param id
	 *            The id of the wanted table2.
	 * @return The found table2. If no table2 is found, this method returns
	 *         null.
	 */
	public Table2 findById(Integer id) throws
	 EntityNotFoundException;

	/**
	 * Retrieve the total count of the table2s in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the table2.
	 */

	public long countAll();


    public Page<Table2> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

