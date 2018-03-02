package by.htp.lib.run;

import by.htp.lib.bean.Book;
import by.htp.lib.bean.Catalogue;
import by.htp.lib.logic.LibraryService;
import by.htp.lib.logic.impl.CityLibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) {
		
		LibraryService service = new CityLibraryServiceImpl();
		Catalogue booksCatalogue = service.getMainCatalogue();
		viewCatalogueInfo(booksCatalogue);
		
		
	}
private static void viewCatalogueInfo(Catalogue catalogue) {
	for(Book book: catalogue.getBooks()) {
		System.out.println(book);
	}
}
}
