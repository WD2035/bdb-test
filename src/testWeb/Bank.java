package testWeb;

import java.util.List;

public class Bank {
	
	private String name;
	private int id;
	private List<Client> clients;
	
	public Bank(String name, int id, List<Client> clients) {
		super();
		this.name = name;
		this.id = id;
		this.clients = clients;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
