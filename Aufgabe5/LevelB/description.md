# Aufgabe 5 - Exponentielles Wachstum (Level B)

Gesucht ist ein Java-Programm, das eine ganze Zahl als Jahreszahl entgegennimmt und die Größe der Weltbewölkerung für dieses Jahr ausgibt.

# Anforderungen
- Die Klasse mus App heißen
- Die Berechnung der Bevölkerungszahl für ein Jahr wird in der Methode *calculatePopulation* durchgeführt
- Die Methode *calculatePopulation* ist vom Typ *HashMap<Integer, Double>* und besitzt zwei *int*-Parameter für das Anfangs- und das Endjahr
- Die Jahreszahl muss jeweils größer als 2000 sein
- Die Bevölkerungszahl soll nur auf 2 Nachkommastellen ausgegeben werden
- Für jedes Jahr in dem Intervall wird die Bevölkerungszahl für das aktuelle Jahr ausgegeben
- In dem JavaDoc-Kommentar der Klasse muss die Abgabe-ID (z.B. Matrikelnummer) über das *@author*-Tag angegeben werden

# Tipps zur Umsetzung
- Die Formel heißt B = B0 * 1.012 hoch t
- 1.012 steht für 1.2%, die angenommene, konstante Wachstumsrate
- B0 ist die Bevölkerungszahl für das Jahr 2000, 6.14 Mrd
- t ist die Anzahl der Jahre seit dem Jahr 2000

# Besonderheiten
- Die Jahreszahlen werden nicht in der erwarteten Reihenfolge ausgegeben
- Der Grund dafür liegt in der Natur der HashMap soll für diese Aufgabe als nicht Rahmenbedingung akzeptiert werden
- Es soll keine sortierte Ausgabe implementiert werden!
- Es soll keine LinkedHashMap-Klasse verwendet werden!