# Steps to run Servlet/JSP application in Eclipse IDE
Pre-requistics - Apache Tomcat Server (or any other server) installed and configured properly 
### Servlets
1. Open Eclipse IDE
2. Goto File -> New -> Dynamic Web Application
3. Give any name for the Project , for example - ServletCalculator


![image](https://drive.google.com/uc?export=view&id=1VZ2koizWeziF1RexKcTmQLR_8EQMEcJ8)

4. Click on next, there are no changes to made here, click next again.
5. Make sure that the checkbox generation web.xml deployment descriptor
6. Click on finish, this will create the project

![image](https://drive.google.com/uc?export=view&id=1Xi_1PI9oRdgwBjAGVf77fYerdD_SMp_W)

7. Create a servlet file in the Java Resources folder
   Right click on src folder -> goto New -> Servlet
   
8. Create a html file in the WebContent folder
   Right click on WebContent folder -> goto New -> HTML File
   Name it as servlet_index.html
   
9. Write the appropriate code in servlet file and index file respectively
10. Open web.xml file present in the WEB-INF folder of WebContent 
   Declare and define the classes/servlets and the HTML File
   
   Below is the snapshot of the project explorer
   
![image](https://drive.google.com/uc?export=view&id=1hPjlc_z1vOkG-OtfVyMMb19JdfCxzDvA)

11. Save the files and run the application on server

![image](https://drive.google.com/uc?export=view&id=1V1lIcradiKl-SG70gzvZtuZ2B9VF_Zyq)

12. You will see the name of the server installed and configured 
    
    ![image](https://drive.google.com/uc?export=view&id=1bn__ghvrtIIO2AX_CaYsz7iMWtL_U197)
    
    Click on finish and you are done !

### JSP
Steps 1-6 of the servlets remain same for creating JSP Application
Give the project name as JSPCalculator

7. Create a JSP File
   Right click on WebContent -> New -> JSP File
   Give the name as JSPCalculator ,click on next and then Finish
   
![image](https://drive.google.com/uc?export=view&id=10s3zZGfuCSVwVbZESmkZ75OUd1oeLEFm)

8. Create a html file in the WebContent folder
   Right click on WebContent folder -> goto New -> HTML File
   Name it as jsp_index.html

9. Write the appropriate code in servlet file and index file respectively
10. Open web.xml file present in the WEB-INF folder of WebContent 
    Since there is no classe to be declared and defined,keep only the the HTML File. 
    JSP File will not defined here
   
   Below is the snapshot of the project explorer
   
![image](https://drive.google.com/uc?export=view&id=1yKPvydoCGO4Nic2r-0bIRt2mwH-jmYag)

11. Save the files and run the application on the server

    ![image](https://drive.google.com/uc?export=view&id=1bn__ghvrtIIO2AX_CaYsz7iMWtL_U197)

Click on finish and you are done ! 
