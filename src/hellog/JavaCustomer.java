package hellog;

class JavaCustomer {
    private String customerName;
    private Integer customerAge;
    
    void setCustomerName(String name){
        this.customerName = name;
    }
    String getCustomerName(){
        return this.customerName;
    }
    void setCustomerAge(Integer age){
        this.customerAge = age;
    }
    Integer getCustomerAge(){
        return this.customerAge;
    }
    
    Integer yearsTillRetirement(){
        Integer years = 65 - this.customerAge ;
        
        return years > 0 ? years :0;
        
    }
    
	
}

