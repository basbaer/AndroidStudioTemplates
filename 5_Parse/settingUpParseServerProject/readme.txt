Setting up a new Parse Server for a new app

1. go to AWS
	> go to EC2
	> launch a new instance
		> go to 'AWS Marketplace' in the left menu
		> select 'Parse Server Certified by Bitnami'
			> fist window: continue
			> second window: choose the free Instance type (t2.micro) -> Review and Launch
			> Launch
				> Select 'Create a new key pair' in the dropdown-menu
				> give it a name
				> download it to the direcotry: C:\\key-pairs
				> launch it
					> click on the instance Id to get to the overview and wait til it's initialized

2. Convert keyPair with PUTTYGen
	(https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/putty.html)
	
		○ open on your Computer: All programms > PuTTY > PuttYgen
		-> in order to convert the key from a .pem file to a .ppk file
		○ Type of key generate: choose RSA
		○ click: Load
		○ select the .pem file (change in options to 'All Files(*.*)
		○ Click 'OK' and 'Save private key' -> Important: All keyPairs are saved in: C:\keyPairs
		-> Click 'yes' for saving it without passphrase (A passphrase on a private key is an extra layer of protection. Even if your private key is discovered, it can't be used without the passphrase. The downside to using a passphrase is that it makes automation harder because human intervention is needed to log on to an instance, or to copy files to an instance)
		○ choose the file name
		-> with this file it is now possible to use PuTTY as SSH client

3. Connecting to the Server (with PuTTY)
		○ open PuTTY
		○ Category pane: Session
			- go to AWS and click connect on the instance dashboard
				> copy the public DNS
			- In the hostname field, you need the user_name of the AMI and the public DNS:

				username: bitnami
				public DNS: is displayed in the connect window of AWS

				connect both with @
				-> Example: 
				bitnami@ec2-18-219-39-87.us-east-2.compute.amazonaws.com
		
			- set Port to 22
			- Connectction type: SSH
			
		○ Category pane: Connection
			- Seconds between keep alives: put 180
			
		○ Category pane: Connection > SSH > Auth
			- click on 'Browse'
			- select the .ppk file of the key pair
			
		○ Go back to Session
			-  give it a name in 'Saved Sessions' in order to open it later
			- save it
			
		○ click 'Open'

4.  find client key, appID and server
	-> to navigate through this panel also look the 'PuTTY_Shortcuts'
	
	Go to: stack > parse-dashboard and open config.json
	
	cd stack
	cd parse-dashboard
	vi config.json

5. Open Android-Studio

Option 1: open the template (already has implemented a log in Activity)

Option 2: Start a new project from skretch
	a. Start new project
		i. go to build.grade (Module: app) and copy in the dependencies:
		---------------------------------------------------------
		implementation "com.github.parse-community.Parse-SDK-Android:parse:<latests version>"
		--------------------------------------------------------
		current latest version: 1.24.1
		
		Look it up at: https://jitpack.io/#parse-community/Parse-SDK-Android


		iv. Go to build.gradle (Project: <your project>)
			- first 'repositories'
			-------------------------------
				repositories{
					mavenCentral()
				}
			--------------------------------

			- second 'repositories'
			-------------------------------
			google()
			mavenCentral()
			jcenter()
			maven {url "https://jitpack.io" }
			--------------------------------

		v. Go to manifest:
			- add permissions (above application):
			-------------------------------------------------------------------------
				<uses-permission android:name="android.permission.INTERNET"/>
				<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
				<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>
			--------------------------------------------------------------------------
			- add directly beneath <application
			-------------------------------------------------------------------------
				android:name=".StarterApplication"
				android:usesCleartextTraffic="true"
			-------------------------------------------------------------------------
			
		vi. Sync gradle again


	b. Go to MainActivity
	<connect with ParseServer>

	c. create a new class called 'StarterApplication'
	-> copy the whole code

6. Initialize the Server (with the data from the PuTTY panel)
		○ applicationId
		appID
		
		○ clientKey
		MasterKey
		
		○ server
		serverURL + '/' at the end:
		e.g.: http://18.219.39.87/parse/

9. Run the application

10. Checking if everything went right
	- Check if the Log shows for 'ParseResult' 'Succesful'

	- Check if the ExampleObject is on the server
		i. Copy the ServerURL

		ii. Replace the 'parse/' with 'apps'
	
		iii. Log in with the username and password from the PuTTY panel
	
		In your Dashboard under 'Browser' on the left side, should be the Object

11. Possilbe Errors:
	- Emulator: emulator: WARNING: AsyncSocketServer.cpp:99: Error when accepting host connectionError message: Unknown error

		Solution: use an other Emulator












	



















