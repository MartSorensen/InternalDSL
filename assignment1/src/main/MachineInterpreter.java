package main;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	
	private Machine m;
	private State currentState;
	private State currentState;
	
	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.m = m;
		currentState = m.getInitialState();
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return currentState;
	}

	public void processEvent(String event) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(event)) {
				currentState = t.getTarget();
				return;
			}
		}
		System.err.println("Unhandled event "+event);
		
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
