package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.formbean.LoginFormbean;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		LoginFormbean lf = (LoginFormbean) form;
		if ("admin".equals(lf.getUsername())
				&& "admin".endsWith(lf.getPassword())) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("error");
		}
	}

}
