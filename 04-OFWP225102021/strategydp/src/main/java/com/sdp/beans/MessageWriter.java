package com.sdp.beans;

public class MessageWriter {
	private IMessageFormatter messageFormatter;
	
	public void writeMessage(String message) {
		String cMessage = null;
		
		messageFormatter = new HTMLMessageFormatterImpl();
		cMessage = messageFormatter.formatMessage(message);
		System.out.println(cMessage);
	}
}
