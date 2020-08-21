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
    
    
 
 
 ## SonarCube Steps

* Step 1 - Download Sonar Cube (7.7)

* Step 2 - Extract and run StartSonar.bat

* Step 3 - Add global maven settings

- .m2/settings.xml

```xml

<settings>
    <pluginGroups>
        <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
    </pluginGroups>
    <profiles>
        <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <!-- Optional URL to server. Default value is http://localhost:9000 -->
                <sonar.host.url>
                  http://localhost:9000
                </sonar.host.url>
            </properties>
        </profile>
     </profiles>
</settings>

```


* Step 4 - Add Dependency to pom.xml

```xml

<dependency>
	<groupId>org.sonarsource.scanner.maven</groupId>
  		<artifactId>sonar-maven-plugin</artifactId>
    	<version>3.6.0.1398</version>
</dependency>

```

* Step 5 - Run as Maven Build with Goal as _ clean verify sonar:sonar _

* Step 6 - visit localhost:9000
    
