package main;

import java.util.HashMap;
import java.util.Map;

import main.metamodel.*;

public class StateMachine {
	
	private Map<String,State> states = new HashMap<>();
	
	private State current;
	private State initial;
	private String currentEvent;
	private Map<String,Integer> integer = new HashMap<>();

	public Machine build() {
		return new Machine(states.values(),initial); 
	}
	
	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	
	public StateMachine state(String string) {
		
		current = getState(string);
		return this;
	}
	
	public StateMachine initial() {
		// TODO Auto-generated method stub
		initial = current;
		return this;
	}

	public StateMachine when(String string) {
		currentEvent = string;
		return this; 
	}

	public StateMachine to(String string) {
		Transition t = new Transition(currentEvent, getState(string));
		current.addTransition(t);
		return this;
	}

	public StateMachine integer(String name) {
		// TODO Auto-generated method stub
		if(!integer.containsKey(name)) integer.put(name, new Integer(name));
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		//integer = string;
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
