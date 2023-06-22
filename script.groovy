def buildApp(){
    echo "building and pushing..."
    docker build --tag django-eRecruiter:1.1.0 .
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

