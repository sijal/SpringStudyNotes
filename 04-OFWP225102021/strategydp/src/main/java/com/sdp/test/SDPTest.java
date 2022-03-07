package com.sdp.test;

import com.sdp.beans.MessageWriter;

public class SDPTest {
	public static void main(String[] args) {
		MessageWriter messageWriter = new MessageWriter();
		messageWriter.writeMessage("Welcome to Strategy Design Pattern");
	}
}
