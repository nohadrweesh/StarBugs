package com.starbugs.TicketService.DTO;

public class UserAuthority {

	private String authority;
	
	public UserAuthority() {
	}

	public UserAuthority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
