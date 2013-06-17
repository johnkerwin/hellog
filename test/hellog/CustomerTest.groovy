package hellog
import groovy.util.GroovyTestCase


class CustomerTest extends GroovyTestCase {
    private customer
    void setUp() {
       
        
    }
     void testName() {
         
        def customer = new GroovyCustomer()
        customer.customerName = "Bill"
        customer.customerAge = 25
        assertEquals(25, customer.customerAge) 
 
    }
    
    void testyearsTillRetirement(){
        def customer = new GroovyCustomer()
        customer.customerAge = 25
        assertEquals(40, customer.yearsTillRetirement())
        customer.customerAge = 64
        assertEquals(1, customer.yearsTillRetirement())
        customer.customerAge = 65
        assertEquals(0, customer.yearsTillRetirement())
        customer.customerAge = 66
        assertEquals(0, customer.yearsTillRetirement())

    }
    
}

