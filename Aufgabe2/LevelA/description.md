# Aufgabe 2: Speichergrößen-Umrechner (Level A)

Gesucht ist ein Java-Programm, das eine Speichergröße auf CDs oder DVDs umrechnet

Die Eingabe besteht aus der Speichergröße, der Einheit (z.B. GB) und dem Medium (CD oder DVD)

Die Ausgabe soll die Anzahl der Medieneinheiten sein, die für das Abspeichern der Speichergröße veranschlagt werden müssen.

# Anforderungen
- Das Programm besteht aus einer Klasse *App*
- Die Abfrage muss in einer Methode *berechneAnzahlSpeichermedien* durchgeführt werden, die folgende Signatur besitzt
 
`berechneAnzahlSpeichermedien(long groesse, String einheit, String medium)`

- In dem JavaDoc-Kommentar der Klasse muss die Abgabe-ID (z.B. Matrikelnummer) über das *@author-Tag* angegeben werden

# Empfehlungen zur Umsetzung

Beispiel:

Input: Speichergröße 200 Einheit GB Medium DVD

Output: 42

# Bonusaufgabe:

Bei der Speichergröße soll die Einheit dabei sein, z.B. 200GB

# Vorgaben für die Umsetzung der Bonusaufgabe
- Die Klasse soll App1 heißen
- Reguläre Ausdrücke müssen nicht verwendet werden