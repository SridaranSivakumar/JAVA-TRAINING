package daoproject.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerMasterDTO implements Serializable, Comparable<CustomerMasterDTO> {
	private int customerid;
	private String customername;
	private String customeraddress;

	public CustomerMasterDTO() {

	}

	@Override
	public String toString() {
		return "ItemMasterDTO [customerid=" + customerid + ", customername=" + customername + ", customeraddress="
				+ customeraddress + "]";
	}

	public CustomerMasterDTO(int customerid, String customername, String customeraddress) {
		this.customerid = customerid;
		this.customername = customername;
		this.customeraddress = customeraddress;

	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	@Override
	public int compareTo(CustomerMasterDTO o) {
		// TODO Auto-generated method stub
		return customername.compareTo(o.customername);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerid, customername, customeraddress);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMasterDTO other = (CustomerMasterDTO) obj;
		return Objects.equals(customerid, other.customerid) && customername == other.customername
				&& Objects.equals(customeraddress, other.customeraddress);
	}

}
