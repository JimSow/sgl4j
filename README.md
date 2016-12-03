<h1 align="center"> sgl4j </h1>

[![Project Status](http://www.repostatus.org/badges/latest/suspended.svg)](http://www.repostatus.org/#suspended)
[![Build Status](https://travis-ci.org/dirmeier/sgl4j.svg?branch=master)](https://travis-ci.org/dirmeier/sgl4j.svg?branch=master)
[![codecov](https://codecov.io/gh/dirmeier/sgl4j/branch/master/graph/badge.svg)](https://codecov.io/gh/dirmeier/sgl4j)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/28c9723c26b04237b94895f035dc5b32)](https://www.codacy.com/app/simon-dirmeier/sgl4j?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=dirmeier/sgl4j&amp;utm_campaign=Badge_Grade)

Standard generics library in Java.

## Introduction

The *Standard Generics Library for Java* (``sgl4j``) is a package for basic utility functions, data-structures, algorithms, enums etc. that are used routinely for programming. These, for example, include

* data-structures like suffix arrays and Fibonacci heaps,
* combinatorial, recursive functions like ``R``'s ``combn``,
* statistics such as precision matrices for GGMs, 
* algorithms like binary search.

So far the library is very basic and only used for [```lvm4j```](https://github.com/dirmeier/lvm4j) but I will steadily expand it.

## Installation
 
You can install the library in two different ways. Either you download the package and build it offline or you just add a dependency to you Maven project.

### Install the package using Maven

If you use Maven just put the repository into your ```pom.xml```:
```xml
<repositories>
    <repository>
        <id>central</id>
        <url>http://digital-alexandria.net:8081/artifactory/libs-release</url>
    </repository>
</repositories>
```

Then add the dependency:
```xml
<dependency>
    <groupId>net.digital-alexandria</groupId>
    <artifactId>sgl4j</artifactId>
    <version>0.1</version>
</dependency>
```

### Install the package manually

You can also build the <code>jar</code> and then include it in your package.

1) Clone the github repository:

    $ git clone https://github.com/dirmeier/sgl4j.git

2) Then build the package:
 
    $ mvn clean package -P standalone

3) This gives you a <code>sgl4j-standalone.jar</code> that can be added to your project (make sure to call this correctly).

## Usage

Just check out the [```javadocs```](https://dirmeier.github.io/sgl4j/).
 
## Author

* Simon Dirmeier <a href="mailto:simon.dirmeier@gmx.de">simon.dirmeier@gmx.de</a>
