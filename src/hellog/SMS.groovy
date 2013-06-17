
package hellog

class SMS {
    def port
    
    String sendMessage(phoneNumber){
        println "Real SMS Message Sent to $phoneNumber"
    }
    String receiveMessage(){
        println "Real SMS Message Received"
    }
	
}

