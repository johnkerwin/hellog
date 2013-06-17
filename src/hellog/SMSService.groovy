package hellog

class SMSService  {
    def sms
    def SMSService(Object sms){
        this.sms = sms
    }
    
    def send(phoneNumber){
        this.sms.sendMessage(phoneNumber)
    }
    def receive()
    {
        this.sms.receiveMessage()
        
    }
    
    
    
    
    
	
}

