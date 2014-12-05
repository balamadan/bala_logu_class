package com.example.basic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcess implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String name)
			throws BeansException {
		System.out.println(" After Name = "+name);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name)
			throws BeansException {
		System.out.println(" Before Name = "+name);
		return obj;
	}

}
