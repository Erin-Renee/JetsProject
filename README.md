## Jets Week 4 Project
For the Jets application, I created a fleet of jets with different capabilities. The application starts with a menu to use the jets and access information about them.

### Concepts/ topics Covered
I had 5 classes in this application that implemented 2 interfaces.
I had a parent class called Jet that was abstract. This was a superclass to CargoPlane.java, FighterJet.java, and JetImpl.java.
CargoPlane.java implemented the interface CargoCarrier.java
and FighterJet.java implemented FighterJet.java.
My jets App is the app that contains my main.


buffer reader
ArrayList
@override
toString

### Technology Used
Atom
Eclipse
Github
Macbook Pro


### Lessons Learned
This week I was able to fix the problems i was having when making a menu. This helped with how the application would run.

I moved most of the methods i had in your Airfield class (longestRange, loadCargo, etc) into the AirField class, which made the code easier to work with. I had the menu called on the JetsApp but the actual methods called from the Airfield(except quit).
I changed public List<Jet> jets; to private.
