package com.doubleganse.configration;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HttpPutFormContentFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * 相当于web.xml
 * @author mingjun
 *
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() { // 将DispatcherServlet映射到"/"
		return new String[]{"/*"};
	}

	@Override
	protected Filter[] getServletFilters() {
		// 支持PUT请求
		HttpPutFormContentFilter httpPutFormContentFilter = new HttpPutFormContentFilter();

		// 统一UTF-8编码
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		return new Filter[] {httpPutFormContentFilter, characterEncodingFilter};
	}
}
