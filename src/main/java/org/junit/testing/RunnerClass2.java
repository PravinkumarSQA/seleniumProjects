package org.junit.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass2 {
	
	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(JunitPart3Challenge.class,JunitPart1Challenge.class,JunitPart4Challenge.class);
		
		System.out.println("TC Run count : " + rc.getRunCount());
		System.out.println("TC Run time :" + rc.getRunTime());
		System.out.println("TC failed count : " + rc.getFailureCount());
		System.out.println("TC Ignored count : " + rc.getIgnoreCount());
		
		List<Failure> f = rc.getFailures();
		
		for (Failure failure : f) {
			System.out.println(failure);
		}
	}

}
