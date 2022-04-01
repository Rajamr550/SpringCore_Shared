package com.zensar_1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChatApplication {
	
	private Map<String, Set<String>> userMaps;
	private Map<String, List<String>> messageMaps;
	
	
	public ChatApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ChatApplication(Map<String, Set<String>> userMaps, Map<String, List<String>> messageMaps) {
		super();
		this.userMaps = userMaps;
		this.messageMaps = messageMaps;
	}


	public Map<String, Set<String>> getUserMaps() {
		return userMaps;
	}
	public void setUserMaps(Map<String, Set<String>> userMaps) {
		this.userMaps = userMaps;
	}
	public Map<String, List<String>> getMessageMaps() {
		return messageMaps;
	}
	public void setMessageMaps(Map<String, List<String>> messageMaps) {
		this.messageMaps = messageMaps;
	}


	@Override
	public String toString() {
	
		return "ChatApplication [userMaps = " + userMaps + ", messageMaps=" + messageMaps + "]";
	}
	
	
}
