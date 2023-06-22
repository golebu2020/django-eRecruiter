#!/usr/bin/env groovy

def gv
pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    echo "initializing...webhoot built automation"
                    gv = load 'script.groovy'
                }
            }
        }

        stage("build"){
            steps{
                script{
                    echo "building...dd"
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "deploying..dddddffd"
                }
            }   
        }
    }

    post{
        always{
            echo "always displaying.dd.."
        }
        success{
            echo "success displaying..."
        }
        failure{
            echo "failure displaying..."
        }
    }
}