package com.springcore.ai.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class OrderManager implements BeanFactoryAware {
	
	private IDelivery delService;
	private PersonInfo pinfo;
	private OrderInfo oinfo;
	private AddressInfo ainfo;
	
	private BeanFactory factory;
	
	public void setDelService(IDelivery delService) {
		this.delService = delService;
	}
	public void setPinfo(PersonInfo pinfo) {
		this.pinfo = pinfo;
	}
	public void setOinfo(OrderInfo oinfo) {
		this.oinfo = oinfo;
	}
	public void setAinfo(AddressInfo ainfo) {
		this.ainfo = ainfo;
	}

	public void processOrder() {
		if (ainfo != null) {
			long zipCode = ainfo.getZip();
			if (zipCode >= 5000) {
				// Get Bludedart obj
				delService = factory.getBean("bluedart", BlueDartDeliverService.class);
			} else {
				// Get DTDC obj
				delService = factory.getBean("dtdc", DTDCDeliverService.class);
			}
			delService.deliver(pinfo, oinfo, ainfo);
		}
	}
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("BeanFactoryAware");
		this.factory=factory;
		
	}
	

}
