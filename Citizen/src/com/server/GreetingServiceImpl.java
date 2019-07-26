 package com.server;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.gargoylesoftware.htmlunit.javascript.host.event.Event;
import com.shared.Complaint;
import com.shared.Data;
import com.shared.Display;
import com.shared.FieldVerifier;
import com.shared.Nagar;
import com.shared.Profile;
import com.shared.se;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

	
	Connection con = null;
 	Statement st = null;
    PreparedStatement ps=null;
 	public void init() {
 		try {
 			Class.forName("com.mysql.jdbc.Driver");
 		} catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		try {
 			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/service", "root", "mysql");
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		try {
 			st = con.createStatement();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	}
	@Override
	public Complaint xyz(Complaint c) throws IllegalArgumentException {

            init();	
		int s=c.getAadhar();
		String s1=c.getDes();
		String s2=c.getLoc();
		
		String s3=c.getF();
		String s4=c.getDate();
		String ss="NO";
		int k=0;
		try {
			k=st.executeUpdate("insert into citizen values('"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(k!=0)
			ss="OK";
		
		//c.setDes((s1+"JIIIIII"));
		
		return c;

	}

	@Override
	public Data p(Data n) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();

		String s1 = n.getFname();
		String s2 = n.getLname();
		String s3 = n.getEadd();
		String s4 = n.getAdd();
		int s5 = n.getPno();
		String s6 = n.getPass();
		String s7 = n.getCpass();

		String ss = "NO";
		int k = 0;
		try {
			k = st.executeUpdate("insert into clean values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5
					+ "','" + s6 + "','" + s7 + "')");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if (k != 0)
			ss = "OK";
		n.setFname((s1+"JIIIIII"));
		return n;

	}


	@Override
	public Nagar nigam(Nagar n) throws IllegalArgumentException {
		 init();	
			
			
			String s1=n.getDate();
			String s2=n.getRes();
			String ss="NO";
			int k=0;
			try {
				k=st.executeUpdate("insert into response values('"+s1+"','"+s2+"')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(k!=0)
				ss="OK";
			
			//n.setRes((s1+"JIIIIII"));
			
			return n;
		
	}
	public Nagar nigam1(String s1) throws IllegalArgumentException {
		 init();	
		 
			ResultSet rs=null;
			
			Nagar n=new Nagar();
			try
			{  
			rs=st.executeQuery("select * from response where date='"+s1+"'");
			
				 while(rs.next()) {
					
					
					n.setRes(rs.getString(2));
				 }
			}
				 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//n.setRes((s1+"JIIIIII"));
			
			return n;
		
	}

	@Override
	public String chec(String s1,String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		
		String ss = "NO";
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from clean where Fname='" + s1 + "'and pass='" + s2 + "'");
			if (rs.next()) {
				ss = "YES";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ss;
	}
	
	@Override
	public Profile insert(Profile c) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				init();
				String l=c.getLocation();
				String date=c.getDate();
				String j=c.getCategories();
				String ss="no";
				int k=0;
				try {
					k=st.executeUpdate("insert into events values('"+l+"','"+date+"','"+j+"')");
				}catch (SQLException e) {
				e.printStackTrace();
				}
				if(k!=0) 
					ss="ok";
				//c.setLocation((l+"ji"));
				return c;
				}
				
	@Override
	public Display[] check(String s1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rs=null;
		
		Display d[]=new Display[999];
		try
		{  //String des = null;
			
			//Date s1=d.getDate();
	   /*ps=con.prepareStatement("select * from comp where des=?");
		ps.setString(1, des);*/
		rs=st.executeQuery("select * from citizen where date= '"+s1+"'");
		int i=0;
			 while(rs.next()) {
				
				d[i]=new Display();
				d[i].setDes(rs.getString(1));
				d[i].setLoc(rs.getString(2));
				d[i].setF(rs.getString(3));
				//d.setDate(rs.getDate(3));
				//d.setDate(rs.getString(3));
				//d.setDate(rs.getString(4));
			i++;	
				
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		//d.setDes(des);
		//d.set
		return d;

	/*@Override
	public String check(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "NO";
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from complaint where des='" + s1 + "'and loc='" + s2 + "'");
			if (rs.next()) {
				ss = "YES";
				String des=rs.getString(1);
				String loc=rs.getString(2);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ss;
	}*/
	
	}
	@Override
	public String chec1(String s1, String s2) throws IllegalArgumentException {
		  init();
		String ss = "NO";
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from clean where Fname='" + s1 + "'and pass='" + s2 + "'");
			if (rs.next()) {
				ss = "YES";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ss;
	}
	@Override
	public Profile[] insert1(String c) throws IllegalArgumentException {
		init();
		ResultSet rs=null;
		
		int i=0;
			 
		Profile[] p=new Profile[999];
		try
		{ 
		rs=st.executeQuery("select * from events where date= '"+c+"'");
		
			 while(rs.next()) {
				p[i]=new Profile();
				p[i].setLocation(rs.getString(1));
				p[i].setCategories(rs.getString(3));
				i++;
	}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return p;
	
	}	
}

