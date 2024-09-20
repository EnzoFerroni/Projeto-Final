package servicosNuvem.minhaBiblioteca.Controller;

import java.util.Arrays;
import java.util.List;
import servicosNuvem.minhaBiblioteca.Entidade.Book;
import org.springframework.web.bind.annotation.*;



@RestController
public class BookController {
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(
			new Book("The Great Gatsby", "F. Scott Fitzgerald", "A novel about the American dream and the Roaring Twenties.", "https://m.media-amazon.com/images/I/71V1cA2fiZL._AC_UF1000,1000_QL80_.jpg"),
			new Book("To Kill a Mockingbird", "Harper Lee", "A story of racial injustice in the Deep South.", "https://m.media-amazon.com/images/I/71FxgtFKcQL._AC_UF1000,1000_QL80_.jpg"),
			new Book("1984", "George Orwell", "A dystopian novel about totalitarianism and surveillance.", "https://m.media-amazon.com/images/I/61t0bwt1s3L._AC_UF1000,1000_QL80_.jpg")
				);
	}
}

