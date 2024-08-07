# SpringBoot - 06 - MVC

Hello friends. 👋

I've worked on this repository that contains a project of Spring Boot using Thymeleaf. 🍃



## Index 🚀
- [Overview](#overview-)
- [What is Thymeleaf?](#what-is-thymeleaf-)
- [Implementation](#implementation)
- [How does MVC work?](#how-does-mvc-work-️)



## Overview 👀
- MVC is a convention of develop
    - *Model* contains the information to be contained,requested and displayed.
    - *View* is the way to display information to the client.
    - *Controller* the artefact that syncs the handles of request, makes  responses and send the response to the client.
- String Boot can give the artefact to apply MVC.



## What is Thymeleaf? 🍃

- Thymeleaf is a Java templating engine.
- Commonly used to generate the HTML views for web apps
- Looping and conditionals ![alt text](<DOCS_TO_RUN/images/image.png>)
- CSS and JavaScript integration
    - the files CSS must be in *static/css*
![alt text](<DOCS_TO_RUN/images/image-2.png>)
- Template layouts and fragments (check the properties with *th:* ) ![alt text](<DOCS_TO_RUN/images/image-1.png>)

[More information here 🔗](https://www.thymeleaf.org/)



## How does MVC work? 🎛️

All starts when a client sends a request to our service:
1. Our service catches the request.
2. Our service checks the request and makes some operations (calculation, others requests, runs a query to data base)
3. Our service makes a response and sends a result.

![alt text](<DOCS_TO_RUN/images/Frame 9 (1).png>)

### Model
The models is:
- The information to makes others request
- The information to be contained in the Daba Bases
- The information will display/send to client

### View
Spring MVC is so flexible. We can use many view templates
- This project uses *Thymeleaf*

### Controller
It has the responsibility of:
- Shows the endpoints
- Makes the requests to others endpoints
- Valid the business rules.
- Sends the views



## Implementation 🪖

### Dependencies
 - To make the *templates* and open the *endpoints*
 ![alt text](<DOCS_TO_RUN/images/image-3.png>)

### Controller
![alt text](<DOCS_TO_RUN/images/image-200.png>)
 - File of example [StudentController](src/main/java/com/jcarloshg/mvc/DemoController/StudentController.java)
 - Open the *endpoint* to client with the method GET (*@GetMapping("/form")*)
 - Open the *endpoint* to client with the method POST (*@PostMapping("/processStudent")*)
 - Create the model and insert the properties to the model
 - Return the view to render in the client

### Model
![alt text](<DOCS_TO_RUN/images/image-100.png>)
- File of example [StudentController](src/main/java/com/jcarloshg/mvc/DemoController/StudentController.java)
- The model has all the properties that the controller will use
    - The model contains information like
        - The entity [Student](src/main/java/com/jcarloshg/mvc/model/Student.java)
        - The value of [Countries](src/main/resources/application.properties)
        - The value of [Languages](src/main/resources/application.properties)
        - the value of [FavoriteSystem](src/main/resources/application.properties)

### View
- The response of the *endpoints* return the name of the *view* from *Thymeleaf* ![alt text](<DOCS_TO_RUN/images/image-300.png>)

- The files of view are in [this folder 📁](src/main/resources) ![alt text](<DOCS_TO_RUN/images/image-400.png>)
- The structure of that files is like [file 🍁](src/main/resources/templates/StudentForm.html) ![alt text](<DOCS_TO_RUN/images/image-1.png>)



## Results 🟢
