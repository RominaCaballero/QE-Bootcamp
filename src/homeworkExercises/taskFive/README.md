## The task:
Exception handling and file input/output.
In the same previous zoo project, make it so that 
the animal data (species, breed, name, and year of 
birth or age) and the area data (name and maximum 
capacity) are taken from one or two text files. Add exception handling for reading 
the file(s).

## How it works
It begins by creating a Zoo object and writing zoo area information, such as area names and capacities, to a file called areas.txt. The program reads the file to extract and create ZooArea objects, handling exceptions for file reading errors and skipping lines that don't contain sufficient data. A list of animals with their details (such as type, species, breed, and birth year) is prepared and written to another file, zoo.txt.

After writing the animals' data, the program reads it back, creating appropriate Animal objects (like Dog, Cat, or Horse) based on the animal type. These animals are then assigned to zoo areas, considering their capacity limits. Once the data is processed, the program prints details about the zoo, including each area's name, capacity, and the animals assigned to it. Additionally, the code filters and prints areas that contain fewer than three animals. Exception handling is incorporated throughout to manage errors during file reading and writing operations.

