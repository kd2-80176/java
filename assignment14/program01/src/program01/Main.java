package program01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Candidate c=new Candidate();
		List<PartyVotes> partylist=new ArrayList<PartyVotes>();	
		
		
		//inserting candidates in database
//		try(CandidateDAO dao= new CandidateDAO()) {
//			System.out.print("enter the name=");
//			String name=sc.next();
//			c.setName(name);
//			System.out.print("enter the party=");
//			String party=sc.next();
//			c.setParty(party);
//			System.out.print("enter the votes=");
//			int votes=sc.nextInt();
//			c.setVotes(votes);
//			int cnt=dao.save(c);
//			System.out.println("row save :"+cnt);
//
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//updating the rows in the database table
//		try(CandidateDAO dao= new CandidateDAO())
//		{
//			System.out.print("enter the id to be modified=");
//			int id=sc.nextInt();
//			c.setId(id);
//			System.out.print("enter the name to be updated=");
//			String name=sc.next();
//			c.setName(name);
//			System.out.print("enter the party to be updated=");
//			String party=sc.next();
//			c.setParty(party);
//			int cnt=dao.update(c) ;
//			System.out.println("row updated :"+cnt);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	
		//get partywise total votes
		 try(CandidateDAO dao=new CandidateDAO())
		 {
			 
			 partylist=dao.getPartyVotes();
			 partylist.forEach(m->System.out.println(m));
			 
		 }catch (Exception e) {
		e.printStackTrace();
		}
		

	}

}
