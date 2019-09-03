#!/usr/bin/env groovy

@Library('pipeline-library-demo')_

pipeline{
   agent any
   stages {
   stage ('Trial') {
     steps {
        script{
       HelloWorld().say()
        }
        } 
      }
      stage ('Trial2') {
     steps {
        script {
       HelloWorld().speak()
        } 
     }
      }
     }
 }
