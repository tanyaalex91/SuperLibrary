package by.htp.lib.logic.impl;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalogue;
import by.htp.lib.dao.BookDao;
import by.htp.lib.dao.impl.FileBookDaoImpl;
import by.htp.lib.logic.LibraryService;

public class CityLibraryServiceImpl implements LibraryService{

	private BookDao dao =  new FileBookDaoImpl();
	
	
	@Override
	public Catalogue getMainCatalogue() {
		
		
		Catalogue catalogue = new Catalogue();
		
		Book[]books = dao.readAll();
		catalogue.setBooks(books);
		catalogue.setTitle("HTP_TAT_7_BOOK_CATALOGUE");
		
		return catalogue;
	}

}
