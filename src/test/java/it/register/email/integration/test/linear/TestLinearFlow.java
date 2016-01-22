package it.register.email.integration.test.linear;

import java.util.ArrayList;

import org.junit.Test;

import it.register.common.pathfinder.exception.IntegrationTestException;
import it.register.common.pathfinder.factory.ContextFactory;
import it.register.common.pathfinder.factory.IContextFactory;
import it.register.common.pathfinder.flow.IAction;
import it.register.common.pathfinder.flow.linear.IFlowLinear;
import it.register.common.pathfinder.test.BaseRunnerFlow;
import it.register.email.integration.test.flows.WebmailLoginFlow;

public class TestLinearFlow extends BaseRunnerFlow{
	
	@Test
	public void testWebmailLoginFlow() throws IntegrationTestException {
		ArrayList<IFlowLinear> flows = new ArrayList<IFlowLinear>();
		flows.add(new WebmailLoginFlow());
		
		executeFlow(flows);
	}

	@Override
	public IContextFactory getContextFactory() {
		return new ContextFactory();
	}

	@Override
	public IAction getRollbackAction() {
		// TODO Auto-generated method stub
		return null;
	}
}
