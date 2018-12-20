# datadog-java-agent
Source code taken from https://github.com/spring-guides/gs-spring-boot/tree/master/complete.
The two Dockerfiles are modified to compile and run against the respective java versions.


## Java 11
```bash
$ docker build -t datadog-java-agent:java11 -f Dockerfile.java11 .
$ docker run --rm datadog-java-agent:java11
```
Notice that the application fails to start

## Java 1.8
```bash
$ docker build -t datadog-java-agent:java8 -f Dockerfile.java8 .
$ docker run --rm datadog-java-agent:java8
```
Notice that the application starts up successfully
