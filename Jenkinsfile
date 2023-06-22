#!/usr/bin/env groovy

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