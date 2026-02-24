# SACDungeon

A simple git and github example.

# Git Koans

For enlightenment see https://stevelosh.com/blog/2013/04/git-koans/

# Creating your own clone of a repository, committing and pull requests

* Step 1. Create a github account.
 
* Step 2. In GitHub go to 
https://github.com/RichardMorris/SACDungeon

* Step 3. In the top right corner, press the Fork button to create a copy of the project in your own GitHub account.

  * This will make your own copy of the code.

* Step 4. Add your name to the list below, use the pencil icon in the top right to do it

1. Richard Morris - Grand Wizard
2. Paul Smith
3. Olly E - Dev and all round lovely chap
4. Jamie Lias
5. Courtney-Jade Rowden
6. Andrew Maclaren - The supreme coder
7. Peter Newing - the puzzle solver
8. Adam C - The dark souls of programmers
9. A Mathiesen
10. Lewis James
11. Paddy-Shaw
12. David Brooks
13. Michael Algie
14. Emil Bostrom
15. James Barnfather
16. Alex Cooper
17. Harvey Lloyd
18. Will G-S
19. Peter Craze
20. D Edgeworth
21. Max Walker
22. Lexie Johnston
23. Cai Taylor
24. Dayana Sanchez
25. Andy Watson
26. Adam Allerton
27. Will Best
28. Ryan Christie  
29. Lord (yes it's legal) Oliver James Gazzard
30. Owen Keast
31. Harry Waddington
32. Fin J
33. Dexter K
34. Jamie N - I am Mr. Robot

* Step 5. *Commit and Push* 

On GitHub at the bottom of the edit page there is a box to Commit pages. Fill in details and press Commit changes.

* Step 6. Create a pull request in github

This will be a request to the owner of the upstream repositiory (Richard) to pull you code and merge into my code base.

  * Click the *Pull Request* or *Contribute* button
  * Select *create pull request*
  * On new screen select *create pull request* again.
  * On new form fill in the title and description (just add name will do)
  * Click the *create pull request* the request will be submitted to the main repository for me to review.

Once done you are free to change anything. Only sensible changes will be accepted.

## Contributing to a shared repositry

Having to do pull requests every time you make a change is a bit to much work, instead you can become a *contributor* of a project
and push without seeking aproval. The manager of the project can make you a contributor.

* Step 7. Become a contributor
  * Send me an email with your GitHub username
  * I will then send you a request 
  * Accept the request 
  * You should now appear in the list of contributors of the project

* Step 8. Now edit the master document
  *  You should now be able to go to the master repository https://github.com/RichardMorris/SACDungeon/ and edit there.
  *  Commit the changes. Make sure you commit to the *main* branch.

There may be a problem where two different prople try to commit at the same time causing a *conflit* 
this might make it so you can commit a change but not push it to the main branch. Resolving conflicts is an advanced issue.

## Connecting a thind party editor to github

Normally you don't work directly on the github page, but use another application including:
 
* Using *git*  on a command line - this is the basic system that all other programs work with. It is powerful but complex. 
  * Git For Windows: gives a minimal bash commandline that allows git commands https://gitforwindows.org/
  * Linux: `sudo apt install git` will install it
  * Windows subsystem for Linux: we can use this on college PCs, install ubuntu from the Windows store.  
* github desktop a gui app that allows inspection of changes etc. https://desktop.github.com/
* Many Editors come with git as standard, or allow it using a plugin 
  * Eclipse
  * IntelliJ
  * VS Code
  * Atom
  * Visual Studio

Once you have decided on an editor you will use 

* Step 9. Connect your prefered editor to the master repository
  * Install the correct git software for your editor
  * Create a  Personal Access Tokens, a safer versions of a password. Go to https://github.com/settings/tokens, create one with *repo* access 
  * In you app *Checkout* the repository using the the clone url https://github.com/RichardMorris/SACDungeon.git
  * This will require your login credentials and Personal Access Tokens as password
  * If things work fine it should create a new folder with a copy of all the files in this repository

* Step 10. Get the latest version from the repository
  * Use `git pull` to retreive the latest version from the reposity and merge it with your changes
  * Do this regually as problems emerge if your version and the master version differ
  * Here *pull* copies changes from the master into your repository. A *pull request* is asking someone to pull changes from your copy into their version, typicall the master.
 
 * Step 11. Make an edit and push
   * Make an edit to the readme file
   * You may need to stage the file so that git knows its ready to be committed, `git add` can do this or use an IDE tool
   * Commit your change - this updates your local copy of the repository
   * *Push* your change this sends it upto the master repository
   * If all goes well your change appears, you might get some failures, a message "not fast forward" means you probably need to do a `git pull` first
   * You can do multiple commits before pushing.
 
   





