package dao;

import pojos.Address;
import pojos.Topic;

public interface IAddressDao {
	/*
	 * assign user address 
	 * User i/p : user id , address dtls
	 */

	String assignUserAddress(long userId, Address adr);
	//get user details containing address details
	//why are we adding a method in adr dao ? It's uni dir relationship from Address --> User , that's why!
	//Since using Shared PK concept in User n Address : userId is going to be SAME as address id
	//so it's user id OR addr id , one n the same !
	Address getUserAndAddressDetails(long userId);
	//update address of the user : city n zip code
	String updateAddress(long userId,String newCity,String newZipode);
}
