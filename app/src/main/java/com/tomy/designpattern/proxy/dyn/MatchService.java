package com.tomy.designpattern.proxy.dyn;

import java.lang.reflect.Proxy;

public class MatchService {
	public MatchService() {

		IPersonBean joe = getPersonInfo("joe", "male", "running");

		IPersonBean OwnerProxy = getOwnerProxy(joe);

		System.out.println("Name is " + OwnerProxy.getName());
		System.out.println("Interests is " + OwnerProxy.getInterests());

		OwnerProxy.setInterests("Bowling");
		System.out.println("Interests are " + OwnerProxy.getInterests());
		OwnerProxy.setHotOrNotRating(50);
		System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());
		OwnerProxy.setHotOrNotRating(40);
		System.out.println("Rating is " + OwnerProxy.getHotOrNotRating());

		System.out.println("**************");

		IPersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		System.out.println("Interests are " + nonOwnerProxy.getInterests());
		nonOwnerProxy.setInterests("haha");
		System.out.println("Interests are " + nonOwnerProxy.getInterests());
		nonOwnerProxy.setHotOrNotRating(60);
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

	}

	IPersonBean getPersonInfo(String name, String gender, String interests) {
		IPersonBean person = new PersonBeanImpl();
		person.setName(name);
		person.setGender(gender);
		person.setInterests(interests);
		return person;
	}

	IPersonBean getOwnerProxy(IPersonBean person) {
		return (IPersonBean) Proxy.newProxyInstance(person.getClass()
                                                          .getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}

	IPersonBean getNonOwnerProxy(IPersonBean person) {
		return (IPersonBean) Proxy.newProxyInstance(person.getClass()
                                                          .getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}
}
