#!/usr/bin/env groovy


pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    echo "initializing..."
                }
            }
        }

        stage("build"){
            steps{
                script{
                    echo "building..."
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "deploying..."
                }
            }   
        }
    }

    post{
        always{
            echo "always displaying..."
        }
        success{
            echo "success displaying..."
        }
        failure{
            echo "failure displaying..."
        }
    }
}