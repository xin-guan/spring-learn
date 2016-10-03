package com.doubleganse.exception;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  @author mingjun chen
 */
public class OverallExceptionResolver implements HandlerExceptionResolver {

	/**
	 * 进行全局异常的过滤和处理
	 */
	@ResponseBody
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		//handler为当前处理器适配器执行的对象
		String message = null;
		//判断是否为系统自定义异常。
		if (ex instanceof CustomException) {
			message = ex.getMessage();
		} else {
			message = "系统出错啦，稍后再试试！";
		}

		ModelAndView modelAndView = new ModelAndView();
		//跳转到相应的处理页面
		modelAndView.addObject("errorMsg", message);
		return modelAndView;
	}

}
