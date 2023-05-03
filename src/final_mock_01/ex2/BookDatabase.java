package final_mock_01.ex2;

import java.io.Serializable;
import java.util.LinkedList;

public class BookDatabase implements Serializable {
    public static LinkedList<Book> bookList = new LinkedList<>();
}
