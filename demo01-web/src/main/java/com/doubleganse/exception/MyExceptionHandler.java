package com.doubleganse.exception;

import com.alibaba.fastjson.JSON;
import com.doubleganse.demo.bean.JsonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenm on 2016/9/11 0011.
 */
@ControllerAdvice
public class MyExceptionHandler {

		@ResponseBody
	    @ExceptionHandler({ArithmeticException.class})
	    public String handException(Exception e){
	        System.out.println("handException "+e.getLocalizedMessage());
	        return JSON.toJSONString(JsonResponse.failed(e.getMessage()));
	    }
}
