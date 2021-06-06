# DemoWebShop

# Test Scenarios

**High Risk Scenarios:**

- All the tabs and links on the website landing page should be working as it is the first page a user sees and navigates to different tabs to explore products or functionality 
- A customer should be able to place an order by searching it as a guest as it is one of the most important functionality to be able to order a product without having to create an account
- A customer should be able to register itself and place one/multiple orders by exploring the application as the user should be able to register itself and order multiple times/track orders etc.
- A customer should be able to edit or remove items from the cart and the the cart should be updated accordingly as it is one of the most used functions during order placement 
- A customer should be able login with valid credentials and should be able to track down it's order or use other functionalities

- I choose to automate the tabs check on the landing website page to make sure that all the tabs are functional
- I choose to automate one end to end test case where the user is able to order a product without having to register itself

#Pre-requisites
*Install and setup the following on the local machine
- Eclipse Editor
- Maven
- JDK

#Set up of project
- Download the project from this location https://github.com/priti-mini07/DemoWebShop.git
- Import it into the eclipse workspace as a Maven project
- Add Juit for run configuration
- Setup the paths of the feature file referred in this file MyTestRunner at the location "Users/***/eclipse-workspace/DemoWebShop/src/test/java/testrunners/MyTestRunner.java"
to match the actual path in your workspace i.e. "Users/***/eclipse-workspace/DemoWebShop/src/test/resources/features"
- Double check the config.properties file is placed at "./src/test/resources/config/config.properties"

#Run the test

- Right click on the MyTest.Runner file and Run As Junit

#Report
- After run refresh the project and look for this file "eclipse-workspace/DemoWebShop/test-output/SparkReport/Index.html"
