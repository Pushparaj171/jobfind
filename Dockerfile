# Author: Umesh S & Sharif Sultan

From openjdk:8
copy target/JobSeekerProfile-0.0.1-SNAPSHOT.jar JobSeekerProfile-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","JobSeekerProfile-0.0.1-SNAPSHOT.jar"]
EXPOSE 8099
