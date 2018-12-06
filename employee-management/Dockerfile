From tomcat:8.0.32-jre8
VALUME /tmp
COPY target/employee-management-docker.war /usr/local/tomcat/webapps/app.war
RUN sh -c 'touch /usr/local/tomcat/webapps/app.war'
ENTRYPOINT ["sh","-c","java -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/wenapps/app.war"]