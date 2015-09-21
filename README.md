# Introduction into Dependency injection

This repository contains slides and working material to give 2nd semestre students at SeBiVenlo@Fontys a brief introduction into the concept of Dependency injection in software engineering.
The material assumes that Java is teached.

# Structure

* slides/ contains LaTeX sources to create the slides (create with pdflatex command)
* workshop/ contains a Java Spring project that can be used to play around with dependency injection

# Running the workshop-app

* cd into workshop/
* Build the project with Gradle: 'gradle build' if Gradle is installed on your machine or './gradlew build' for the built-in gradle-wrapper
* Run the application with java -jar build/libs/gs-spring-boot-0.1.0.jar
* Navigate to localhost:8080/ in your browser to see the output of the implemented controller

# Playing around with the workshop-app

The above mentioned workshop-app can be used to show and let experience the concept of Dependency Injection. Students should first import this project into an IDE (e.g. NetBeans or Eclipse) and inspect the current source-code.
Concrete tasks that can be done are mentioned in the slides.
