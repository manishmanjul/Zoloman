package com.zm.core.features;

@FunctionalInterface
public interface TaskPerformer <T, R>{

	public static final String SPECIAL_CHARS= "!@#$%&*";
	public static final int SPECIAL_CHAR_COUNT = 7;
	R perform(T t);
}
