def buildApp(){
    echo "building and pushing..."
    sh "docker build --tag golebu2020/maven-repo:django-erecruiter-1.1.0 ."
    push()
}
return this

def push(){
    echo "Pushing..."
    withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'USR', passwordVariable: 'PASS')]){
        sh "echo ${PASS} | docker login -u ${USR} --password-stdin"
        sh "docker push golebu2020/maven-repo:django-erecruiter-1.1.0"
    }
}
return this

def deployApp(){
    echo "deploying...."
}

return this

