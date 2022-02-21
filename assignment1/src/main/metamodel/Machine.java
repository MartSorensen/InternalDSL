package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



public class Machine {
	private List<State> states = new ArrayList<State>();
	private List<String> variables = new ArrayList<String>();
	private State initialState;
	private State state;
	
	public Machine(Collection<State> states, State initialState) {
		super();
		this.states.addAll(states);
		this.initialState = initialState;
	}
	
	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
	}

	public State getState(String string) {
		// TODO Auto-generated method stub
		if(!states.contains(string))  states.add(new State(string));
		return states.get(0);
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return variables.size();
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		if (variables.size()>0)
		return true;
		else return false;
	}

}
