package org.mvc.ajax;

import org.springframework.web.context.request.WebRequest;

public class AjaxUtils {

	public boolean isAjaxRequest(WebRequest webRequest) {
		String header = webRequest.getHeader("X-Requested-With");
		return header != null ? "XMLHttpRequest".equals(header) : false;
	}

	public boolean isAjaxUploadRequest(WebRequest webRequest) {
		return webRequest.getParameter("ajaxUpload") != null;
	}

}
