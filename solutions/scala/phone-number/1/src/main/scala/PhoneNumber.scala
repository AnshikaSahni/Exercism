// if doesnt start with 1 and more then 10 then invalid 
// invalid if no. is less than 10 
// there is categories - if area code that is first three no. starts with 1 or 0 then invalid 
// if exchange code which is next three no . if starts with 0 and 1 then invalid 
// if even after filtering out everything no is less than 10 then to invalid 

object PhoneNumber {
  def clean(input:String):Option[String] = { 
     val digits = input.filter(_.isDigit)
     digits match {
       case digits if((digits.length() < 10) || (digits.length() > 11)  ) => None 
       case digits if((digits.length() == 11) && (digits.head == '1')&& sanityCheck(digits.drop(1)) ) =>  Some(digits.drop(1))
       case digits if((digits.length() == 10) && sanityCheck(digits)) => Some(digits)
       case _ => None
      }  
          
  }

  def sanityCheck(digits:String):Boolean=
  {
     val firstInput = digits.take(1)
     val fourthInput = digits.drop(3).take(1) 

     ((firstInput != "1") && (firstInput != "0") && (fourthInput != "0") && (fourthInput != "1"))    
  }
}    
  
