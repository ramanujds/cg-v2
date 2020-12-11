# Student Demo Programs and Instructions

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

* Step 5 - Run as Maven Build with Goal as ** clean verify sonar:sonar **

* Step 6 - visit localhost:9000


## Standard Comment (Sample)

### Sample 1

```java

/*
 * Project Name : 
 *
 * 
 * */
package com.capgemini.pecunia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.pecunia.dao.AccountDao;
import com.capgemini.pecunia.dao.LoanRequestDao;
import com.capgemini.pecunia.entity.AccountDetails;
import com.capgemini.pecunia.entity.LoanRequests;
import com.capgemini.pecunia.exception.BankAccountNotFound;

/**
* The LoanRequestServiceImp class implements  that implements loanRequest
*
* @author  : Harsh Kumar
* @version : 1.0
* @since   : DD-MM-YYYY 
*/
@Service
public class LoanRequestServiceImp implements LoanRequestService {
	
	
	// Tells the application context to inject an instance of LoanRequestDao here
	@Autowired
	LoanRequestDao dao;
	
	// Tells the application context to inject an instance of AccountDao here
	@Autowired
	AccountDao account;

	/**
   * This method is used to process loan request. 
   * @param  loanreq :This is the  paramter to process loanreq
   * @return String  : This returns String message,else else throws
   * an exception which is handled globally
   */
	
	
	@Override
	public String loanRequest(LoanRequests loanreq) {
		
		String s1 = loanreq.getAccountId();
		Optional<AccountDetails> details = account.findById(s1);

		if (details.isPresent()) {
			dao.save(loanreq);

			return "Your Loan Request is successful";
		} else {

			throw new BankAccountNotFound("No BankAccount found with " + loanreq.getAccountId()
					+ "\n You need to have an Bank Account to applay Loan");
		}

	}

}

```

### Sample 2

```java

/*
 * Project Name : 
 *
 * 
 * */
package com.capgemini.pecunia.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.entities.Transactions;
import com.capgemini.pecunia.service.PassbookMaintenanceService;


/**
* The PassbookController class implements an implements updatePassbook method
*
* @author   :Harsh Kumarr
* @version  :1.0
* @since    :YYYY-MM-DD 
*/
@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "http://localhost:4200")
public class PassbookController {

	// Tells the application context to inject an instance of PassbookMaintenanceService here
	@Autowired
	private PassbookMaintenanceService service;

	//Fetching the transactions till last updated date
	
   /**
   * This method is used to Fetching the transactions till last updated date. 
   * @param accountId       :This is the  paramter 
   * @return ResponseEntity : This returns list of Transactions
   */
   
	@GetMapping("/updatePassbook/{accountId}")
	public  ResponseEntity<List<Transactions>> updatePassbook(@PathVariable("accountId") String accountId)
	{
			List<Transactions> list = service.updatePassbook(accountId);
			return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
		}
		
}



```


