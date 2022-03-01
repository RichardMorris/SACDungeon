# SACDungeon

A colaborative text adventure game

We will develope this using GitHub

First read
 https://docs.replit.com/tutorials/06-github-and-run-button
 
* Step 1. Create a github account.
 
* Step 2. In GitHub go to 
https://github.com/RichardMorris/SACDungeon

* Step 3. In the top right corner, press the Fork button to create a copy of the project in your own GitHub account.

  * This will make your own copy of the code.

* Step 4. Add your name to the list below, use the pencil icon in the top right to do it

1. Richard Morris - grand wizard
2. Paddy-Shaw

* Step 5. *Commit and Push* 

The procedure here depends on the editor you are using. 
If on GitHub at the bottom of the edit page there is a box to Commit pages. Fill in details and press Commit changes.

* Step 6. Create a pull request in github
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

Normally you don't work directly on the github page, but use another application possible methods include

* The *git* command line - this is the basic system that all other programs work with, It is powerful but complex for elightment see https://stevelosh.com/blog/2013/04/git-koans/
* git bash, a minimal bash commandline that allows git commands https://gitforwindows.org/
* github desktop a gui app that allows inspection of changes etc. https://desktop.github.com/
* Many Editors come with git as standard, or allow it using a plugin 
  * Eclipse
  * IntelliJ
  * VSCOde
  * Atom
  * Visual Studio

Once you have decided on an editor you will use 

* Step 9. Connect your prefered editor to the master repository
  * Install the correct git software for your editor
  * *Checkout* the repository using the the clone url https://github.com/RichardMorris/SACDungeon.git
  * This will require your login credentials, normal passwords have problems to instead git hub use
  * Personal Access Tokens https://github.com/settings/tokens these control access rights and are time limited, use this instrad of a password
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
 
   





