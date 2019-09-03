#!/usr/bin/env groovy

@Library('pipeline-library-demo')_

pipeline{
   agent any
   stages {
   stage ('Trial') {
     steps {
       HelloWorld().say()
        } 
      }
      stage ('Trial2') {
     steps {
       HelloWorld().speak()
        } 
      }
     }
 }
