public class Dec2Hex
{
    public static String convertToHex(String Numx) {


        int rem, num;
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal="";
        boolean negative = false;
        try{
            if(Numx.trim().isEmpty()){ //checks if the string doesnt contain any information
                System.out.println("Blank values can't be converted.");
                throw new Exception();
            }
            num = Integer.parseInt(Numx); //converts the passed argument into an integer to be converted to a hexadecimal number
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            if( num == 0) //sets the hexadecimal value to zero as the coversion to hexadecimal doesn't take 0 into account
            {
                hexadecimal = "0";
            }
            else{
                if(num <0){ // checks if the value is negative and converts it to positive as the hex conversion doesnt work with negative values
                    negative = true;
                    num = num * -1;
                }
                while(num != 0)//converts integer to hexadecimal
                {
                    rem=num%16;
                    hexadecimal= ch[rem] + hexadecimal;
                    num = num/16;

                }
            }
            if(negative){
                hexadecimal = "-" + hexadecimal;
            }


            System.out.println("Hexadecimal representation is: " + hexadecimal + ".");
            return hexadecimal;
        }
        catch(Exception e) //if the value entered is an invalid data type such as a string or a decimal number then this code will execute
        {
            System.out.println(Numx +"is not a valid integer.");
            return "invalid input";
        }
    }


    public static void main(String args[])    {


        if (args.length == 0) { //this checks that the user has entered anything into the command line
            System.out.println("Please provide an input as a number as a command-line argument.");
            return;
        }
        else{
            for(String i: args){
                convertToHex(i); //values are passed in as a string as thats how arguments are accepted from the command line
            }
        }

    }
}

