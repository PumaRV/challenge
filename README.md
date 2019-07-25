# Coding Challenge for healthcare organization
This project was created as part of a hiring process for a healthcare related organization. It searches for 
a food item using the FatSecret API. 


## Prerequisites
- Java 8
- Maven 3.6.1 

## Configuration
- Application properties are listed in Application.properties. The properties include the API Key and API Secret for 
FatSecret API.  

##Executing 
Follow these steps 

- Navigate to the root of the project 

run
```
$ ./mvnw clean package
$ ./mvnw
```

Application will start in port 8080

##Testing
Just put a food item ID in the form and click search. (example: 55487, 55877)

