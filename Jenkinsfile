#!/usr/bin/env groovy
@Library('jenkins-shared-library')

def gv

pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    echo "initializing...webhoot built automation"
                    gv = load "script.groovy"
                }
            }
        }

        stage("build and push"){
            steps{
                script{
                    ////django-erecruiter:1.1.0
                    // buildImage 'django-erecruiter:1.1.0'
                    // pushImage 'django-erecruiter:1.1.0'
                    gv.buildApp()
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }   
        }
    }
}