public class HelloWorld{

     public static void main(String []args){
       	String input = "aabcaad";
       	String store = input.charAt(0)+"";
        char checker = input.charAt(0);
        int flag = 0;
       	int count = 0;
       	String output = "";
       	for(int i = 0 ; i < input.length() ; i++)
       	{
       	    if(checker != input.charAt(i))
       	    {
       	        for(int j = 0 ; j < store.length() ; j++)
       	        {
       	            if(store.charAt(j) == input.charAt(i) )
       	            {
       	                flag = flag + 1;
       	            }
       	        }
       	        if(flag == 0)
       	        {
       	            store += input.charAt(i);
       	        }
       	        else
       	        {
       	            flag = 0;
       	        }
       	    }
       	}
       	
       	for(int i = 0 ; i < store.length() ; i++)
       	{
       	    for(int j = 0 ; j < input.length() ; j++)
       	    {
       	        if(store.charAt(i) == input.charAt(j))
       	        {
       	            count++;
       	        }
       	    }
       	    output += store.charAt(i) + "" + count;
       	    count = 0;
       	}
       	System.out.println(output);
     }
}
