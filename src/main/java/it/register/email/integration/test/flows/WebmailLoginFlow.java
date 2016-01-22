package it.register.email.integration.test.flows;

import it.register.common.pathfinder.flow.linear.FlowManagerAction;
import it.register.common.pathfinder.flow.linear.IFlowLinear;
import it.register.email.integration.test.actions.LoginAction;

public class WebmailLoginFlow implements IFlowLinear {

	public FlowManagerAction getFlow() {
		
		FlowManagerAction flowManager = new FlowManagerAction();
		flowManager.addAction(new LoginAction());
	
		return flowManager;
	}

}
