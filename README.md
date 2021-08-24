# Braincell Movie Ticket Booking System

## Description
Movie ticket booking system built using NetBeans that enables customers to book seats to the screening movies and allows them to view their bookings and invoices. The admin can customize prices and update movies and also keep track of the customer bookings.

## Tools used
- [Apache NetBeans](https://netbeans.apache.org/download/index.html)
- [mysql-connector-java-5.1.49 ](https://dev.mysql.com/downloads/connector/j/)
- [XAMPP](https://www.apachefriends.org/download.html)
- [jcalendar-1.4.jar](http://www.java2s.com/Code/Jar/j/Downloadjcalendar14jar.htm)
- [mail.jar](http://www.java2s.com/Code/Jar/m/Downloadmailjar.htm)

## BUILD OUTPUT DESCRIPTION

When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, go to the dist folder and
type the following:

java -jar "Movie_Ticket_Booking_System.jar" 

To distribute this project, zip up the dist folder (including the lib folder)
and distribute the ZIP file.

Notes:

* If two JAR files on the project classpath have the same name, only the first
JAR file is copied to the lib folder.
* Only JAR files are copied to the lib folder.
If the classpath contains other types of files or folders, these files (folders)
are not copied.
* If a library on the projects classpath also has a Class-Path element
specified in the manifest, the content of the Class-Path element has to be on
the projects runtime path.
* To set a main class in a standard Java project, right-click the project node
in the Projects window and choose Properties. Then click Run and enter the
class name in the Main Class field. Alternatively, you can manually type the
class name in the manifest Main-Class element.