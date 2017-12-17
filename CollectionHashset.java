    import java.util.*;  
    class CollectionHashset{  
     public static void main(String args[]){  
      //Creating HashSet and adding elements  
      HashSet<String> set=new HashSet<String>();  
      set.add("Ravi");  
      set.add("Vijay");  
      set.add("Ravi");  
      set.add("Ajay"); 
      set.add("anant");
      set.add("anant");
      set.add("Ravi");
      set.add("Prabhu");
      set.add("Kiran");
      
      System.out.println(set);
      //Traversing elements  
      Iterator<String> itr=set.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
     }  
    }  