package com.DAO;

import java.util.List;

import com.model.BookDtls;

public interface BookDAO {
	
	public boolean addBook(BookDtls b);
	
	public List<BookDtls> getAllBooks();
	
	public BookDtls getBookById(int id);
	
	public boolean updateEditBooks(BookDtls b);
	
	public boolean deleteBooks(int id);
	
	 public List<BookDtls> getNewBook();
	 
	 public List<BookDtls> getRecentBooks();
	 
	 public List<BookDtls> getOldBooks();
	 
	 public List<BookDtls> getAllRecentBooks();
	 
	 public List<BookDtls> getAllNewBooks();
	 
	 public List<BookDtls> getAllOldBooks();
	 
	 public List<BookDtls> getBookById(String email,String cate);
	
	 public boolean oldBookDelete(String email, String cat,int id);
	 
	 public List<BookDtls> getBookBySearch(String sch);
	 
}
