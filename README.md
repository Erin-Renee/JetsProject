## Jets Week 4 Project
For the Jets application, I created a fleet of jets with different capabilities. The application starts with a menu to use the jets and access information about them.

### Concepts/ topics Covered
I had 5 classes in this application that implemented 2 interfaces.
I had a parent class called Jet that was abstract. This was a superclass to CargoPlane.java, FighterJet.java, and JetImpl.java.
CargoPlane.java implemented the interface CargoCarrier.java
and FighterJet.java implemented FighterJet.java.
My jetsApp.java is the app that contains my main.
My application starts with a menu which displays these options:

 List fleet
Fly all jets
View fastest jet
View jet with longest range
Load all Cargo Jets
Dogfight!
Add a jet to Fleet
Remove a jet from Fleet
Quit

when you "list fleet" it displays the array of jets that i made from the text file. I used a buffer reader and parsed the text to split at a ", " and then made each jet either a "Fighter", "cargo", or "otherplane". Depending on what type of plane each line was, it would take that text, and break the line up based on ", " and put them into fields in the array list. There were 5 fields for each jet. These fields included type, model, speed, range, and price. each jet was placed into an ArrayList.


buffer reader
ArrayList
@override
toString
switch
boolean
Scanner

### Technology Used
Atom
Eclipse
Github
Macbook Pro


### Lessons Learned
This week I was able to fix the problems i was having when making a menu.
This helped with how the application would run. I added a default into my switch statement to prevent the user from breaking out of the while loop if they input a number besides 1-9, and i added a catch which stops the program if something other than an integer is inputted.

I moved most of the methods i had in my Airfield class (longestRange,
  loadCargo, etc) into the AirField class, which made the code easier
  to work with. I had the menu called on the JetsApp but the actual methods called from the Airfield(except quit).I changed public List<Jet> jets; to private.
