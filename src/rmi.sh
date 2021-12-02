#!/bin/sh
          javac HelloInterface.java
          javac HelloImplementationSleep.java
          # rmic HelloImplementation
          javac HelloImplementationAlternative.java
          javac HelloCSleep.java HelloServer.java
          rmiregistry &
          sleep 1
          java HelloServer&
          sleep 1
          java HelloCSleep    &
          java HelloCSleep    &
          java HelloCSleep
