import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Chromosome::");
		String chromosome=br.readLine();
		System.out.println("Enter genes::");
		String genes=br.readLine();
		
		System.out.println("starting");
		if(checkGenes(chromosome,genes))
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");

	}
	
	public static boolean checkGenes(String chromosome,String genes)
	{
	   int counter=0;
	   boolean flag=false;
	   int loopCounter=genes.length();
	   int index=-1;
	     
	   while(counter < loopCounter)
	   {
		  
		  index=chromosome.indexOf(genes.charAt(counter),index+1);
		  if(index != -1)
		  {
			
			  flag=true;
		  }
		  else { flag= false;
		  break;}
		  counter++;
	   }
	   
	   	return flag;
	}

}
