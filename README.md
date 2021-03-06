<p align="center">
<img src=".github/logo.png" alt="Avalance" title="Avalance" />
</p>

[![Quality Gate Status](https://sonar.klauke-enterprises.com/api/project_badges/measure?project=avalance&metric=alert_status)](https://sonar.klauke-enterprises.com/dashboard?id=avalance)
[![license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/FelixKlauke/avalance)
[![codecov](https://codecov.io/gh/FelixKlauke/avalance/branch/dev/graph/badge.svg)](https://codecov.io/gh/FelixKlauke/avalance)

# avalance
High performance resilient API Gateway service providing dynamic routing and filtering of inter process communications contexts in a high availability cluster ecosystem with support for microscervice environments managing the edge to the internal infrastructure.

Avalance uses [constrictor](https://github.com/d3adspace/constrictor) for networking.

# Build Status

|             | Build Status                                                                                                            |
|-------------|-------------------------------------------------------------------------------------------------------------------------|
| Master      | [![Build Status](https://travis-ci.org/FelixKlauke/avalance.svg?branch=master)](https://travis-ci.org/FelixKlauke/avalance) |
| Development | [![Build Status](https://travis-ci.org/FelixKlauke/avalance.svg?branch=dev)](https://travis-ci.org/FelixKlauke/avalance)    |


# Installation / Usage

**Maven repositories**
```xml
<repositories>
    <!-- Klauke Enterprises Releases -->
    <repository>
        <id>klauke-enterprises-maven-releases</id>
        <name>Klauke Enterprises Maven Releases</name>
        <url>https://repository.klauke-enterprises.com/repository/maven-releases/</url>
    </repository>
	
    <!-- Klauke Enterprises Snapshots -->
    <repository>
        <id>klauke-enterprises-maven-snapshots</id>
        <name>Klauke Enterprises Maven Snapshots</name>
        <url>https://repository.klauke-enterprises.com/repository/maven-snapshots/</url>
    </repository>
</repositories>
```
