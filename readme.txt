Spring Social ORCID Reference

The Spring Social ORCID project is an extension to Spring Social that enables integration with ORCID.

# Introduction

ORCID provides a persistent digital identifier that distinguishes one researcher from another and, 
through integration in key research workflows such as manuscript and grant submission, 
supports automated linkages between a researcher and his/her professional activities ensuring that 
his/her work is recognized.

ORCID has been globally adopted, and at the time of writing (10 May 2016), there are over two 
millions of ORCID iDs registered.

Spring Social ORCID enables integration with ORCID with OrcidConnectionFactory, a connection 
factory that can be plugged into Spring Social's service provider connection framework, and with an
API binding to ORCID's REST API.

# How to get

Because the Spring Social ORCID project is not yet in the Maven Central Repository, you need to 
download and build the project locally, and make it available in your local Maven repository. 

Then in the Maven project of your web applicaiton or web service, add the the following Maven 
dependency in the pom.xml file, which will add Spring Social ORCID to your project from your
local Maven repository:

<dependency>
  <groupId>org.europepmc</groupId>
  <artifactId>spring-social-orcid</artifactId>
  <version>2.0.0</version>
</dependency>

As an extension to Spring Social, Spring Social ORCID depends on Spring Social.
Spring Social's core module will be transitively resolved from the Spring Social ORCID dependency. 
If you'll be using Spring Social's web module, you'll need to add that dependency yourself.

In Maven:

pom.xml
<dependency>
  <groupId>org.springframework.social</groupId>
  <artifactId>spring-social-web</artifactId>
  <version>1.1.3.RELEASE</version>
</dependency>

Note that Spring Social ORCID releases on a different schedule than Spring Social. Consequently, 
Spring Social's version differs from that of Spring Social ORCID.

# Configuring ORCID Connectivity

In your Spring properties file of your web application or web service, you need to specify the
ORCID application credentials as below. By default, the Spring Social ORCID points the ORCID 
Sandbox APIs. If you would like to use Spring Social ORCID in production, you need also configure
the ORCID API properties as below.

orcid.clientId=xxxxxxxxxxxxxxxxxxx
orcid.clientSecret=xxxxxxxxxxxxxxxxxxx

orcid.frontendUrl=https://orcid.org/
orcid.messageSchemaVersion=2.0
orcid.apiUrl=https://api.orcid.org/v${orcid.messageSchemaVersion}/
orcid.pubApiUrl=https://pub.orcid.org/v${orcid.messageSchemaVersion}/
orcid.authorizeUrl=https://orcid.org/oauth/authorize
orcid.accessTokenUrl=https://api.orcid.org/oauth/token

Note: Spring Social ORCID currently supports ORCID API version 2.0

# eferences:

1. Spring Social
http://docs.spring.io/spring-social/docs/1.1.0.RELEASE/reference/htmlsingle/#section_implementing

2. ORCID
https://members.orcid.org/api/oauth/3legged-oauth
https://members.orcid.org/api/tutorial/read-orcid-records