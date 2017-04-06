# SandipConcurrencyProblem


Create a Choclate maker (A Producer class Object).

Create a fat kid consumer ( A Consumer Class object)

Create a Container ( A Pipe class Object ) to store the cholcates by the choclate maker.


Solution Overview :

A singleton Pipe class is created so that both the choclate maker and the fat kid is accesing the same container (Pipe Object).

The choclate maker has to open the container and place the produced Choclate while the at kid has to wait while the choclate maker is occupied at the container and Vice Versa.
   - To achieve this Thread safety is built into the PIPE calss
   - To achieve this Producer class and consumer class are MULTi -THREADEd .
   
   
Clone or Download the project into your local repository to run the code.

There is a picture provided at the root folder to see the Console Output follow the link below .
      https://github.com/ujustcode/SandipConcurrencyProblem/blob/master/Solution_ConsoleOutput.PNG
