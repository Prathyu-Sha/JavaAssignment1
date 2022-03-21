import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.TreeMap;
public class FreqOfWords {
	public static void main(String args[]) throws IOException
	{
	  Path fileName=Path.of("C:\\Assignments\\story.txt");
	  String str=Files.readString(fileName);
	  System.out.println("The Contents in the file are" +str);
	  Map<String,Integer>mp=new TreeMap<>();
	  String arr[]=str.split(" ");
	  for(int i=0;i<arr.length;i++)
	  {
		  if(mp.containsKey(arr[i]))
		  {
			  mp.put(arr[i],mp.get(arr[i])+1);
		  }
		  else
		  {
			  mp.put(arr[i],1);
		  }
	  }
	  System.out.println("The frequency of each word is:");
	  for(Map.Entry<String,Integer>entry:mp.entrySet())
	  {
		  System.out.println(entry.getKey() + "-" + entry.getValue());
	  }
	}
}
