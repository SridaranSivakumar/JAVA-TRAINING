package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.CustomerMasterDTO;
import daoproject.dto.UserDTO;
import jdbcpack.DBUtility;

public class CustomerMasterDAO {
	public CustomerMasterDTO findByID(int customerid) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from customer_master where customerid=?");
			ps.setInt(1, customerid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CustomerMasterDTO custdto = new CustomerMasterDTO();
				custdto.setCustomerid(rs.getInt("customerid"));
				custdto.setCustomername(rs.getString("customername"));
				custdto.setCustomeraddress(rs.getString("customeraddress"));

				return custdto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public Collection<CustomerMasterDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();
			ResultSet rs = ps.executeQuery("select * from customer_master");
			List<CustomerMasterDTO> customer = new ArrayList<CustomerMasterDTO>();
			while (rs.next()) {
				CustomerMasterDTO dto2 = new CustomerMasterDTO();
				dto2.setCustomerid(rs.getInt("customerid"));
				dto2.setCustomername(rs.getString("customername"));
				dto2.setCustomeraddress(rs.getString("customeraddress"));
				System.out.println(dto2);
				customer.add(dto2);
			}
			return customer;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public int update(CustomerMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int custid = dto.getCustomerid();
			PreparedStatement ps = con.prepareStatement("select * from customer_master where customerid=?");
			ps.setInt(1, custid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update customer_master set customerid=?,customername=?,customeraddress=?");
				ps.setInt(1, dto.getCustomerid());
				ps.setString(2, dto.getCustomername());
				ps.setString(3, dto.getCustomeraddress());
				int n = ps.executeUpdate();
				DBUtility.closeConnection(null);
				return n;
			} else {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public int deleteCustomer(CustomerMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int custno = dto.getCustomerid();
			PreparedStatement ps = con.prepareStatement("delete from customer_master where customerid=?");
			ps.setInt(1, custno);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public CustomerMasterDTO findByCustomerName(String Customername) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from customer_master where customername=?");
			ps.setString(1, Customername);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				CustomerMasterDTO dto = new CustomerMasterDTO();
				dto.setCustomerid(rs.getInt("customerid"));
				dto.setCustomername(rs.getString("customername"));
				dto.setCustomeraddress(rs.getString("customeraddress"));
				return dto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public static void main(String[] args) {
		CustomerMasterDAO user1 = new CustomerMasterDAO();
		System.out.println(user1.findAll());

		System.out.println(user1.findByID(2));
		CustomerMasterDTO u = user1.findByID(1);
		u.setCustomeraddress("salem");
		// u.setUpass("secret");
		int n = user1.update(u);
		System.out.println(n);

	}
}
