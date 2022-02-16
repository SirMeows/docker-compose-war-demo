# docker-compose-war-demo

Simple Docker-compose setup to demonstrate war-file deployment with Tomcat.
It's meant for a class demo at [KEA](https://kea.dk/uddannelser/erhvervsakademi/datamatiker), so instructions here are sparse.

To start the Tomcat server type the following in a terminal in the **root** of the project: `docker-compose up -d`

This will start Tomcat, internally on 8080 and forward this to the host on **9999**

Test in a browser, with this URL: **http://localhost:9999** → This should give a **404 message from Tomcat** so we know that it's running.

The only application available out of the box is the *manager app*. Start it like this:
http://localhost:9999/manager/html   (user and password are **admin** and **secret** which is defined in the `tomcat-users.xml`. 
*So don't even consider using this on a public server before this is fixed ;-)*

Upload war-files using the section **WAR file to deploy**. The directory **precompiled-wars* contains a few precompiled web-projects

Stop the server like this: `docker-compose down`

REF: This project was inspired by this article [Booting Tomcat in Docker with the manager app](https://octopus.com/blog/deployable-tomcat-docker-containers) but started via docker-compose to make it simpler to use



