

class CalculatorConundrum 
{
    public String calculate(int operand1, int operand2, String operation) {
            if(operation==null)
                throw new IllegalArgumentException("Operation cannot be null");
            if(operation=="")
                throw new IllegalArgumentException("Operation cannot be empty");
            if(!operation.equals("+") && !operation.equals("*") && !operation.equals("/"))
                throw new IllegalOperationException("Operation '"+operation+"' does not exist"); 
            String res="";
            switch(operation)
            {
                
                case "+":
                    res="";
                    int sum = operand1 + operand2;
                    res = operand1 + " + " + operand2 + " = " + sum;
                    return res;
                case "*":
                    res="";
                    int pdt = operand1 * operand2;
                    res = operand1 + " * " + operand2 + " = " + pdt;
                    return res;
                case "/":
                    res="";
                    int quo;
                    try
                    {
                        quo = operand1 / operand2;   
                    }
                    catch(ArithmeticException e)
                    {
                            throw new IllegalOperationException("Division by zero is not allowed",e); 
                    }
                    res = operand1 + " / " + operand2 + " = " + quo;
                    return res;
            }
            return res;
                
        }
           
}

