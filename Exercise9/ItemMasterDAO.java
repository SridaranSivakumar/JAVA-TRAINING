package daoproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import daoproject.dto.InvoiceTransDTO;
import daoproject.dto.ItemMasterDTO;
import daoproject.dto.UserDTO;
import jdbcpack.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;

import daoproject.dto.ItemMasterDTO;
import jdbcpack.DBUtility;

public class ItemMasterDAO {
	public ItemMasterDTO findByID(int id) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemno =?");
			ps.setInt(1, id);
			// System.out.println(ps);
			ResultSet rs = ps.executeQuery();
			// System.out.println(rs.next());
			if (rs.next()) {
				ItemMasterDTO itemdto = new ItemMasterDTO();
				itemdto.setItemno(id);
				itemdto.setItemname(rs.getString("itemname"));
				itemdto.setItemprice(rs.getInt("itemprice"));
				itemdto.setUnit(rs.getInt("itemunit"));
				// System.out.println(itemdto);
				return itemdto;
			} else {
				return null;
			}
		} catch (Exception e) {
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public Collection<ItemMasterDTO> findAll() {
		try {
			Connection con = DBUtility.getConnection();
			Statement ps = con.createStatement();
			PreparedStatement ps1 = con.prepareStatement("select * from item_master where itemno =?");
			ResultSet rs = ps1.executeQuery("select * from item_master");
			List<ItemMasterDTO> items = new ArrayList<ItemMasterDTO>();
			while (rs.next()) {
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemno(rs.getInt("itemno"));
				dto.setItemname(rs.getString("itemname"));
				dto.setItemprice(rs.getInt("itemprice"));
				dto.setUnit(rs.getInt("itemunit"));
				// System.out.println(dto);
				items.add(dto);
			}
			return items;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return null;
		}
	}

	public int update(ItemMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int itemid = dto.getItemno();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemno=?");
			ps.setInt(1, itemid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ps = con.prepareStatement("update item_master set itemno=?,itemname=?,itemprice=?,itemunit=?");
				ps.setInt(1, dto.getItemno());
				ps.setString(2, dto.getItemname());
				ps.setInt(3, dto.getItemprice());
				ps.setInt(4, dto.getUnit());
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

	public int deleteItem(ItemMasterDTO dto) {
		try {
			Connection con = DBUtility.getConnection();
			int itemno = dto.getUnit();
			PreparedStatement ps = con.prepareStatement("delete from item_master where itemno=?");
			ps.setInt(1, itemno);
			int n = ps.executeUpdate();
			DBUtility.closeConnection(null);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			DBUtility.closeConnection(e);
			return 0;
		}
	}

	public ItemMasterDTO findByItemName(String itemname) {
		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from item_master where itemname=?");
			ps.setString(1, itemname);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ItemMasterDTO dto = new ItemMasterDTO();
				dto.setItemno(rs.getInt("itemno"));
				dto.setItemname(rs.getString("itemname"));
				dto.setItemprice(rs.getInt("itemprice"));
				dto.setUnit(rs.getInt("itemunit"));
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
		ItemMasterDAO user = new ItemMasterDAO();
		System.out.println(user.findAll());

		System.out.println(user.findByItemName("pearssoap"));

		ItemMasterDTO u = user.findByID(2);
		u.setItemprice(100);
		// u.setUpass("secret");
		int n = user.update(u);
		System.out.println(n);
	}
}
