package hellog

class Frog {
    def croak(){
        println "ribbit"
    }
}
class Toad{
    def croak(){
        println "ribbit"
    }
}
class Person{
    def croak(){
        println "Aaaaarrrrrrggghhh"
    }
}
class Stick {
    
}


def thingsInThePond = [ new Toad(), new Frog(),new Person(),new Stick() ].each {
    mightBeAFrog -> try{
        mightBeAFrog.croak()
    }
    catch (Exception e) {
        println "We found something that doesn't croak"
    }
}

