package video2;

public class conditions {
    public static void main(String[] args) {
        /*
         syntax of if statements
         if(boolean expression T or F){
            //body
         } else{
            //do this
         }
         
         */
        int salary = 25000;
        //if (salary>10000) {
          //  salary = salary +2000;

            
        //} else{
           // salary = salary + 1000;
        //}

        //multiple if else
        if(salary>1000){
            salary = salary + 2000;

        } else if (salary>2000){
            salary = salary + 3000;
        } else {
            salary = salary + 1000;
        }
        
        System.out.println(salary);
    }
    
}
