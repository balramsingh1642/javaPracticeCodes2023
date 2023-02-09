public class BitManupulation {
    public static void main(String ar[]){


        // Get Bit Operation
        int n = 5;  // 0101
        int pos =1; 
         int bitMask = 1<<pos; // 0010
         if((bitMask & n)==0){ // 0000
            System.out.println("Bit was Zero ");
         }
         else {
            System.out.println("Bit was One");
         }


         //Set Bit 
          n = 7; //0111
          pos = 1; 
          bitMask = 1 << pos; //0010
          int newNumber  = bitMask | n; // 0010 | 0111
          System.out.println(newNumber); //0111

        //   clear Bit 

        n = 7; // 0111
        pos = 2;
        bitMask = 1 <<pos; //0100
        int newBitMask = ~(bitMask); //1011
        newNumber = newBitMask & n; // 0011
        System.out.println(newNumber);

        // Update Bit 
        //  if operation is 1 then set bit , if  0 then clear bit operation
        int opr = 1; 
        n =7;  // 0111
        pos = 2; 
        bitMask = 1<<pos; //0100
        // set
         if(opr == 1){
            newNumber = n | bitMask; // 0111
            System.out.println("Set Operation Performed "+newNumber);
         }
         else {
            // clear 
            newBitMask = ~(bitMask); // 1011
            newNumber = newBitMask & n ; // 0011
            System.out.println("Clear Operation Performed "+ newNumber);


         }



         

    }
}
