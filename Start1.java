
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.AddressBook.manage.Address;
import com.AddressBook.manage.Address1;



/**
 * 
 */

/**
 * @author Ritesh
 *
 */
public class Start1 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		System.out.println("welcome to ADDRESS BOOK");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("PRESS 1 TO ADD PERSON");
			System.out.println(" PRESS 2 TO DELETE PERSON");
			System.out.println("PRESS 3 TO DISPLAY PERSON");
			System.out.println("PRESS 4 TO EXIT  APP");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add ADDRESS
				System.out.println("ENTER  NAME: ");
				String name=br.readLine();
				
				System.out.println("ENTER  PHONE: ");
				String phone=br.readLine();
				
				System.out.println("ENTER  CITY: ");
				String city=br.readLine();
				
				System.out.println("ENTER  gender: ");
				String gender=br.readLine();

				
				//create address object to store Addressbook
				Address ad=new Address (name,phone,city,gender);
				boolean answer=Address1.insertAddressToDB(ad);
				if(answer)
				{
					System.out.println("Address is successfully added");
				}
				else
				{
					System.out.println("something went wrong try again");
				}
				
			
				System.out.println(ad);
			}
			else if(c==2)
			{
				//delete ADDRESS
			}
			else if(c==3)
			{
				//display ASSRESS
			}
			else if(c==4)
			{
				//exit app
				break;
			}
			else 
			{
				//nothing 
			}
			
		}
		System.out.println("MY ADDRESS BOOK");
		

	}

}
