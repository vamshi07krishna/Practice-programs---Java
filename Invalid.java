
 

class InvalidPinException extends Exception{
     InvalidPinException(String str){
         super(str);
     }    
}



class Invalid{
 
    public void atm() throws InvalidPinException{
        int pin=1234;
          if(pin!=1234){
            throw new InvalidPinException(" Not valid pin number");
        }
        else{
            System.out.println(" valid pin number");
        }
    }
    public static void main(String args[]){
              
   Invalid obj=new Invalid();
            try{
                obj.atm();
                
            }
            catch(InvalidPinException e){
                System.out.println(e);
            
            }
    }    
}

