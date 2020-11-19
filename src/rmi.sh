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
#          echo 'HelloServer bound in registry'
          java HelloCSleep    &
#          sleep 1
#          echo  'sayHello(int) before sleep'
          java HelloCSleep    &
          java HelloCSleep
