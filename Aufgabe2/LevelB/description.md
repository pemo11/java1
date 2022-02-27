# Aufgabe 2: Speichergrößen-Umrechner (Level B)

Gesucht ist ein Java-Programm, das eine Speichergröße auf CDs oder DVDs umrechnet

Die Eingabe besteht aus der Speichergröße, der Einheit (z.B. GB) und dem Medium (CD oder DVD)

Die Ausgabe soll die Anzahl der Medieneinheiten sein, die für das Abspeichern der Speichergröße veranschlagt werden müssen.

# Anforderungen
- Das Programm besteht aus einer Klasse App
- Die Abfrage muss in einer Methode *berechneAnzahlSpeichermedien* durchgeführt werden, die folgende Signatur besitzt
 
`berechneAnzahlSpeichermedien(String groesse, String medium)`

- Der Parameter *groesse* enthält immer auch die Einheit, z.B. 200GB 
- Reguläre Ausdrücke müssen für die Abfrage der Speichereinheit nicht verwendet werden
- In dem JavaDoc-Kommentar der Klasse muss die Abgabe-ID (z.B. Matrikelnummer) über das *@author*-Tag angegeben werden
