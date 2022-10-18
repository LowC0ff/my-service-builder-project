/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.portal.aop.AopService;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.portal.kernel.model.User;
import java.util.List;
import java.util.Objects;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
	},
	service = AopService.class
)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {
	public H7G5Entry addEntry(
		long h7g5FolderId, 
		String key,
		String name, 
		String description
		) throws PortalException {

User user = getUser();

if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
throw new PortalException("You are not test@liferay.com");
}
	return h7g5EntryLocalService.addEntry(h7g5FolderId, key, name, description);
}

public List<H7G5Entry> getByFolderId(
	long folderId
	) throws PortalException {

User user = getUser();

if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
throw new PortalException("You are not test@liferay.com");
}
	return h7g5EntryLocalService.findByH7G5FolderId(folderId);
}


public H7G5Entry getByKey(
	String key
	) throws PortalException {

User user = getUser();

if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
throw new PortalException("You are not test@liferay.com");
}
	return h7g5EntryLocalService.findByKey(key);
}


public List<H7G5Entry> getByName(String name) throws PortalException {

User user = getUser();

if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
throw new PortalException("You are not test@liferay.com");
}
	return h7g5EntryLocalService.findByName(name);
}


public H7G5Entry getByH_D_N(
	long h7g5FolderId, 
	String description, 
	String name
	) throws PortalException {

User user = getUser();

if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
throw new PortalException("You are not test@liferay.com");
}
	return h7g5EntryLocalService.findByH_D_N(h7g5FolderId, description, name);
}


public int countEntries() {
	return h7g5EntryLocalService.countEntries();
}
}

