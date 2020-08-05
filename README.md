# capgemini-v2

## Tasks to be completed

* Add code to all the methods

* Add Exceptions

* Add Test Cases

--Use collections (List,HashMap) in DAO Layer--

## How add Oracle Depoendency to Maven Project

1. Download ojdbc6.jar
2. Download Maven -https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
3. Run Command (CMD) : 
   
   ```bash
    mvn install:install-file -Dfile=[Path to ojdbc6.jar] -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
    ```
    
4. Add the following dependency to maven project (pom.xml)

```xml
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0</version>
        </dependency>
  ```


## Microservices Steps -

* Called movie rating and movie catelog services from movie info using RestTemplate

* Introduced Naming Server and Load Balancer
   
   * Created a starter Project with Eureka Server Dependency
   * Add @EnableEurekaServer annotation to Configuration

* Registering Services with Eureka

    * Add Netflix Eureka Client Dependency to Movie-Rating, Movie-Info and Movie-Catelog Services
    
    * Add @EnableEurekaClient annotation to Movie-Rating, Movie-Info and Movie-Catelog Services configurations
    
* Service Discovery and Load Balancing
    
    * Add @LoadBalanced to RestTemplate Bean
   
    * Replace all the uris(initial part) with service name
    
    
 
    
 
   
    
    
    
