def buildApp(){
    echo "building and pushing..."
    sh "docker build --tag django-erecruiter:1.1.0 ."
    push()
}
return this

def push(){
    echo "Pushing..."

}
return this

def deployApp(){
    echo "deploying...."
}

return this

