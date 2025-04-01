# Vacation Booking Website Project

## Overview 
This is a back end programming exercise that involves creating and updating the back end of a preexisting vacation booking web application.
The application has an JavaScript/Angular front end with a Java/Spring back end. 
This exercise gave me valuable experience with Java and the Spring framework as well as real world problem solving knowledge. This exercise also gave me experience working with MySQL databases. 
The instructions for this exercise are listed below. 

## Scenario
A travel agency has recently launched a complete overhaul of their front-end vacation bookings application using Angular and JavaScript. 
Lately, the front-end engineers have encountered various undocumented bugs when sending requests and fetching data from the back-end. 
Since the back-end was built in the early 1990s and the original developer has since retired and can no longer help troubleshoot, the existing team is concerned about the growing tech debt and lack of ongoing support. 
Your chief technology officer (CTO) decided to create a project to port over any mission-critical functionalities to a modern framework and has selected you, a software developer in Java, to start developing the minimally viable product (MVP) 
to migrate the legacy back-end to the modern Spring framework.

## Instructions
A.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.
*Note: The packages should be on the same level of the hierarchy.*
*Note: Construct a package named config and copy the RestDataConfig.java provided in the laboratory environment to the package. 
Modify it so that the package and imports have the correct package and import addresses. Copy the application.properties file that is provided in the front end files into your application properties resource file.*

D.   Write code for the entities package that includes entity classes and the StatusType enum.

E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.

F.   Write code for the services package that includes each of the following:
•    a purchase data class with a customer cart and a set of cart items
•    a purchase response data class that contains an order tracking number
•    a checkout service interface
•    a checkout service implementation class

G.   Write code to include validation to enforce the inputs needed by the Angular front-end.

H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.
*Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.*

I.   Add five sample customers to the application programmatically.
*Note: Make sure the customer information is not overwritten each time you run the application.*

J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:
•    that your application does not generate a network error when adding the data
•    your database tables using MySQL Workbench to show the data was successfully added
*Note: The screenshot should include the front-end view and the inspection console in the browser.*

### *Screenshots are located in Screenshots folder!*
