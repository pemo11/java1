# Aufgabe 5 - Expontentielles Wachstum (Level A)

Gesucht ist ein Java-Programm, das eine ganze Zahl als Jahreszahl entgegennimmt und die Größe der Weltbewölkerung für dieses Jahr ausgibt.

# Anforderungen
- Klasse mus App heißen
- Die Berechnung der Bevölkerungszahl für ein Jahr wird in der Methode *calculatePopulation* durchgeführt
- Die Methode *calculatePopulation* ist vom Typ *double* und besitzt einen Parameter *int* für das Jahr
- Die Jahreszahl muss größer als 2000 sein
- Die Bevölkerungszahl soll nur auf 2 Nachkommastellen ausgegeben werden
- In dem JavaDoc-Kommentar der Klasse muss die Abgabe-ID (z.B. Matrikelnummer) über das *@author*-Tag angegeben werden

# Tipps zur Umsetzung
- Die Formel heißt B = B0 * 1.012 hoch t
- 1.012 steht für 1.2%, die angenommene, konstante Wachstumsrate
- B0 ist die Bevölkerungszahl für das Jahr 2000, 6.14 Mrd
- t ist die Anzahl der Jahre seit dem Jahr 2000