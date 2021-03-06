package com.giridhari.preachingassistant.model;

public enum Response {
	
	CALL_AGAIN("CALL AGAIN"),
	COMING("COMING"),
	DOUBTFUL("DOUBTFUL"),
	NOT_COMING("NOT COMING"),
	WRONG_NUMBER("WRONG NUMBER"),
	NOT_REACHABLE("NOT REACHABLE"),
	WILL_COME_LATER("WILL COME LATER"),
	REMOVE_ME("REMOVE ME");
	
	private final String response;
	
	private Response(String response) {
		this.response = response;
	}
	
	@Override
	public String toString() {
		return response;
	}
	
}