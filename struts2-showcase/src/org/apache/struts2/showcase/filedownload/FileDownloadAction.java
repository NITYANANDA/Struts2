/*
 * $Id: FileDownloadAction.java 1400220 2012-10-19 18:49:39Z jogep $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.struts2.showcase.filedownload;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

/**
 * Demonstrates file resource download. Set filePath to the local file resource
 * to download, relative to the application root ("/images/struts.gif").
 */
public class FileDownloadAction implements Action {

	private String inputPath;

	public String execute() throws Exception {
		return SUCCESS;
	}

	public void setInputPath(String value) {
		inputPath = value;
	}

	public InputStream getInputStream() throws Exception {
		return ServletActionContext.getServletContext().getResourceAsStream(
				inputPath);
	}
}
