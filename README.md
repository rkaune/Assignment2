# Assignment2
Instructions
In this assignment, you will be simulating an Air Traffic Control tower. This program uses data of the Airplane class type. This is a custom class that you will use for this activity. 

Each Airplane object represents an actual airplane that is detected by the tower at a particular instance in time. The Airplane object has a number of fields: a horizontal distance in miles from the tower (as a positive decimal number), a bearing (compass direction) from the tower (as an integer from 0 to 360), a positive altitude (height) in feet (as a positive integer) and a call-sign which consists of letters, numbers, and symbols.

The Airplane class has the following constructors and methods:

Constructors
Airplane()	Creates an Airplane with call sign “AAA01” located on the landing strip: 1 mile due north (0°) of the tower at an altitude of 0 feet.
Airplane(String cs, double dist, int dir, int alt)	
Creates an Airplane with call-sign cs dist miles from the tower on a bearing of dir degrees, at an altitude of alt feet.

Notes: alt and dist will always be read as absolute values (non-negative). If dir is not between 0 and 360, the bearing will be set to dir % 360.

 
Methods
move(double dist, int dir)	Void method. Changes the Airplane position by dist miles on a heading of dir degrees.
gainAlt()	Void method. Increases the altitude of the Airplane by 1000 feet.
loseAlt()	Void method. Decreases the altitude of the Airplane by 1000 feet, or to 0 if altitude is less than 1000 feet.
getAlt()	Returns an int representing the altitude of the Airplane.
toString()	Returns a String representation of the Airplane including all fields. For example: AAL123 - 110.5 miles away at bearing 059°, altitude 4500 feet
distTo(Airplane other)	Returns a double representing the distance in miles between this Airplane and the Airplane other
You will first write code to create a plane, "Airplane 1",  with the default callsign of AAA01, starting in the default position of 1 mile due north (0°) of the tower at an altitude of 0 feet.

Your program should then ask the user to input the details of a second airplane, "Airplane 2", detected by the tower. This will consist of the call-sign, distance, direction and altitude. Once these inputs have been entered, your program should convert the callsign to use uppercase letters, then create Airplane 2 using these details.

Next, your program should print the details of Airplane 1 and Airplane 2 in the exact format shown in the sample runs. This should be followed by the distance in miles between the two planes and the difference in height (the height difference must be positive).

The following changes should then be made to the positions of the planes:

Increase the altitude of Airplane 1 by 4000 feet.
Decrease the altitude of Airplane 2 by 2000 feet (or to 0 if this would make the altitude negative).
Move Airplane 1 a distance of 10.5 miles on a heading of 50 degrees
Move Airplane 2 a distance of 8.0 miles on a heading of 125 degrees
After this, your program should print the details of the planes with their new positions, and then the new distance and (positive) height difference between the planes.

You should carefully follow the format shown below in the sample runs when you create your program: make sure your program produces the exact same output when you input the sample data into it.

Milestones
Milestone 1: Write a constructor call to create the first default plane. Then write code to get inputs of the correct type for each field for the second plane. Convert the callsign to uppercase and use this data to create Airplane 2.

Milestone 2: Write code that prints the relevant details for the two airplanes. Calculates the distance between the two planes and the (positive) difference in altitude between them, then print both of these values.

Milestone 3: Write code that moves the planes as desired (the first airplane up 4000 feet and the second down 2000 feet, then the first airplane 10.5 miles on a heading of 50 degrees, and the second 8.0 miles on a heading of 125 degrees). Repeat the code from milestone 2 to print the new positions.

Sample Runs
Sample Run 1

Enter the details of the second airplane (call-sign, distance, bearing and altitude):
ual256
12.8
200
22000

Initial Positions:
"Airplane 1": AAA01 - 1.0 miles away at bearing 000°, altitude 0 feet
"Airplane 2": UAL256 - 12.8 miles away at bearing 200°, altitude 22000 feet
The distance between the planes is 13.74 miles.
The difference in height between the planes is 22000 feet.

New Positions:
"Airplane 1": AAA01 - 11.17 miles away at bearing 046°, altitude 4000 feet
"Airplane 2": UAL256 - 16.76 miles away at bearing 173°, altitude 20000 feet
The distance between the planes is 25.12 miles.
The difference in height between the planes is 16000 feet.
Sample Run 2

Enter the details of the second airplane (call-sign, distance, bearing and altitude):
Aca549
25.3
305
5000

Initial Positions:
"Airplane 1": AAA01 - 1.0 miles away at bearing 000°, altitude 0 feet
"Airplane 2": ACA549 - 25.3 miles away at bearing 305°, altitude 5000 feet
The distance between the planes is 24.74 miles.
The difference in height between the planes is 5000 feet.

New Positions:
"Airplane 1": AAA01 - 11.17 miles away at bearing 046°, altitude 4000 feet
"Airplane 2": ACA549 - 17.3 miles away at bearing 305°, altitude 3000 feet
The distance between the planes is 22.31 miles.
The difference in height between the planes is 1000 feet.
