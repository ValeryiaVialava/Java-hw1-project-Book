#### TASK
Stwórz dwie nowe klasy Book i MyFirstProgram.
W klasie Book powinno się znaleźć:
-  Pole finalne zawierające nazwę książki (typu String)
- Pole finalne zawierające ilość stron książki.
- Pole zawierające informacje czy książka jest przeczytana. Na początku każda książka jest nie przeczytana.
- Pole zawierające informacje ile stron zostało przeczytanych. Na początku ma wartość 0.
- Konstruktor z parametrami nazwa i ilość stron.
- Metoda pozwalająca dodać do przeczytanych stron określoną ich liczbę (np. addReadPages(int numberOfPages)). Jeśli liczba przeczytanych stron jest większa bądź równa ilości wszystkich stron, to oznaczamy tą książkę jako przeczytaną. (Instrukcja if wygląda tak samo jak w C++)

W klasie MyFirstProgram powinna znaleźć się metoda main realizująca poniższy scenariusz
- Stwórz dwie książki
- Wypisz na ekran ich nazwy i ilość stron.
- Wypisz ilość przeczytanych stron w pierwszej i drugiej książce.
- Wypisz na ekran informacje czy obie książki są przeczytane czy nie.
- Dodaj pierwszej książce tyle stron, aby została ona przeczytana.
- Dodaj drugiej książce tyle stron, aby nie została ona przeczytana.
- Wypisz ilość przeczytanych stron w pierwszej i drugiej książce.
- Wypisz na ekran informacje czy obie książki są przeczytane czy nie.

---

```
First book: Learn C++, Pages: 427
Second book: Java for beginners, Pages: 328
0 pages read in the First book
0 pages read in the Second book
First book is not finished
Second book is not finished
---------------------------------
427 pages read in the First book
100 pages read in the Second book
First book is finished
Second book is not finished
```

