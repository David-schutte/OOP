# Yahtzee
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)  

We gaan een applicatie bouwen waarmee we 5 dobbelstenen kunnen werpen. De dobbelstenen gaan we visualiseren door ze te tekenen op het canvas.
In het laatse deel van de opdracht ga je bepalen of er Yahtzee gegooid is.

#### Implementatie
We hebben twee klassen nodig voor deze opdracht: een klasse Yahtzee en een klasse Dice.
Maak een klasse Dice met een `roll()` methode die een willekeurig getal van 1-6 teruggeeft.
Maak vervolgens een Yahtzee klasse waarin 5 dobbelstenen worden aangemaakt.
Implementeer de methode `roll()` die een integer array teruggeeft met daarin de uitkomsten van de 5 worpen. 

#### Visualisatie
In de map `images` vind je afbeeldingen van alle zijden van een dobbelsteen. Maak eerst een `draw(int x, int y, int width)` methode in de klasse Dice die één dobbelsteen kan tekenen op een bepaalde locatie. Maak hierbij gebruik van de plaatjes uit de `images` map.

Maak vervolgens een `draw()` methode in de Yahtzee klasse waarmee alle dobbelstenen getekend kunnen worden.

#### Yahtzee bepalen
Als alle dobbelstenen gelijk zijn dan is er sprake van Yahtzee. Als er Yahtzee gegooid is, print het dan in het scherm.

#### Bonus: combinaties bepalen (![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg))
Alle mogelijke combinaties voor Yahtzee vind je [hier.](https://nl.wikipedia.org/wiki/Yahtzee)
Dit is een behoorlijk pittige oefening! Begin daarom simpel en werk dit steeds verder uit. Begin bijvoorbeeld met four-of-a-kind en three-of-a-kind.
Implementeer de methode `determineCombination(Dice[] dices)` die een String teruggeeft die aangeeft wat de hoogste mogelijke combinatie is.

Hints:
- Maak een array aan met de uitkomsten van iedere dobbelsteen (int[]) en sorteer deze array.
- Maak gebruik van een [frequentietabel](https://www.mathsteacher.com.au/year8/ch17_stat/03_freq/freq.htm) en sorteer deze op frequency.

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)