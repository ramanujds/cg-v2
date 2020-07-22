# capgemini-v2

## Tasks to be completed

* Add code to all the methods

* Add Exceptions

* Add Test Cases

--Use collections (List,HashMap) in DAO Layer--

## How add Oracle Depoendency to Maven Project

1) Download ojdbc6.jar
2) Download Maven -https://downloads.apache.org/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip
3) Run Command (CMD) : 
    mvn install:install-file -Dfile=[Path to ojdbc6.jar] -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
4) Add the following dependency to maven project (pom.xml)

```xml
        <dependency>
            <groupId>com.oracle</groupId>
            <artifactId>ojdbc6</artifactId>
            <version>11.2.0</version>
        </dependency>
  ```
