package com.springjerseydemo.impl;

import com.springjerseydemo.model.Demo;
import com.springjerseydemo.service.DemoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("demoService")
public class DemoServiceImpl implements DemoService {

	public Demo loadRandom() {
		Demo demo = new Demo();
		demo.setKey("name");
		demo.setValue("Ramazan");
		return demo;
	}

}
