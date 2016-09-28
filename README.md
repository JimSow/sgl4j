<h1 align="center"> sgl4j </h1>

[![Build Status](https://travis-ci.org/dirmeier/sgl4j.svg?branch=master)](https://travis-ci.org/dirmeier/sgl4j.svg?branch=master)
[![codecov](https://codecov.io/gh/dirmeier/sgl4j/branch/master/graph/badge.svg)](https://codecov.io/gh/dirmeier/sgl4j)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/28c9723c26b04237b94895f035dc5b32)](https://www.codacy.com/app/simon-dirmeier/sgl4j?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=dirmeier/sgl4j&amp;utm_campaign=Badge_Grade)

Standard generics library in Java.

## Introduction

Most of the tools that I develop need the same utility functions, data-structures etc, sorting algorithms, Enums and so on. In ```C++``` the Standard Template Library (```STL```) offers a lot of these algorithms and data-structures. The *Standard Generics Library for Java* (```sgl4j```) wants to do the very same thing. So far the library is very basic and only used for [```lvm4j```](https://github.com/dirmeier/lvm4j).

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

TODO

## Author

* Simon Dirmeier <a href="mailto:simon.dirmeier@gmx.de">simon.dirmeier@gmx.de</a>
