package com.zm.core.features;

@FunctionalInterface
public interface Acceptor <T>{

	void accept(T t);
}
