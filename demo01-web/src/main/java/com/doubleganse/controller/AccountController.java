package com.doubleganse.controller;

import com.doubleganse.demo.bean.JsonResponse;
import com.doubleganse.model.Account;
import com.doubleganse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author mingjun chen
 */
@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public JsonResponse login(String name, String password, HttpServletRequest request) {
		Account account = accountService.getByNameAndPassword(name, password);
		if (account == null) {
			return JsonResponse.failed("用户名或密码错误");
		} else {
			return JsonResponse.success("登陆成功").add(account);
		}
	}

}
