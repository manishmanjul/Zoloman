package com.zm.core.features.mapimpl;

public class Key {
	
	private String keyStr = null;
	
	private long hash=0l;

	Key(String val){
		this.keyStr = val;
	}
	
	public String getKeyStr() {
		return keyStr;
	}

	public void setKeyStr(String keyStr) {
		this.keyStr = keyStr;
	}

	public long getHash() {
		return hash;
	}

	public void setHash(long hash) {
		this.hash = hash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((keyStr == null) ? 0 : (int)keyStr.charAt(0));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (keyStr == null) {
			if (other.keyStr != null)
				return false;
		} else if (!keyStr.equals(other.keyStr))
			return false;
		return true;
	}	

}
