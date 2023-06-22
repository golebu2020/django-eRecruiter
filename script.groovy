def buildApp(){
    echo "building and pushing..."
    sh "docker build --tag django-erecruiter:1.1.0 ."
    sh "docker tag django-erecruiter:1.1.0 46.101.168.73:8082/django-erecruiter:1.1.0"
    push()
}
return this

def push(){
    echo "Pushing..."
    withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'USR', passwordVariable: 'PASS')]){
        sh "docker login -u ${USR} -p ${PASS} 46.101.168.73:8082"
        // sh "docker push 46.101.168.73:8082/django-erecruiter:1.1.0"
    }
}
return this

def deployApp(){
    echo "deploying...."
}

return this

