package hellog

class GroovyCustomer {
    def customerName
    def customerAge
    
    def yearsTillRetirement(){
        def years = 65 - this.customerAge 
        return years > 0 ? years :0
    }
    
	
}

