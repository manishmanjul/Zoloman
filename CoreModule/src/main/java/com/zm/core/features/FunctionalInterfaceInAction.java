package com.zm.core.features;

import java.util.ArrayList;
import java.util.Random;

public class FunctionalInterfaceInAction {

	private Checker<String> checker;
	private Checker<ArrayList<String>> finalChecker;
	private Producer<String> producer;
	private Acceptor<String> acceptor;
	private TaskPerformer<String, String> taskPerformer;	
	
	ArrayList<String> validPwdList = new ArrayList<String>();
	ArrayList<String> invalidPwdList = new ArrayList<String>();
	
	public FunctionalInterfaceInAction() {
		initProducer();
		initAcceptor();
		initTaskPerformer();
		initChecker();				
		initFinalChecker();
	}
	
	public Checker<String> getChecker() {
		return this.checker;
	}	
	
	public Producer<String> getProducer() {
		return producer;
	}

	public void setProducer(Producer<String> producer) {
		this.producer = producer;
	}

	public Acceptor<String> getAcceptor() {
		return acceptor;
	}

	public void setAcceptor(Acceptor<String> acceptor) {
		this.acceptor = acceptor;
	}

	public TaskPerformer<String, String> getTaskPerformer() {
		return taskPerformer;
	}

	public void setTaskPerformer(TaskPerformer<String, String> taskPerformer) {
		this.taskPerformer = taskPerformer;
	}

	public ArrayList<String> getValidPwdList() {
		return validPwdList;
	}

	public void setValidPwdList(ArrayList<String> validPwdList) {
		this.validPwdList = validPwdList;
	}

	public ArrayList<String> getInvalidPwdList() {
		return invalidPwdList;
	}

	public void setInvalidPwdList(ArrayList<String> invalidPwdList) {
		this.invalidPwdList = invalidPwdList;
	}	

	public Checker<ArrayList<String>> getFinalChecker() {
		return finalChecker;
	}

	public void setFinalChecker(Checker<ArrayList<String>> finalChecker) {
		this.finalChecker = finalChecker;
	}

	private void initProducer() {
		producer = () -> {
			StringBuffer result = new StringBuffer();
			Random random = new Random();
			int pwdLength = random.nextInt(Producer.PASSWORD_LENGTH-2)+5;
			
			for(int i=1;i<=pwdLength;i++) {
				int alphaOrNumber = random.nextInt(2);
				if(alphaOrNumber==Producer.GENERATE_ALPHA)
					result.append(Producer.alpha.charAt(random.nextInt(Producer.ALPHABET_COUNT)));
				else if(alphaOrNumber==Producer.GENERATE_NUMERIC)
					result.append(Producer.numbers.charAt(random.nextInt(Producer.NUMERIC_COUNT)));
			}
			return result.toString();
		};
	}
	
	private void initAcceptor() {
		acceptor = t -> {
			if(checker.check(t)) {
				String s = taskPerformer.perform(t);
				validPwdList.add(s);
			}				
			else
				invalidPwdList.add(t);
		};
	}
	
	private void initTaskPerformer() {
		taskPerformer = t -> {
			Random random = new Random();
			char[] stringInArray = t.toCharArray();
			stringInArray[random.nextInt(Producer.PASSWORD_LENGTH)] = 
					TaskPerformer.SPECIAL_CHARS.charAt(random.nextInt(TaskPerformer.SPECIAL_CHAR_COUNT));
			return String.valueOf(stringInArray); 
		};
	}
	
	private void initChecker() {
		checker = t -> t.length() == Checker.LENGTH_TO_CHECK;
	}
	
	private void initFinalChecker() {
		finalChecker = l -> l.size()<Checker.MAX_PWD_COUNT?true:false;
	}
	
	public static void main(String args[]) {
		FunctionalInterfaceInAction app = new FunctionalInterfaceInAction();
		
		while(app.finalChecker.check(app.getValidPwdList())) {
			String password = app.producer.produce();
			app.acceptor.accept(password);
		}
		
		for(String s : app.getValidPwdList()) {
			System.out.println(s);
		}
		
		System.out.println("Invalid Password count : " + app.getInvalidPwdList().size());
	}
	
}
