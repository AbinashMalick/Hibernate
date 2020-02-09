package com.ha.test;

import java.util.Date;

import com.ha.dao.SparepartDao;
import com.ha.entities.Sparepart;
import com.ha.util.SessionFactoryRegistry;

public class HATest {

	public static void main(String[] args) {
		try {
			SparepartDao sparepartDao = new SparepartDao();
			Sparepart sparepart = new Sparepart();
			sparepart.setSparepartNo(2104);
			sparepart.setSparepartName("Disk Brake");
			sparepart.setModelNo("M6653");
			sparepart.setPurchaseDate(new Date());
			sparepart.setPrice(5000);
			sparepartDao.saveSparepart(sparepart);
		}finally {
			SessionFactoryRegistry.closeSessionFactory();
		}
	}
}
