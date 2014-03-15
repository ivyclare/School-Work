//Program to search for a file in all directories in your computer

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Search {
    private String filename;
    private ArrayList<String> found = new ArrayList<String>(); //Used to store the filenames that have been found
    
   //set and get methods for filename and found
    public void setFilename(String filename){
     this.filename = filename;  
    }
  public String getFilename(){
     return filename;
    } 
  public ArrayList<String> getfound() {
	return found;
  }
    
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        Search search = new Search();
        
        System.out.println("Enter the name of the file:");  //Getting the name of the file to be searched
        String filename = input.nextLine();
        search.searchDirectory(new File("C:/Users/My PC/Desktop"),filename);  //calling the function search directory 
        int count = search.getfound().size();      // getting the number of files found with the name entered by the user
	if(count ==0){          // if the file is not found
	    System.out.println("\nNo result found!");   
	}else{
	    System.out.println("\nFound " + count + " result!\n");   //if file is found, output the number found
        for (String matched : search.getfound()){
		System.out.println("Found : \n" + matched+"\n");      //Output the path of the file that has been found
	    }
       }
    } 
  
//function to search through the directory including subdirectories
  public void searchDirectory(File directory, String filename){
              setFilename(filename);
              if (directory.isDirectory()){
                  search(directory);
              }
           }
  
 // function to search recursively for a file in a directory
  public void search (File file)        
   {
       if (file.isDirectory()){          //check whether file is a directory or sub directory 
           file.getAbsoluteFile();            //get the path of the file
           for(File temp : file.listFiles()){       //passes the file to temp and searches again(recursive)
               search(temp);
           }
       }
       else {     
           File temp = file;
          if(getFilename().equals(temp.getName().toLowerCase())){      //if filename = temp, then temp is the file we are looking for  
               {
                 found.add(temp.getAbsoluteFile().toString());     //the path of the file is stored in the arraylist found
               }
       }
       }
   } 
          
           
       }

   




