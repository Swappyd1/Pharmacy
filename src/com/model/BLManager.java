package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.pojo.Cart;
import com.pojo.Contactus;
import com.pojo.Customer;
import com.pojo.Stock;
import com.pojo.Supplier;

public class BLManager {
	SessionFactory sf = new Configuration().configure().buildSessionFactory();

	public List<Stock> viewallm() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Stock.class);
		List<Stock> e = cr.list();
		return e;
	}

	public void savemedicine(Stock s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(s);
		tr.commit();
		s1.close();
	}

	public Stock searchbyid(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("sid", id));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public void deleteid(Stock s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.delete(s);
		tr.commit();
		s1.close();

	}

	public Stock serachbyid(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("sid", id));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public void updatemedicine(Stock s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.update(s);
		tr.commit();
		s1.close();

	}

	public void saveSupplier(Supplier s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(s);
		tr.commit();
		s1.close();

	}

	public Supplier searchbysid(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Supplier.class);
		cr.add(Restrictions.eq("supid", id));
		Supplier c = (Supplier) cr.uniqueResult();
		return c;
	}

	public void deletesid(Supplier s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.delete(s);
		tr.commit();
		s1.close();

	}

	public Supplier serachbyid1(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Supplier.class);
		cr.add(Restrictions.eq("supid", id));
		Supplier c = (Supplier) cr.uniqueResult();
		return c;
	}

	public List<Supplier> viewallsupplier() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Supplier.class);
		List<Supplier> e = cr.list();
		return e;
	}

	public void updateSupplier(Supplier s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.update(s);
		tr.commit();
		s1.close();

	}

	public List<Stock> searchstocklist() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Stock.class);
		List<Stock> e = cr.list();
		return e;
	}

	public void saveContactUs(Contactus c) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(c);
		tr.commit();
		s1.close();

	}

	public List<Contactus> viewallmessages() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Contactus.class);
		List<Contactus> e = cr.list();
		return e;
	}

	public Contactus searchbycid(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Contactus.class);
		cr.add(Restrictions.eq("cid", id));
		Contactus c = (Contactus) cr.uniqueResult();
		return c;
	}

	public void deleteid(Contactus c) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.delete(c);
		tr.commit();
		s1.close();

	}

	public void saveCustomer(Customer c) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(c);
		tr.commit();
		s1.close();

	}

	public List<Customer> viewcustomer() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Customer.class);
		List<Customer> e = cr.list();
		return e;
	}

	public Customer searchbycustid(int id) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Customer.class);
		cr.add(Restrictions.eq("cid", id));
		Customer c = (Customer) cr.uniqueResult();
		return c;
	}

	public List<Customer> serachcustomer() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Customer.class);
		List<Customer> e = cr.list();
		return e;
	}

	public List<Stock> serachstock() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Stock.class);
		List<Stock> e = cr.list();
		return e;
	}

	public Customer searchbycustomername(String cname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Customer.class);
		cr.add(Restrictions.eq("cname", cname));
		Customer c = (Customer) cr.uniqueResult();
		return c;
	}

	public Stock searchbystockname(String mname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("mname", mname));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public void addtocart(Cart c1) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.save(c1);
		tr.commit();
		s1.close();

	}

	public Stock searchbyquantity(String quantity1) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("quantity", quantity1));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public List<Cart> searchcart() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Cart.class);
		List<Cart> e = cr.list();
		return e;
	}

	public Cart serachbycustname(String custname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Cart.class);
		cr.add(Restrictions.eq("custname", custname));
		Cart c = (Cart) cr.uniqueResult();
		return c;
	}

	public List<Customer> searchcustlist() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Customer.class);
		List<Customer> e = cr.list();
		return e;
	}

	public Customer serachbycustomername(String cname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Customer.class);
		cr.add(Restrictions.eq("cname", cname));
		Customer c = (Customer) cr.uniqueResult();
		return c;
	}

	public Cart serachbycart(int custid) {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Cart.class, "cart");
		cr.createAlias("cart.customer", "c");
		cr.add(Restrictions.eq("c.cid", custid));
		Cart r = (Cart) cr.uniqueResult();
		return r;
	}

	public Stock searchbyprice(Stock s) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("price", s));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public void updatestock(Stock s) {
		Session s1 = sf.openSession();
		Transaction tr = s1.beginTransaction();
		s1.update(s);
		tr.commit();
		s1.close();

	}

	public List<Cart> viewcart() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Cart.class);
		List<Cart> e = cr.list();
		return e;
	}

	public List<Cart> viewmedicinebyname() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Cart.class);
		List<Cart> e = cr.list();
		return e;
	}

	public Cart searchbycustname(String cname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Cart.class);
		cr.add(Restrictions.eq("selectedmedicine", cname));
		Cart c = (Cart) cr.uniqueResult();
		return c;
	}

	public List<Cart> searchbycname(String cname) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Cart.class);
		cr.add(Restrictions.eq("custname", cname));
		List<Cart> c = cr.list();
		return c;
	}

	public Stock searchbystockprice(double price) {
		Session s1 = sf.openSession();
		Criteria cr = s1.createCriteria(Stock.class);
		cr.add(Restrictions.eq("price", price));
		Stock c = (Stock) cr.uniqueResult();
		return c;
	}

	public List<Cart> searchcustnamefromcart() {
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Cart.class);
		List<Cart> e = cr.list();
		return e;
	}

}
