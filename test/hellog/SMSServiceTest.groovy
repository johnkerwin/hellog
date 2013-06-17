package hellog
import groovy.util.GroovyTestCase
import groovy.mock.interceptor.MockFor

class SMSServiceTest extends GroovyTestCase {
    def fakeSMS
    void setUp() {
        this.fakeSMS = new MockFor(SMS)

    }
       
        
    void testSend(){
        this.fakeSMS.demand.sendMessage {phoneNumber -> "fake $phoneNumber"}
        this.fakeSMS.use{
            def smsservice = new SMSService(new SMS())
            assertEquals "fake 123", smsservice.send("123")
            
        }
    }
    void testRecieve(){
        
        this.fakeSMS.demand.receiveMessage {"fake message"}
        this.fakeSMS.use{
      def smsservice = new SMSService(new SMS())
            assertEquals "fake message", smsservice.receive()
            
            
        }
    }
    
}

