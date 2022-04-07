# Coach Notes 📝

## How to run the lessons

- Each part of the lesson has notes associated to it in it's corresponding folder
- At this stage, the students do not know about classes/instantiating objects so all work will be completed in MAIN
- Once each section is complete, get the students to create a folder with the lesson name, a class with the lesson name and copy/paste lesson content over to that class. 


## How to run the VCS Setup

### Initializing
- Create a new trial app using the "File, new project etc" option.  This should be a command line app.
- Once created, select "Enable Version Control Integration" from the VCS menu.
- Select Git.
- In the bottom left of the screen should be a "Git" tab.  Open that to see all local changes that have been made.
- All these files that have been "changed" locally are just setup files.

### First Commit/Add
- To make a commit just select all the files you wish to commit in the VCS window and click the green tick
- A window will appear that will prompt you for a commit message
- The issue we have now is that we do not have a repository associated to the project.
- Create a new repository in Github
- Copy the HTTPS link of the new repository
- Go to VCS dropdown in Intellij and select "manage remotes" and add a new remote with the github link.
- Go to VCS dropdown and select Push, this will push all files to Github remote

### Branches - New and Changing
- To create a new branch use the VCS dropdown and select Branches
- This will open a window where you can create a new branch and see all existing branches.
- Select the branch that you wish to change to.  Always good practice to add/commit before changing branches.  Intellij doesn't seem to prompt you like VS Code


## Java Packages

### What is a package?
- A package as the name suggests is a pack(group) of classes, interfaces and other packages. In java we use packages to organize our classes and interfaces. We have two types of packages in Java: 
built-in packages and the packages we can create (also known as user defined package).