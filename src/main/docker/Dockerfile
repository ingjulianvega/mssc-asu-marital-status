FROM openjdk

VOLUME /tmp
ADD maven/mssc-asu-marital-status-0.0.4-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /myapp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]