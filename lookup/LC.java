package com.aj.test.lookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("lc")
@Slf4j(topic = "e")
public class LC {

	public void printInfo() {
		LB lb = createb();
		log.debug("lb-[{}]", lb);
		lb = createb();
		log.debug("lb-[{}]", lb);
	}

	@Lookup
	public LB createb() {
		return null;
	}

}
