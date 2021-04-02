# Description of vision

Description of variables:
> Zone: which zone to drop the goal in;
Index: used somwhere in the stuff FTC wrote. Don't change it, and don't delete it;
Go: boolean that determines whether or not to end the vision stuff;
List<Recognition> recognitions is also used somewhere in the pre-wrote stuff;

List of stuff that is actually worth messing with in the vuforia init stuff:
> The boolean that allows for camera monitoring. Make sure it is true if we want to see the camera feed on the driver station The camera zoom if the rings aren't visible
  
How the vision loop works:
> If the auto gets started the loop ends, else it does some recognition stuff that I don't know how it works but I think it saves the reading into a list, therefore saving every single reading Object 2 (found in superclass) takes the current reading and uses that to determine the zone. Ideally the only the last reading is used, but I re-wrote some stuff so it might not work perfectly
  
Supposedly when the run button is hit, the vision loop stops, saving what it currently sees, and then uses that for the program. Let me know if you have any questions.
