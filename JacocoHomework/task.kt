Stwórz nastepujacy projekt:

W systemie przechowujemy narkotyki, narkotyk ma nazwę, cene za gram oraz składniki.

Kązdy narkotyk składa się z conajmniej trzech składnikow.

Narkotyki które wyrozniamy to LSD (ilosc smoków wawelskich ktore sie widzi po zazyciu),
MDMA(długosc fazy) oraz mefedron (rodzaj miny jaka sie robi po przyjeciu). Cena narkotyku jest zalezna od
jego rodzaju oraz ilosci skladnikow jakie sa uzyte do jego produkcji, chcemy moc obliczyc ceny narkotykow.

Narkotyki kupuja dzieci (imie, nazwisko, wiek). Kazde dziecko moze kupic maksymalnie 5 narkotykow
jak kupi wiecej to rzucamy wyjatkiem TheKidIsAlreadyDeadException.

Pokryj testami napisany kod. Stestuj asocjacje, wyjatkowe sytuacje przy nich, ograniczenia podane w zadaniu.
Sprawdz czy dziecko na pewno umrze jak sie zabardzo naćpa :)

Sprawdz ile % kodu pokryleś, wygeneruj odpowiedni raport z JaCoCo.

Dodaj interfejs DrugControler, ktory ma metode void checkDrug() ktora rzuca wyjatkiem jesli dany narkotyk
ma zla jakosc (dodaj takie pole do klasy Narkotyk). Przetestuj działanie tej metody z uzyciem Mockito.