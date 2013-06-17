package hellog
import groovy.util.GroovyTestCase


class HelloTest extends GroovyTestCase {

     void testHello() {
        def h = new Hello()
       assertEquals('Hello World', h.hello()) 
    
       assert 2 + 2 == 4 : "We're in trouble, arithmetic is broken"
    }
    
}

