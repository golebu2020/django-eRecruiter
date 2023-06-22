def buildApp(){
    echo "building and pushing..."
    sh "docker build --tag django-erecruiter:1.1.0 ."
    sh "docker tag django-erecruiter:1.1.0 46.101.168.73:8082/django-erecruiter:1.1.0"
    push()
}
return this

def push(){
    sh "docker login -u chinedu -p Nedu123@# 46.101.168.73:8082"
    sh "docker push 46.101.168.73:8082/django-erecruiter:1.1.0"
    echo "Pushing..."

}
return this

def deployApp(){
    echo "deploying...."
}

return this

