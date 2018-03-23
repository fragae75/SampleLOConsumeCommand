package com.test.SampleLOConsumeCommand;

import java.util.Random;


/*
 * 
 * This Sample simulates a device that is listening to commands and reply to validate its reception
 * 
 * You can test the sending of the command from the LO portal {"Key1":"\"string_value\"","key2":"7890"}
 * 
 * 
 */

public class SampleLOConsumeCommand {

	/*
	 * doSubscribeDeviceTopics() : create a thread that subscribe to topics
	 */
	public static void doSubscribeDeviceTopics(String sTopicName, String sAPIKey, String sServerAddress, String sDeviceUrn)
	{
		Thread t;
		RunConsumeCommands consumeCommands = new RunConsumeCommands(sTopicName, sAPIKey, sServerAddress, sDeviceUrn);

		t = new Thread(consumeCommands);
		t.start();
        System.out.println("Thread : consume Commands" + sTopicName);
	}
	
	public static void main(String[] args) {

        String API_KEY = MyKey.key; // <<< REPLACE WITH valid API key value>>>

        String SERVER = "tcp://liveobjects.orange-business.com:1883";
        String DEVICE_URN = "urn:lo:nsid:sensor:SampleLO001";

        // Subscribe to the router : "dev/cmd"
        doSubscribeDeviceTopics("dev/cmd", API_KEY, SERVER, DEVICE_URN);
        
	}
}
