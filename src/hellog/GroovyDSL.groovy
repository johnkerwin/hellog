package hellog

enum Application {
    Platform, Entitlments, Sas
}
enum Environment {
    UAT, PreProd, Prod
}

class Build{
    def build

def deploy(Map m) {
    println "$build deployed to $m.to"
}
    
}

def getLatestBuild(Application a){
  
    return new Build(build:"Patform 1.latest")
}


def build(Application a){
  
    return new Build(build:"Patform 1.something")
}

build(Application.Platform).deploy(to:Environment.UAT)
getLatestBuild(Application.Platform).deploy(to:Environment.PreProd)


//***************************************************


build Application.Platform deploy to: Environment.UAT

getLatestBuild Application.Platform deploy to: Environment.PreProd

