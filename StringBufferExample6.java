    class StringBufferExample6{  
    public static void main(String args[]){  
    	
    StringBuffer sb=new StringBuffer();  
    
    System.out.println(sb.capacity());//default 16  
    
    sb.append("Hello");  
    System.out.println(sb.capacity());//now 16  

    sb.append("java is my favourite language i love it");  
    
    System.out.println(sb.capacity());//now (16*2)+12=34 i.e (oldcapacity*2)+12  
    }  
}  