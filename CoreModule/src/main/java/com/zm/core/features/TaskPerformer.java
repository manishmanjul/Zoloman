package com.zm.core.features;

public interface TaskPerformer <T, R>{

	R perform(T t);
}
