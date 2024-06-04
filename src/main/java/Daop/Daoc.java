package Daop;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Beanp.Beanc;

public class Daoc {

	JdbcTemplate temp;


	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	
	public int insert(Beanc b)
	{
		String s="insert into registration(firstname,lastname,username,email,password)values('"+b.getFirstname()+"',+'"+b.getLastname()+"',+'"+b.getUsername()+"',+'"+b.getEmail()+"',+'"+b.getPassword()+"')";
		return temp.update(s);
	}
	
	public List<Beanc>loginaction(Beanc b)
	{
		String s="select * from registration where email='"+b.getEmail()+"',password='"+b.getPassword()+"'";
		
		return temp.query(s,new RowMapper<Beanc>() {

			@Override
			public Beanc mapRow(ResultSet r, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Beanc b=new Beanc();
				b.setId(r.getInt(1));
				b.setFirstname(r.getString(2));
				b.setLastname(r.getString(3));
				b.setEmail(r.getString(4));
				b.setPassword(r.getString(5));
				
				
				return b;
			}
			
			});
		
			
		
		
	}
}
