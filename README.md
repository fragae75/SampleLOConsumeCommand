# SampleLOConsumeCommand

Sample application for Datavenue Live Objects : https://liveobjects.orange-business.com/#/liveobjects

It is a simple sample that collect/answer commands from Live Objects as a MQTT device ("json+device").

The sample will subscribe on the dev/cmd topic.

The sample will be visible in the Live Objects Park as the sensor SampleLO001. Select it and send it a command (menu "Commands"). The sample will receive it on dev/cmd and it will answer on the dev/cmd/res topic with 3 fields : 
- msg : "hello friend!"
- method : the command you have sent
- counter : should be 0 unless the platform have made some retry

The Commands API are available through the swagger (https://liveobjects.orange-business.com/#/faq, menu "Developer guide") at the entry "Device management command"<br>


<h2> Installation notes </h2>

1) Create an account on Live Objects. You can get a free account (10 MQTT devices for 1 year) at : https://liveobjects.orange-business.com/#/request_account <br>
Don't check "Lora" otherwise the account will not be instantly created.

2) Generate your API key : menu Configuration/API Keys click on "Add"

3) Create a MyKey class : <br>


	package com.test.SampleLOSendData; 
	
	public final class MyKey { 
		static String key = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"; 
	}


4) You will find into the repository 4 jar files into the /lib. Add them as "external JARs" into you IDE (eg Eclipse).
